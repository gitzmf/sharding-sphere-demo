package com;
import	java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zmf
 * @version 1.0
 * @ClassName ShardingJdbcApplication
 * @Description: Sharding Jdbc的主启动应用--分表不分库
 * @date 2019/12/4 16:03
 */
@SpringBootApplication
@MapperScan(value = "com.mapper")
public class ShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcApplication.class, args);
    }
}
