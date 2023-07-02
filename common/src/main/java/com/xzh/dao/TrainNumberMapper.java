package com.xzh.dao;

import com.xzh.model.TrainNumber;
import com.xzh.model.TrainNumberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrainNumberMapper {
    int deleteByExample(TrainNumberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TrainNumber record);

    int insertSelective(TrainNumber record);

    TrainNumber selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TrainNumber record);

    int updateByPrimaryKey(TrainNumber record);

    List<TrainNumber> getAll();

    TrainNumber findByName(@Param("name") String name);
}