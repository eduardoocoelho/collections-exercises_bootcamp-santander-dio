package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNumbers {
	private List<Integer> numbersList;

	public SortNumbers() {
		this.numbersList = new ArrayList<>();
	}
	
	public void addNumber(int number) {
		numbersList.add(number);
	}
	
	public List<Integer> sortAscending(){
		List<Integer> orderedList = new ArrayList<>(numbersList);
		
		if(!numbersList.isEmpty()) {
			Collections.sort(orderedList);
		}
		
		return orderedList;
	}
	
	public List<Integer> sortDescending(){
		List<Integer> orderedList = new ArrayList<>(numbersList);
		
		if(!numbersList.isEmpty()) {
			orderedList.sort(Collections.reverseOrder());;
		}
		
		return orderedList;
	}

	public void showNumbers() {
		if(!numbersList.isEmpty()) {
			System.out.println(this.numbersList);
		}
	}
	
}
