package com.example.mockitotut01.data.stub.business;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;
import com.example.business.TodoBusinessImpl;
import com.example.data.api.TodoService;
import com.example.mockitotut01.data.stub.TodoServiceStub;

public class TodoBusinessImplStubTest {

  @Test
  public void usingAStub() {
    TodoService todoService = new TodoServiceStub();
    TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
    List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Duke");
    assertEquals(2, todos.size());
  }
}
