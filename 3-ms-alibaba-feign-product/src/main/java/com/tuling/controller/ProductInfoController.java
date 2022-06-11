package com.tuling.controller;

import com.tuling.entity.ProductInfo;
import com.tuling.feignapi.productcenter.ProductCenterFeignApi;
import com.tuling.mapper.ProductInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class ProductInfoController implements ProductCenterFeignApi {

    @Resource
    private ProductInfoMapper productInfoMapper;

    @Override
    @RequestMapping("/selectProductInfoById/{productNo}")
    public ProductInfo selectProductInfoById(@PathVariable("productNo") String productNo) {
        log.info("我被调用了");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ProductInfo productInfo = productInfoMapper.selectProductInfoById(productNo);
        return productInfo;
    }

    @Override
    @RequestMapping("/getToken4Header")
    public String getToken4Header(@RequestHeader("token") String token) {
        log.info("token:{}", token);
        return token;
    }
}
