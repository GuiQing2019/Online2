package com.hualixy.system2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;


@SpringBootApplication
@EnableEurekaClient
public class System2Application {

private static final Logger LOG= LoggerFactory.getLogger(System2Application.class);


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(System2Application.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功!");
        LOG.info("System地址：\t127.0.0.1:{}",env.getProperty("server.port"));
    }

}
