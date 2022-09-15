package com.example.mappertest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.mappertest.when.vanilla.Assembler;
import com.example.mappertest.when.vanilla.MessageDto;
import com.example.mappertest.when.vanilla.MessageEntity;
import com.example.mappertest.when.vanilla.MessageEntity.MessageType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ManualMappingTest {

  @Autowired
  Assembler<MessageDto, MessageEntity> toEntity;
  @Autowired
  Assembler<MessageEntity, MessageDto> toDto;

  @Test
  void test1() {
    var body = "hello world";
    var dto = new MessageDto("void@nowhere.com", "to@nowhere.com", body, "HTML");
    var entity = toEntity.assemble(dto);
    System.out.println(entity);
    assertTrue(body.equals(entity.body()));
  }

  @Test
  void test2() {
    var body = "hello world";
    var entity = new MessageEntity("void@nowhere.com", "to@nowhere.com", body, MessageType.TEXT);
    var dto = toDto.assemble(entity);
    System.out.println(dto);
    assertTrue(body.equals(dto.body()));
  }

}
