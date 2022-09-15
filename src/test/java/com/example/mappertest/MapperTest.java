package com.example.mappertest;


import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.mappertest.when.usemapper.MessageDto;
import com.example.mappertest.when.usemapper.MessageEntity;
import com.example.mappertest.when.usemapper.MessageEntity.MessageType;
import com.example.mappertest.when.usemapper.MessageMapper;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MapperTest {

  @Autowired
  private MessageMapper messageMapper;

  @Test
  void test1() {
    var body = "hello world";
    var dto = new MessageDto("void@nowhere.com", "exists@nowhere.com", body,
        "HTML");

    var entity = messageMapper.toEntity(dto);
    System.out.println(entity);
    assertTrue(body.equals(entity.body()));
  }

  @Test
  void test2() {
    var body = "hello world";

    var entity = new MessageEntity("void@nowhere.com", "exists@nowhere.com", body,
        MessageType.TEXT);
    var dto = messageMapper.toDto(entity);
    System.out.println(dto);
//    assertTrue(body.equals(dto.getBody())); // getXxx 메소드가 없기때문에 null
    assertTrue(dto.getBody() == null);
  }
}
