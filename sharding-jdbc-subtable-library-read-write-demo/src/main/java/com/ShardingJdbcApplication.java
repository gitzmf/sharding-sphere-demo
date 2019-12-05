package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zmf
 * @version 1.0
 * @ClassName ShardingJdbcApplication
 * @Description: 基于Sharding Jdbc的主启动应用--读写分离+分库分表
 * @date 2019/12/4 22:29
 */
@SpringBootApplication
@MapperScan(value = "com.mapper")
public class ShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcApplication.class, args);
    }
}
