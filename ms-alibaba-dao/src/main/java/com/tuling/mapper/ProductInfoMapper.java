package com.tuling.mapper;

import com.tuling.entity.ProductInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInfoMapper {

    ProductInfo selectProductInfoById(String productNo);
}
