package com.cheese.ssh.service;

import java.util.List;

import com.cheese.ssh.beans.Task;

public interface ITaskManagerService {
	
	List<Task> findAllTask();

	Task findTask(Integer id);

	String mytask(Task task);
}
