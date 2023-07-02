package com.xzh.seatDao;

import com.xzh.model.TrainSeat;
import com.xzh.model.TrainSeatExample;

public interface TrainSeatMapper {
    int deleteByExample(TrainSeatExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainSeat record);

    int insertSelective(TrainSeat record);

    TrainSeat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrainSeat record);

    int updateByPrimaryKey(TrainSeat record);
}