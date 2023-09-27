package main;

import java.util.HashSet;
import java.util.Set;

public class TaskList {
	
	private Set<Task> tasks;

	public TaskList() {
		this.tasks = new HashSet<>();
	}
	
	public void addTask(String description) {
		this.tasks.add(new Task(description, false));
	}
	
	public void removeTask(String description) {
		Task remove = null;
		
		for(Task t : tasks) {
			if(t.getDescription().equalsIgnoreCase(description)) {
				remove = t;
				break;
			}
		}
		
		this.tasks.remove(remove);
	}
	
	public void printTasks() {
		System.out.println(this.tasks);
	}
	
	public int countTasks() {
		return this.tasks.size();
	}
	
	public Set<Task> getFinishedTasks(){
		Set<Task> finished = new HashSet<>();
		
		for(Task t : tasks) {
			if(t.isFinished()) {
				finished.add(t);
			}
		}
		
		return finished;
	}
	
	public Set<Task> getNotFinishedTasks(){
		Set<Task> notFinished = new HashSet<>();
		
		for(Task t : tasks) {
			if(!t.isFinished()) {
				notFinished.add(t);
			}
		}
		
		return notFinished;
	}
	
	public void setFinishedTask(String description) {
		for(Task t : this.tasks) {
			if(t.getDescription().equalsIgnoreCase(description)) {
				t.setFinished(true);
				break;
			}
		}
	}
	
	public void setNotFinishedTask(String description) {
		for(Task t : this.tasks) {
			if(t.getDescription().equalsIgnoreCase(description)) {
				t.setFinished(false);
				break;
			}
		}
	}

	public void clearSet() {
		this.tasks.clear();
	}
	
}
