// Milliza Anthony Dan Manjula 

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter a sentence: ");
		String sentence = scan.nextLine();

		int numWords = wordCount(sentence);
		System.out.println("There are " + numWords + " words in the sentence.");

		scan.close();
	}
	//method to count number of words in a string
	public static int wordCount(String input) {
		//keeping track of count
		int count = 0;
		
		//splitting a string
		String[] wordArray = input.split(" ");
		
		//counting the number of words in an Array
		for (int i = 0; i< wordArray.length; i++ ){
			//remove extra spaces
			String word = wordArray[i].trim();
			
			if (word.equals("")){
				continue;
			}else{
				//counts the word if it is not blank
				count++;
			}
		}
		
		return count;
}
	}