package com.Semafoor.ToDoList.Repository;

import com.Semafoor.ToDoList.Model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/*
The TodoRepository is similar to the BoodschapRepository.
 */

@RepositoryRestResource(path = "ToDo")
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
    List<ToDo> findAllByOrderByCompletedAsc();
}
