package main;

public class App {

	public static void main(String[] args) {
		SingleWordsSet words = new SingleWordsSet();
		
		words.printWords();
		
		words.addWord("Word 1");
		words.addWord("Word 2");
		words.addWord("Word 3");
		
		words.printWords();
		
		words.removeWord("Word 3");
		
		words.printWords();
		
		System.out.println(words.searchWord("Word 3"));
		System.out.println(words.searchWord("Word 1"));
	}

}
