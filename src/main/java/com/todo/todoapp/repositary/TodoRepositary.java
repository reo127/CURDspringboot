package com.todo.todoapp.repositary;

import com.todo.todoapp.model.Todos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepositary extends JpaRepository<Todos, Integer> {
}
