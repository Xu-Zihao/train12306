package com.xzh.orderDao;

import com.xzh.model.TrainOrder;
import com.xzh.model.TrainOrderExample;

public interface TrainOrderMapper {
    int deleteByExample(TrainOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainOrder record);

    int insertSelective(TrainOrder record);

    TrainOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrainOrder record);

    int updateByPrimaryKey(TrainOrder record);
}