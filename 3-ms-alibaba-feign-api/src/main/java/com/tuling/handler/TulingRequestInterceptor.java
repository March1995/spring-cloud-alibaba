package com.tuling.handler;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.UUID;

public class TulingRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        template.header("token", UUID.randomUUID().toString());
    }
}
