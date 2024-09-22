package String;

public class PermutationOfString {

	
	
	static void printAllcombination(String str,String ans)
	{
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			String remainingExcludingItheCharacter = str.substring(0, i) + str.substring(i + 1);
			printAllcombination(remainingExcludingItheCharacter, ans + ch);
		}
	}
public static void main(String[] args) {
		
		String str = "abc";
		printAllcombination(str, " ");

	}
}
