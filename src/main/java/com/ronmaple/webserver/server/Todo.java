package com.ronmaple.webserver.server;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity(name="Todo")
public class Todo {

    @Id
    @SequenceGenerator(
            name = "todo_sequence",
            sequenceName = "todo_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "todo_sequence"
    )
    private Long id;

    @Column(
            name = "content",
            columnDefinition = "TEXT"
    )
    private String content;

    @Column(
            name = "completed",
            updatable = false,
            columnDefinition = "BOOLEAN"
    )
    private Boolean completed;

    @CreationTimestamp
    @Column(
            name = "created_at",
            columnDefinition = "DATE"
    )
    private LocalDateTime createdAt;


    public Todo(String content) {
        this.content = content;
        this.completed = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
