package com.xzh.dao;

import com.xzh.model.TrainTraveller;
import com.xzh.model.TrainTravellerExample;

public interface TrainTravellerMapper {
    int deleteByExample(TrainTravellerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainTraveller record);

    int insertSelective(TrainTraveller record);

    TrainTraveller selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrainTraveller record);

    int updateByPrimaryKey(TrainTraveller record);
}