package com.todo.todoapp.controller;

import com.todo.todoapp.model.Todos;
import com.todo.todoapp.service.TodoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TodoController {

    @Autowired
    private TodoServiceImp service;

    @PostMapping("/createtodo")
    public Todos createnewtodo(@RequestBody Todos todo){
        return service.createTodo(todo);
    }

}
