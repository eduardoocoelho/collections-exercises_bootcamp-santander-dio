package main;

public class App {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem("TV", 100.00, 5);
		cart.addItem("TV", 500.00, 2);
		cart.addItem("Cell", 870.00, 1);
		
		cart.showItems();
		
		System.out.println();
		
		cart.removeItem("Cell");
		cart.showItems();
		
		System.out.println();
		System.out.println("Total value: $" + cart.calculateValue());
	}
}
