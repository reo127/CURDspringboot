package com.todo.todoapp.service;

import com.todo.todoapp.model.Todos;

import java.util.List;

public interface TodoService {
    public Todos createTodo();
    public List<Todos> getAllTodos();
    public Todos getTodoById(int id);
    public Todos updateTodo(int id, String todo);
    public String deleteTodo(int id);
}
