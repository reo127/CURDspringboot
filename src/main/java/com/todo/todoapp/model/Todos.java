package com.todo.todoapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

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

//    @Temporal(TemporalType.TIMESTAMP)
//    private Date date;

//    @Column(name = "created_date", nullable = false) // Renamed for clarity and consistency
    @Temporal(TemporalType.DATE) // Specify temporal type for persistence
    private LocalDate createdDate;

    @PrePersist // Trigger before persisting an entity
    public void prePersist() {
        createdDate = LocalDate.now(); // Set current date and time
    }
}
