package com.example.mappertest.when.vanilla;

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

  public String from() {
    return from;
  }

  public String to() {
    return to;
  }

  public String body() {
    return body;
  }

  public String messageType() {
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
