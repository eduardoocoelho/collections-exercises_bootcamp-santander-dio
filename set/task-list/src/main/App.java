package main;

public class App {

	public static void main(String[] args) {
		TaskList list = new TaskList();
		
		list.printTasks();
		
		list.addTask("Task 1");
		list.addTask("Task 2");
		list.addTask("Task 3");

		list.printTasks();
		
		System.out.println("Set size: " + list.countTasks());
		
		System.out.println("Not finished tasks: " + list.getNotFinishedTasks());
		list.setFinishedTask("Task 1");
		System.out.println("Not finished tasks: " + list.getNotFinishedTasks());
		System.out.println("Finished tasks: " + list.getFinishedTasks());

		list.printTasks();
		list.removeTask("Task 3");
		list.printTasks();
	}

}
