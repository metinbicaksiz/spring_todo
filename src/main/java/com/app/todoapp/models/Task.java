package com.app.todoapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public void setTitle(String title) {
        this.title = title;
    }
    public String title;

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean completed;
}
