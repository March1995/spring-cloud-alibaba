package com.tuling.controller;

import com.tuling.entity.ProductInfo;
import com.tuling.mapper.ProductInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductInfoController {


    @Autowired
    private ProductInfoMapper productInfoMapper;

    @GetMapping("/selectProductInfoById/{productNo}")
    public ProductInfo selectProductInfoById(@PathVariable("productNo") String productNo) {

        ProductInfo productInfo = productInfoMapper.selectProductInfoById(productNo);
        return productInfo;
    }
}
