package io.dony.hycloud.uca;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangdy
 */
@SpringBootApplication
@MapperScan(basePackages = {"io.dony.hycloud.uca.repo"})
public class HyCloudUcaApp {
    public static void main(String[] args) {
        SpringApplication.run(HyCloudUcaApp.class,args);
    }
}
