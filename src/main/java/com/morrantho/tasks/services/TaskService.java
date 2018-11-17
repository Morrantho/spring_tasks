package com.morrantho.tasks.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.morrantho.tasks.models.Task;
import com.morrantho.tasks.repositories.TaskRepository;

@Service
public class TaskService {
	private TaskRepository taskRepository;
	
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	public Task create( Task task ){
		return taskRepository.save( task );
	}
	
	public ArrayList< Task > all(){
		return  ( ArrayList<Task> ) taskRepository.findAll();
	}
	
	public Task find( Long id ) {
		Optional<Task> task = taskRepository.findById(id);
		if( task.isPresent() ) return task.get();
		return null;
	}
	
	public Task update( Task task ){
		return taskRepository.save( task );
	}

	public void destroy( Long id ) {
		taskRepository.deleteById(id);
	}
}
