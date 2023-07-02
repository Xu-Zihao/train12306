package com.xzh.dao;

import com.xzh.model.TrainStation;
import com.xzh.model.TrainStationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrainStationMapper {
    int deleteByExample(TrainStationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TrainStation record);

    int insertSelective(TrainStation record);

    TrainStation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TrainStation record);

    int updateByPrimaryKey(TrainStation record);

    List<TrainStation> getAll();

    int countByIdAndNameAndCityId(@Param("name")String name, @Param("stationId") Integer id, @Param("cityId") Integer cityId);


}