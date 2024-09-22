package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicatewords_hashmap {

	public static void main(String[] args) {
		
		CountDuplicateWord("Java is wonderful language Java is fun");
		
		
		// output -  java : 2
		//           is : 2

	}

	public static void CountDuplicateWord(String inputstring)
	{
		// split
		String wordarray[] = inputstring.split(" ");
		
		// create hashmap
		Map <String, Integer> wordcountmap = new HashMap<String, Integer>();
		
		// to check each word in given array
		for(String word : wordarray)
		{
			// if word present 
			if(wordcountmap.containsKey(word))
			{
				wordcountmap.put(word.toLowerCase(), wordcountmap.get(word)+1);	
			}
			else {
			
				wordcountmap.put(word, 1);
			}
		}
	
		//extracting all the keys of map wordcountmap
		Set<String> wordsInString = wordcountmap.keySet();
		
		//loop through all the words in wordsInString
		for(String word : wordsInString)
		{
			if (wordcountmap.get(word)>1) {
				System.out.println(word +" : "+ wordcountmap.get(word));
				
			}
		}
	}
}
