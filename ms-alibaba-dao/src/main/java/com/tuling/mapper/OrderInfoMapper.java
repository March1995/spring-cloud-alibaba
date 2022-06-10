package com.tuling.mapper;

import com.tuling.entity.OrderInfo;
import org.apache.ibatis.annotations.Param;

public interface OrderInfoMapper {

    OrderInfo selectOrderInfoById(String orderNo);

    OrderInfo selectOrderInfoByIdAndUserName(@Param("orderNo") String orderNo, @Param("userName") String userName);

    int insertOrder(OrderInfo orderInfo);
}
