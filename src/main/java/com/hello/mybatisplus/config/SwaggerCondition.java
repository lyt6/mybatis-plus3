package com.hello.mybatisplus.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Arrays;

@Slf4j
public class SwaggerCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        log.info("spring.actives.profile:{}",conditionContext.getEnvironment().getActiveProfiles());
        return Arrays.stream(conditionContext.getEnvironment().getActiveProfiles()).anyMatch(a->!a.equals("prod"));
    }
}
