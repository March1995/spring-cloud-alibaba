package com.tuling.mapper;

import com.tuling.entity.PayInfo;

public interface PayInfoMapper {

    PayInfo selectPayInfoByOrderNo(String orderNo);
}
