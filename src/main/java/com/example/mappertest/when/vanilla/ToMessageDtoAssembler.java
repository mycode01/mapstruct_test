package com.example.mappertest.when.vanilla;

import com.example.mappertest.when.vanilla.MessageEntity.MessageType;
import org.springframework.stereotype.Component;

@Component
public class ToMessageDtoAssembler implements Assembler<MessageEntity, MessageDto> {

  @Override
  public MessageDto assemble(MessageEntity source) {
    return new MessageDto(source.from(), source.to(), source.body(), source.type().name());
  }
}
