package main;

public class App {

	public static void main(String[] args) {
		SortNumbers list = new SortNumbers();
		
		list.addNumber(10);
		list.addNumber(5);
		list.addNumber(10);
		list.addNumber(5);
		list.addNumber(25);
		list.addNumber(20);
		
		list.showNumbers();
		
		System.out.println(list.sortAscending());
		System.out.println(list.sortDescending());
		
		list.showNumbers();
	}

}
