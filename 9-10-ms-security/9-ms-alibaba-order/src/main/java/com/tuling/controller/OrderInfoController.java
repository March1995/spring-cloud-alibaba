package com.tuling.controller;

import com.tuling.entity.OrderInfo;
import com.tuling.mapper.OrderInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/order")
public class OrderInfoController {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @RequestMapping("/selectOrderInfoById/{orderNo}")
    public Object selectOrderInfoById(@PathVariable("orderNo") String orderNo, @AuthenticationPrincipal String userName) {
        log.info("userName:{}", userName);
        OrderInfo orderInfo = orderInfoMapper.selectOrderInfoByIdAndUserName(orderNo, userName);
        if (null == orderInfo) {
            return "根据orderNo:" + orderNo + "查询没有该订单";
        }
        return orderInfo;
    }

    @RequestMapping("/saveOrder")
    public Object saveOrder(@RequestBody OrderInfo orderInfo) {
        log.info("保存订单:{}", orderInfo.toString());
        return orderInfo;
    }


}
