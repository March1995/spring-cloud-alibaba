package com.tuling.controller;

import com.tuling.mapper.PayInfoMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PayInfoController {


    @Resource
    private PayInfoMapper payInfoMapper;

    @RequestMapping("/selectPayInfoByOrderNo/{orderNo}")
    public Object selectPayInfoByOrderNo(@PathVariable("orderNo") String orderNo) {
        return payInfoMapper.selectPayInfoByOrderNo(orderNo);
    }
}
