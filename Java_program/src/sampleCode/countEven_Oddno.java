package sampleCode;

public class countEven_Oddno {

	public static void main(String[] args) {
		int a = 0;
		 int b = 0;
		for (int i = 1; i <= 10; i++) {
			
			if (i % 2 == 0) {
				
				a = a +i;
			} else {
                 
                  b = b +i;
			}
		
		}
		System.out.println("sum of Even number" + a);
		System.out.println("sum of odd number" + b);
		System.out.println("sum of odd and even no : " +(a+b));
		
	}

}
