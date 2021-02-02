package wen.magic.demo.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.ssssssss.magicapi.config.MagicDynamicDataSource;

/** Created by yuting on 2021/1/26 15:28 */
// 多数据源的配置
@Configuration
public class DataSourceConfig {

  @Primary
  @Bean(name = "magic")
  @Qualifier("magic")
  @ConfigurationProperties(prefix = "spring.datasource.magic")
  public DataSource magicDataSource() {
    return DataSourceBuilder.create().build();
  }

  @Bean(name = "pm")
  @Qualifier("pm")
  @ConfigurationProperties(prefix = "spring.datasource.pm")
  public DataSource pmDataSource() {
    return DataSourceBuilder.create().build();
  }

  @Bean
  public MagicDynamicDataSource magicDynamicDataSource() {
    MagicDynamicDataSource dynamicDataSource = new MagicDynamicDataSource();
    dynamicDataSource.setDefault(magicDataSource());
    dynamicDataSource.add("pm", pmDataSource());
    return dynamicDataSource;
  }
}
