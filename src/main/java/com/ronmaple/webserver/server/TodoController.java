package com.ronmaple.webserver.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
