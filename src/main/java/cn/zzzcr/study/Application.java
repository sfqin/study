package cn.zzzcr.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.zzzcr.study.dao.mapper")
public class Application {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(Application.class);

        app.run(args);
    }
}
