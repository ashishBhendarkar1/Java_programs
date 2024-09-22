package sampleCode;

public class reverseStirng {
	
	public static void main(String[] args) {
	int num =12345;
	int rem=0;
	
	while(num>0)
	{
		rem = num * 10 + num % 10;
		 
		num = num / 10;
		
	}
  
}
}