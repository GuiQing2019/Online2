package com.hualixy.eureka2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;


@SpringBootApplication
@EnableEurekaServer
public class Eureka2Application {

private static final Logger LOG= LoggerFactory.getLogger(Eureka2Application.class);

    /*public static void main(String[] args) {
        SpringApplication.run(Eureka2Application.class, args);
        LOG.info("启动成功！");
    }*/

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Eureka2Application.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功!");
        LOG.info("Eureka地址：\t127.0.0.1:{}",env.getProperty("server.port"));
    }

}
