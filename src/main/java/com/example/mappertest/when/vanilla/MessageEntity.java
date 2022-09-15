package com.example.mappertest.when.vanilla;

import java.time.LocalDateTime;

public class MessageEntity {

  private Long id;
  private String from;
  private String to;
  private String body;
  private MessageType type;
  private LocalDateTime createdAt;

  public MessageEntity(String from, String to, String body, MessageType type) {
    this.from = from;
    this.to = to;
    this.body = body;
    this.type = type;
  }

  public Long id() {
    return id;
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

  public MessageType type() {
    return type;
  }

  public LocalDateTime createdAt() {
    return createdAt;
  }

  @Override
  public String toString() {
    return "MessageEntity{" +
        "id=" + id +
        ", from='" + from + '\'' +
        ", to='" + to + '\'' +
        ", body='" + body + '\'' +
        ", type=" + type +
        ", createdAt=" + createdAt +
        '}';
  }

  public enum MessageType {
    HTML, TEXT
  }
}
