package main;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> cart;

	public ShoppingCart() {
		cart = new ArrayList<>();
	}
	
	public void addItem(String name, double price, int quantity) {
		cart.add(new Item(name, price, quantity));
	}
	
	public void removeItem(String name) {
		List<Item> removedItems = new ArrayList<>();
		
		for(Item i : cart) {
			if(i.getName().equalsIgnoreCase(name)) {
				removedItems.add(i);
			}
		}
		
		cart.removeAll(removedItems);
	}
	
	public double calculateValue() {
		double value = 0;
		
		for(Item i : cart) {
			value += i.getPrice() * i.getQuantity();
		}
		
		return value;
	}
	
	public void showItems() {
		for(Item i : cart) {
			System.out.println(i.toString());
		}
	}
	
}
