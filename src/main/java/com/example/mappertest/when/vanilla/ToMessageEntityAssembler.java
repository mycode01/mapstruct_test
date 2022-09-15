package com.example.mappertest.when.vanilla;

import com.example.mappertest.when.vanilla.MessageEntity.MessageType;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Component
public class ToMessageEntityAssembler implements Assembler<MessageDto, MessageEntity> {

  @Override
  public MessageEntity assemble(MessageDto source) {
    return new MessageEntity(source.from(), source.to(), source.body(),
        MessageType.valueOf(source.messageType()));
  }
}
