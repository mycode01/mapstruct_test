package com.example.mappertest.when.usemapper;

import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

  @Bean
  public MessageMapper messageMapper() {
    return Mappers.getMapper(MessageMapper.class);
  }

}
