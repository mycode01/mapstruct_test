package com.example.mappertest.when.usemapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface MessageMapper {

  @Mappings({
      @Mapping(source = "dto.messageType", target = "type")
  })
  MessageEntity toEntity(MessageDto dto);
  MessageDto toDto(MessageEntity entity);
}
