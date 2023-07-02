package com.xzh.service;

import com.xzh.dao.TrainCityMapper;
import com.xzh.dao.TrainStationMapper;
import com.xzh.exception.BusinessException;
import com.xzh.model.TrainCity;
import com.xzh.model.TrainStation;
import com.xzh.param.TrainStationParam;
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
public class TrainStationService {

    @Resource
    private TrainStationMapper trainStationMapper;
    @Resource
    private TrainCityMapper trainCityMapper;

    public List<TrainStation> getAll(){
        return trainStationMapper.getAll();
    }

    public void save(TrainStationParam param){
        BeanValidator.check(param);
        TrainCity trainCity = trainCityMapper.selectByPrimaryKey(param.getCityId());
        if(trainCity == null){
            throw new BusinessException("该站点所属城市不存在");
        }
        if(checkExist(param.getName(),param.getId(),param.getCityId())){
            throw new BusinessException("该城市下存在相同名称的站点");
        }
        TrainStation trainStation = TrainStation.builder().name(param.getName()).cityId(param.getCityId()).build();
        trainStationMapper.insertSelective(trainStation);
    }

    public void update(TrainStationParam param){
        BeanValidator.check(param);
        TrainCity trainCity = trainCityMapper.selectByPrimaryKey(param.getCityId());
        if(trainCity == null){
            throw new BusinessException("该站点所属城市不存在");
        }
        if(checkExist(param.getName(),param.getId(),param.getCityId())){
            throw new BusinessException("该城市下存在相同名称的站点");
        }
        TrainStation before = trainStationMapper.selectByPrimaryKey(param.getId());
        if(before == null){
            throw new BusinessException("待更新的站点不存在");
        }
        TrainStation trainStation = TrainStation.builder().id(param.getId()).name(param.getName()).cityId(param.getCityId()).build();
        trainStationMapper.updateByPrimaryKeySelective(trainStation);
    }

    public Integer getCityIdByStationId(int stationId){
        TrainStation trainStation = trainStationMapper.selectByPrimaryKey(stationId);
        if(trainStation == null){
            throw new BusinessException("站点不存在");
        }
        return trainStation.getCityId();
    }

    private boolean checkExist(String name, Integer stationId, Integer cityId){
        return trainStationMapper.countByIdAndNameAndCityId(name,stationId,cityId)>0;
    }

}
