package com.example.mappertest.when.vanilla;

public interface Assembler<I, O> {

  O assemble(I source);
}
