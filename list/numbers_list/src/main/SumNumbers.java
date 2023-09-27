package main;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
	private List<Integer> numbersList;

	public SumNumbers() {
		this.numbersList = new ArrayList<>();
	}
	
	public void addNumber(int number) {
		numbersList.add(number);
	}
	
	public int calculateSum() {
		int sum = 0;
		
		for(int i : numbersList) {
			sum += i;
		}
		
		return sum;
	}
	
	public int findHighestNumber() {
		int highest = numbersList.get(0);
		
		for(int i : numbersList) {
			if(i > highest) {
				highest = i;
			}
		}
		
		return highest;
	}

	public int findLowestNumber() {
		int lowest = numbersList.get(0);
		
		for(int i : numbersList) {
			if(i < lowest) {
				lowest = i;
			}
		}
		
		return lowest;
	}
	
	public List<Integer> showNumbers(){
		return numbersList;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		for(int i : this.numbersList) {
			result += "[" + i + "] - ";
		}
		
		return result;
	}
}
