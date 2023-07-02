package com.xzh.dao;

import com.xzh.model.TrainCity;
import com.xzh.model.TrainCityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrainCityMapper {
    int deleteByExample(TrainCityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TrainCity record);

    int insertSelective(TrainCity record);

    TrainCity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TrainCity record);

    int updateByPrimaryKey(TrainCity record);

    List<TrainCity> getAll();

    int countByNameAndId(@Param("name")String name, @Param("trainCityId") Integer TrainCityId);
}