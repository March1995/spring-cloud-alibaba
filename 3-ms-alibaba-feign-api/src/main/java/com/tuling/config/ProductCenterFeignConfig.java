package com.tuling.config;

import com.tuling.handler.TulingRequestInterceptor;
import feign.Contract;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * 这个类上千万不要添加@Configuration,不然会被作为全局配置文件共享
 */
public class ProductCenterFeignConfig {

    /**
     * <p>
     * NONE（默认值）:不记录任何日志
     * BASIC：仅记录请求方法、URL、响应状态代码以及执行时间
     * HEADERS：记录BASIC级别的基础上，记录请求和响应的header
     * FULL：记录所有请求和响应的header、body以及元数据
     * </p>
     *
     * @return
     */
//    @Bean
//    public Logger.Level level() {
//        return Logger.Level.FULL;
//        //return Logger.Level.BASIC;
//    }

    /**
     * 根据SpringBoot自动装配FeignClientsConfiguration 的FeignClient的契约是SpringMvc
     * <p>
     * 通过修改契约为默认的Feign的锲约，那么就可以使用默认的注解
     *
     * @return
     */
    @Bean
    public Contract feiContract() {
        return new Contract.Default();
    }

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new TulingRequestInterceptor();
    }

}
