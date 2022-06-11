package com.tuling.config;

import com.ribbonconfig.GlobalRibbonConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Configuration;

/**
 * ribbon的全局配置
 */
@Configuration
/*@RibbonClients(value = {
        @RibbonClient(name = "product-center",configuration = ProductCenterRibbonConfig.class),
        @RibbonClient(name = "pay-center",configuration = PayCenterRibbonConfig.class)
})*/
@RibbonClients(defaultConfiguration = GlobalRibbonConfig.class)
public class CustomRibbonConfig {

}
