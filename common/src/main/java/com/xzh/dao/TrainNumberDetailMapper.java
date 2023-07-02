package com.xzh.dao;

import com.xzh.model.TrainNumberDetail;
import com.xzh.model.TrainNumberDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrainNumberDetailMapper {
    int deleteByExample(TrainNumberDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TrainNumberDetail record);

    int insertSelective(TrainNumberDetail record);

    TrainNumberDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TrainNumberDetail record);

    int updateByPrimaryKey(TrainNumberDetail record);

    List<TrainNumberDetail> getAll();

    List<TrainNumberDetail> getByTrainNumberId(@Param("trainNumberId") Integer trainNumberId);
}