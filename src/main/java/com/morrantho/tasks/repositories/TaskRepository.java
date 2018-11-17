package com.morrantho.tasks.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.morrantho.tasks.models.Task;

@Repository
public interface TaskRepository extends CrudRepository< Task, Long >{
	Optional<Task> findById( Long id );
}
