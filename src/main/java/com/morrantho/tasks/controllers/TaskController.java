package com.morrantho.tasks.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.morrantho.tasks.models.Task;
import com.morrantho.tasks.services.TaskService;

@Controller
@RequestMapping("/tasks")
public class TaskController {
	private TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping("")
	@ResponseBody
	public ArrayList< Task > tasks() {
		return taskService.all();
	}
	
	@GetMapping("{taskId}")
	@ResponseBody
	public Task tasks( @PathVariable("taskId") Long taskId ) {
		return taskService.find(taskId);
	}	
}
