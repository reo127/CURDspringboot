package com.todo.todoapp.service;

import com.todo.todoapp.model.Todos;
import com.todo.todoapp.repositary.TodoRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImp implements TodoService {

    @Autowired
    private TodoRepositary todoRepositary;

    @Override
    public Todos createTodo(Todos todo) {
        Todos newtodo = todoRepositary.save(todo);
        return newtodo;
    }

    @Override
    public List<Todos> getAllTodos() {
        List<Todos> alltodos = todoRepositary.findAll();
        return alltodos;
    }

    @Override
    public Todos getTodoById(int id) {
        return null;
    }

    @Override
    public Todos updateTodo(int id, String todo) {
        return null;
    }

    @Override
    public String deleteTodo(int id) {
        return null;
    }
}
