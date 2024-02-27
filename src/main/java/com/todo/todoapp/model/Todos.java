package com.todo.todoapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data // use to create getter and setter
@AllArgsConstructor  // all agrument contractor
@NoArgsConstructor  // no agrument contractor
@Table(name = "Todos_app")
public class Todos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String todo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
}
