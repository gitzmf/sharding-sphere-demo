package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zmf
 * @version 1.0
 * @ClassName ShardingJdbcApplication
 * @Description: Sharding Jdc 主启动应用--分表+读写分离
 * @date 2019/12/4 17:41
 */
@SpringBootApplication
@MapperScan(value = "com.mapper")
public class ShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcApplication.class, args);
    }
}
