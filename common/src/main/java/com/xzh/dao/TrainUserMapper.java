package com.xzh.dao;

import com.xzh.model.TrainUser;
import com.xzh.model.TrainUserExample;

public interface TrainUserMapper {
    int deleteByExample(TrainUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainUser record);

    int insertSelective(TrainUser record);

    TrainUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrainUser record);

    int updateByPrimaryKey(TrainUser record);
}