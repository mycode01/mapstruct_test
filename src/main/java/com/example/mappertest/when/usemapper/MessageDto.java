package com.example.mappertest.when.usemapper;

public class MessageDto {
  private final String from;
  private final String to;
  private final String body;
  private final String messageType;

  public MessageDto(String from, String to, String body, String messageType) {
    this.from = from;
    this.to = to;
    this.body = body;
    this.messageType = messageType;
  }
//
//  public String from() {
//    return from;
//  }
//
//  public String to() {
//    return to;
//  }
//
//  public String body() {
//    return body;
//  }
//
//  public String messageType() {
//    return messageType;
//  }
// mapStruct 사용시 자바 빈 규약의 네이밍을 강제함
//  이를 비켜가기 위해서 엑세서네이전략을 생성하여 알려줘야함
//  또한 이는 규약화 되어버리기 때문에 영..

  public String getFrom() {
    return from;
  }

  public String getTo() {
    return to;
  }

  public String getBody() {
    return body;
  }

  public String getMessageType() {
    return messageType;
  }

  @Override
  public String toString() {
    return "MessageDto{" +
        "from='" + from + '\'' +
        ", to='" + to + '\'' +
        ", body='" + body + '\'' +
        ", messageType='" + messageType + '\'' +
        '}';
  }
}
