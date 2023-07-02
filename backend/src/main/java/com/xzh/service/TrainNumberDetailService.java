package com.xzh.service;

import com.xzh.dao.TrainNumberDetailMapper;
import com.xzh.dao.TrainNumberMapper;
import com.xzh.dao.TrainStationMapper;
import com.xzh.exception.BusinessException;
import com.xzh.model.TrainNumber;
import com.xzh.model.TrainNumberDetail;
import com.xzh.param.TrainNumberDetailParam;
import com.xzh.util.BeanValidator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author name
 * @Date 2023/6/22 10:39
 * @Version 1.0
 * @Description:
 */
@Service
public class TrainNumberDetailService {

    @Resource
    private TrainNumberDetailMapper trainNumberDetailMapper;
    @Resource
    private TrainNumberMapper trainNumberMapper;
    @Resource
    private TrainStationService trainStationService;


    public List<TrainNumberDetail> getAll(){
        return trainNumberDetailMapper.getAll();
    }

    public void save(TrainNumberDetailParam param){
        BeanValidator.check(param);
        TrainNumber trainNumber = trainNumberMapper.selectByPrimaryKey(param.getTrainNumberId());
        if(trainNumber == null){
            throw new BusinessException("车次详情对应的车次不存在");
        }
        List<TrainNumberDetail> detailList = trainNumberDetailMapper.getByTrainNumberId(param.getTrainNumberId());
        TrainNumberDetail trainNumberDetail = TrainNumberDetail.builder()
                .trainNumberId(param.getTrainNumberId())
                .fromStationId(param.getFromStationId())
                .toStationId(param.getToStationId())
                .stationIndex(detailList.size())
                .relativeMinute(param.getRelativeMinute())
                .waitMinute(param.getWaitMinute())
                .money(param.getMoney())
                .fromCityId(trainStationService.getCityIdByStationId(param.getFromStationId()))
                .toCityId(trainStationService.getCityIdByStationId(param.getToStationId()))
                .build();
        trainNumberDetailMapper.insertSelective(trainNumberDetail);
        if(param.getEnd()==1){
            detailList.add(trainNumberDetail);
            trainNumber.setFromStationId(detailList.get(0).getFromStationId());
            trainNumber.setFromCityId(detailList.get(0).getFromCityId());
            trainNumber.setToStationId(detailList.get(detailList.size()-1).getToStationId());
            trainNumber.setToCityId(detailList.get(detailList.size()-1).getToCityId());
            trainNumberMapper.updateByPrimaryKeySelective(trainNumber);

            //todo 考虑用户前台查询两个站点之间的所有车次
        }

    }

    public void delete(int id){
        trainNumberDetailMapper.deleteByPrimaryKey(id);
    }
}
