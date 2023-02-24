package com.xiaohu.utils;

import com.xiaohu.entity.TimeConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Component
@Slf4j
public class TimeRoutePredicateFactory extends AbstractRoutePredicateFactory<TimeConfig> {


    public TimeRoutePredicateFactory() {
        super(TimeConfig.class);
    }

    @Override
    public Predicate<ServerWebExchange> apply(TimeConfig config) {
        return null;
    }
    public List<String> shortcutFieldOrder(){
        return Arrays.asList("startTime","endTime");
    }
}
