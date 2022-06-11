package com.tuling.mapper;

import com.tuling.entity.ProductInfo;

public interface ProductInfoMapper {

    ProductInfo selectProductInfoById(String productNo);
}
