package com.xzh.dao;

import com.xzh.model.TrainUserTraveller;
import com.xzh.model.TrainUserTravellerExample;

public interface TrainUserTravellerMapper {
    int deleteByExample(TrainUserTravellerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainUserTraveller record);

    int insertSelective(TrainUserTraveller record);

    TrainUserTraveller selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrainUserTraveller record);

    int updateByPrimaryKey(TrainUserTraveller record);
}