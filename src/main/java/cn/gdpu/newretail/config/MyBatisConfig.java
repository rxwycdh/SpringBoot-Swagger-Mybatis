package cn.gdpu.newretail.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @FileName MyBatisConfig
 * @Description
 * @Author jiuhao
 * @Date 2020/3/12 11:03
 * @Modified
 * @Version 1.0
 */
@MapperScan("cn.gdpu.newretail.mapper")
@Configuration
public class MyBatisConfig {
}
