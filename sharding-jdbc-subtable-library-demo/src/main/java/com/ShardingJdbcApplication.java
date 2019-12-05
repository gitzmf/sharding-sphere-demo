package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zmf
 * @version 1.0
 * @ClassName ShardingJdbcApplication
 * @Description: Sharding Jdbc 主应用 --进行水平分库分表
 * @date 2019/12/3 17:36
 */
@SpringBootApplication
@MapperScan(value = "com.mapper")
public class ShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcApplication.class, args);
    }
}
