package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zmf
 * @version 1.0
 * @ClassName ShardingJdbcApplication
 * @Description: Sharding Jdbc主应用--读写分离
 * @date 2019/12/4 14:47
 */
@SpringBootApplication
@MapperScan(value = "com.mapper")
public class ShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcApplication.class, args);
    }
}
