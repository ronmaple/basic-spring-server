package com.ronmaple.webserver.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class TodoController {
    private TodoService todoService;

    @Autowired
    private TodoController(TodoService todoService) {
        this.todoService = todoService;
    }


    @GetMapping("/todos")
    public List<Todo> get() {
        System.out.println("GET /todos");
        return todoService.findAll();
    }

    // TODO: validate RequestBody
    @PostMapping("/todos")
    public ResponseEntity<Todo> create(@RequestBody Map<String, Object> body) {
        System.out.println("POST /todos");
        System.out.print(body);
        String content = (String) body.get("content");
        Todo todo = todoService.save(content);
        return ResponseEntity.ok(todo);
    }
}
