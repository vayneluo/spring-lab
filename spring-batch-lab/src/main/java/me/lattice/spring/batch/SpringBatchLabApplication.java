package me.lattice.spring.batch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "me.lattice.spring.batch.mapper")
@EnableBatchProcessing
@SpringBootApplication
public class SpringBatchLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchLabApplication.class, args);
    }

}
