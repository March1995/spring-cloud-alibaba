package com.tuling.handler;

import com.alibaba.csp.sentinel.adapter.servlet.callback.RequestOriginParser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

@Component
@Slf4j
public class TulingRequestOriginParse implements RequestOriginParser {

    @Override
    public String parseOrigin(HttpServletRequest request) {
        String origin = request.getHeader("origin");
        if (StringUtils.isEmpty(origin)) {
            log.warn("origin must not null");
            throw new IllegalArgumentException("request origin must not null");
        }
        return origin;
    }
}
