package com.bootx.config;

import org.flowable.ui.modeler.properties.FlowableModelerAppProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlowableConfig {
    

    @Bean
    public FlowableModelerAppProperties flowableModelerAppProperties(){
        FlowableModelerAppProperties flowableModelerAppProperties = new FlowableModelerAppProperties();
        return flowableModelerAppProperties;

    }

}
