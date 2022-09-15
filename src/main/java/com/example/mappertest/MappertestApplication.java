package com.example.mappertest;

import com.example.mappertest.when.usemapper.MessageDto;
import com.example.mappertest.when.usemapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MappertestApplication {

  public static void main(String[] args) {
    SpringApplication.run(MappertestApplication.class, args);
  }

}
