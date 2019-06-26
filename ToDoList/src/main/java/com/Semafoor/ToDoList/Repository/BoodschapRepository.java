package com.Semafoor.ToDoList.Repository;

import com.Semafoor.ToDoList.Model.Boodschap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/*
The BoodschapRepository interface is annotated with @RepositoryRestResource from the Spring Data Rest api.
This annotation directs the Spring MVC to create REST endpoints at /boodschap (in this case api/boodschap, see the
properties file in the resources folder).

This interface extends the JpaRepository generic interface from the Spring JPA libraries. The JpaRepository interface
provides methods to perform basic crud operations. Extending this interface wil allow the BoodschapRepository to handle
boodschap transactions through for example http requests.

I added one additional method to find boodschap items ordered by their completed status.
 */

@RepositoryRestResource(path = "boodschap")
public interface BoodschapRepository extends JpaRepository<Boodschap, Long> {
    List<Boodschap> findAllByOrderByCompletedAsc();
}
