package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		DuplicateElements_Forloop("ashish a ");
		//o/p  :2
	//	a:2
		//s:2
		//h:2
	}

	public static void DuplicateElements_Forloop(String inputstring)
	{

		char[] inputarray = inputstring.toCharArray();
		
		Map<Character,Integer> map = new HashMap();
		
		for (Character ch : inputarray) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			} else {
                map.put(ch, 1);
			}
		}
		
		Set<Character> letter = map.keySet();
		
		for (Character character : letter) {
			if (map.get(character)>1) {
				System.out.println(character + ":" + map.get(character));
			} 		}
 }
}