package com.bootx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(
  exclude = {SecurityAutoConfiguration.class}
)
@ComponentScan(basePackages = {
  "com.bootx",
  "org.flowable.ui.modeler",
  "org.flowable.ui.common"
})
public class BootxFlowableApplication {

  public static void main(String[] args) {
    SpringApplication.run(BootxFlowableApplication.class, args);
  }

}
