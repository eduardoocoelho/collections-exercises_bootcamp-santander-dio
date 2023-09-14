package main;

public class App {

	public static void main(String[] args) {
		SumNumbers list = new SumNumbers();
		
		list.addNumber(5);
		list.addNumber(10);
		list.addNumber(15);
		list.addNumber(20);
		list.addNumber(25);
		
		System.out.println(list.toString());
		System.out.println(list.calculateSum());
		System.out.println(list.findHighestNumber());
		System.out.println(list.findLowestNumber());
	}

}
