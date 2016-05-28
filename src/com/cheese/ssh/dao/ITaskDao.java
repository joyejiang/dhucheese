package com.cheese.ssh.dao;

import java.util.List;

import com.cheese.ssh.beans.Task;
import com.cheese.ssh.beans.User;

public interface ITaskDao {
	
	List<Task> findAllTask();

	Task findTaskById(Integer id);

	Task findTask(Task task);

}
