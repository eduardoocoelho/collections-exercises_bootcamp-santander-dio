package main;

import java.util.HashSet;
import java.util.Set;

public class SingleWordsSet {
	private Set<String> words;

	public SingleWordsSet() {
		this.words = new HashSet<>();
	}
	
	public void addWord(String word) {
		this.words.add(word);
	}
	
	public void removeWord(String word) {
		this.words.remove(word);
	}
	
	public boolean searchWord(String word) {
		return this.words.contains(word);
	}
	
	public void printWords() {
		System.out.println(this.words);
	}
}
