package com.ribbonconfig;

import com.netflix.loadbalancer.IRule;
import com.tuling.myrule.TheSameClusterPriorityWithVersionRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalRibbonConfig {

    @Bean
    public IRule theSameClusterPriorityRule() {
        //return new TulingWeightedRule();
        //return new TheSameClusterPriorityRule();
        return new TheSameClusterPriorityWithVersionRule();
    }
}
