package com.xzh.service;

import com.xzh.common.TrainType;
import com.xzh.dao.TrainNumberMapper;
import com.xzh.exception.BusinessException;
import com.xzh.model.TrainNumber;
import com.xzh.param.TrainNumberParam;
import com.xzh.util.BeanValidator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author name
 * @Date 2023/6/22 10:40
 * @Version 1.0
 * @Description:
 */
@Service
public class TrainNumberService {

    @Resource
    private TrainNumberMapper trainNumberMapper;

    public List<TrainNumber> getAll(){
        return trainNumberMapper.getAll();
    }

    public void save(TrainNumberParam param){
        BeanValidator.check(param);
        TrainNumber before = trainNumberMapper.findByName(param.getName());
        if(before!=null){
            throw new BusinessException("该车次已存在");
        }
        TrainNumber trainNumber = TrainNumber.builder()
                .name(param.getName())
                .trainType(param.getTrainType())
                .type(param.getType().shortValue())
                .seatNum(TrainType.valueOf(param.getTrainType()).getCount())
                .build();
        trainNumberMapper.insertSelective(trainNumber);
    }

    public void update(TrainNumberParam param){
        BeanValidator.check(param);
        TrainNumber before = trainNumberMapper.findByName(param.getName());
        if(before != null && before.getId().intValue() != param.getId().intValue()){
            throw new BusinessException("该车次已经存在");
        }
        //todo 在提交修改时可以考虑seat是否被分配过
        TrainNumber trainNumber = TrainNumber.builder()
                .id(param.getId())
                .name(param.getName())
                .trainType(param.getTrainType())
                .type(param.getType().shortValue())
                .seatNum(TrainType.valueOf(param.getTrainType()).getCount())
                .build();
        trainNumberMapper.updateByPrimaryKeySelective(trainNumber);
    }
}
