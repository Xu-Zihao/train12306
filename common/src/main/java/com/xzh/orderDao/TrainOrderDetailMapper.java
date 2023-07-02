package com.xzh.orderDao;

import com.xzh.model.TrainOrderDetail;
import com.xzh.model.TrainOrderDetailExample;

public interface TrainOrderDetailMapper {
    int deleteByExample(TrainOrderDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainOrderDetail record);

    int insertSelective(TrainOrderDetail record);

    TrainOrderDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrainOrderDetail record);

    int updateByPrimaryKey(TrainOrderDetail record);
}