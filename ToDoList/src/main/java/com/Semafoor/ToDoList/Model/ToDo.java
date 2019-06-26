package com.Semafoor.ToDoList.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/*
This class is similar to the Boodschap class. See Boodschap for more information.
 */

@Entity
@EntityListeners(AuditingEntityListener.class)
public class ToDo extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "toDoSequence")
    @SequenceGenerator(name = "toDoSequence", initialValue = 1, sequenceName = "toDo_seq")
    private Long id;

    private String title;

    private boolean completed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
