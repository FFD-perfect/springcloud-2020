package cn.siwen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurakaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurakaMain7002.class,args);
    }
}
