package com.example.junitbasic.data.api;

import java.util.List;

public interface TodoService {
  public List<String> retrieveTodos(String user);
}
