package String;

public class reverse {
	
	public static void main(String args[]) {
		
		String s= "test";
		String rev="";
		int len =s.length();
		
		for (int i = len-1 ; i >= 0 ; i--) {
			
			rev = rev + s.charAt(i);
		}
		System.out.println("reverse string :" + rev);
		
		String s1="123";
		 StringBuffer sb = new StringBuffer(s1);
		 System.out.println(sb.reverse());
		
	    }
	

	
	

}
