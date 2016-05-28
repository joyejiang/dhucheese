package com.cheese.ssh.serviceImpl;

import java.util.List;
import java.util.Map;
import org.hibernate.HibernateException;
import com.cheese.ssh.beans.Task;
import com.cheese.ssh.dao.ITaskDao;
import com.cheese.ssh.service.ITaskManagerService;
import com.opensymphony.xwork2.ActionContext;

public class TaskManagerServiceImpl implements ITaskManagerService{
	
	private ITaskDao taskDao;
	private Map<String,Object> session;

	@Override
	public List<Task> findAllTask() {
		return taskDao.findAllTask();
	}

	/* getter and setter */
	public ITaskDao getTaskDao() {
		return taskDao;
	}

	public void setTaskDao(ITaskDao taskDao) {
		this.taskDao = taskDao;
	}

	@Override
	public Task findTask(Integer id) {
		return taskDao.findTaskById(id);
	}
	
	/*我的任务 */
	@Override
	public String mytask(Task task) {
		// TODO Auto-generated method stub
		/*return taskDao.findTask(task);*/
		Task newtask = null;
		newtask = taskDao.findTask(task);
		if(newtask != null){
			session = ActionContext.getContext().getSession();//获取session对象
			session.put("taskname", newtask.getTaskName());//将任务名保存在session中
			
			Integer type=newtask.getType();
			String tasktype = null;
			switch(type){
				case 1:tasktype="创意类";break;
				case 2:tasktype="实物类";break;
				case 3:tasktype="教学类";break;
			}
			session.put("tasktype", tasktype);
			
			session.put("description", newtask.getDescription());
			session.put("price", newtask.getPrice());
			session.put("deadline", newtask.getDeadline());
			/*String a=(String) session.put("description", newtask.getDescription());
			System.out.println(100+a);*/
			Integer status= newtask.getStatus();
			System.out.println(50+status);
			String taskstatus;
			switch(type){
				case 1:taskstatus="正在进行中";break;
				case 2:taskstatus="已失效";break;
				default:taskstatus="无效";break;
			}
			session.put("status", taskstatus);
			
			
			
			return "success";
		}
		return "error";        
	} 

}
