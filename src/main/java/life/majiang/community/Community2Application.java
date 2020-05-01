package life.majiang.community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "life.majiang.community.mapper")
public class Community2Application {

    public static void main(String[] args) {
        SpringApplication.run(Community2Application.class, args);
    }

}
