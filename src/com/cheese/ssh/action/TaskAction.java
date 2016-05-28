package com.cheese.ssh.action;

import java.util.List;

import com.cheese.ssh.beans.Task;
import com.cheese.ssh.service.ITaskManagerService;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

public class TaskAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//任务列表结果集
	private List<Task> taskList;
	//任务管理服务
	private ITaskManagerService taskManager;
	//JSON结果集
	private JSONArray result;
	//任务
	private Task task;
	//任务ID
	private Integer id;
	
	public String newtask(){
		try{
			/*System.out.println(task.getDescription());
			System.out.println(task.getImage());
			System.out.println(task.getTaskName());

			System.out.println(task.getDeadline());
			System.out.println(task.getPrice());
			System.out.println(task.getId());
			System.out.println(task.getRelease());*/
			//taskManager.setTask(task);  
			return SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
	}
	
	/*查询所有的任务*/
	public String findAllTask(){
		taskList = taskManager.findAllTask();
		result = JSONArray.fromObject(taskList);
		return SUCCESS;
	}
	
	/*查询某一个任务的详细情况*/
	public String taskView(){
		task = taskManager.findTask(id);
		return SUCCESS;
	}
	
	/* getter and setter functions*/	

	public ITaskManagerService getTaskManager() {
		return taskManager;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

	public void setTaskManager(ITaskManagerService taskManager) {
		this.taskManager = taskManager;
	}

	public JSONArray getResult() {
		return result;
	}

	public void setResult(JSONArray result) {
		this.result = result;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
