package task;

import java.util.Date;
import timeStamp.TimeStamp;


public class Task {
	private String taskName;
	private String date;
	private int priority;
	private boolean taskCompleted;

	public Task() {
		System.out.println("Task is empty");
	}

	public Task(String taskName, int priority) 
	{
		TimeStamp ts = new TimeStamp();
		this.taskName = taskName;
		this.date = ts.getDate();
		this.priority = priority;
		this.taskCompleted = false;
	}

	public Task(	
			String taskName,
			String date,
			int priority,
			boolean taskCompleted
		   )
	{	
		this.taskName = taskName;
		this.date = date;
		this.priority = priority;
		this.taskCompleted = taskCompleted;
	}	

	public String getTaskName() {
		return taskName;
	}

	public String getDate() {
		return date;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public void setTaskCompleted(Boolean taskCompleted) {
		this.taskCompleted = taskCompleted;
	}
}
		
	
