package com.tuling.mapper;

import com.tuling.entity.PayInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface PayInfoMapper {

    PayInfo selectPayInfoByOrderNo(String orderNo);
}
