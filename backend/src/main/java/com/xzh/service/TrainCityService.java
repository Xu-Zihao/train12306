package com.xzh.service;

import com.xzh.dao.TrainCityMapper;
import com.xzh.exception.BusinessException;
import com.xzh.model.TrainCity;
import com.xzh.param.TrainCityParam;
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
public class TrainCityService {

    @Resource
    private TrainCityMapper trainCityMapper;

    public List<TrainCity> getAll() {
        return trainCityMapper.getAll();
    }

    public void save(TrainCityParam param) {
        BeanValidator.check(param);
        if (checkExist(param.getName(),param.getId())) {
            throw new BusinessException("存在相同名称的城市");
        }

        TrainCity trainCity = TrainCity.builder().name(param.getName()).build();
        trainCityMapper.insertSelective(trainCity);
    }

    public void update(TrainCityParam param) {
        BeanValidator.check(param);
        if (checkExist(param.getName(),param.getId())) {
            throw new BusinessException("存在相同名称的城市");
        }
        TrainCity before = trainCityMapper.selectByPrimaryKey(param.getId());
        if (before == null) {
            throw new BusinessException("待更新的城市不存在");
        }
        TrainCity trainCity = TrainCity.builder().id(param.getId()).name(param.getName()).build();
        trainCityMapper.updateByPrimaryKeySelective(trainCity);
    }

    private boolean checkExist(String name, Integer trainCityId) {
        return trainCityMapper.countByNameAndId(name, trainCityId) > 0;
    }
}
