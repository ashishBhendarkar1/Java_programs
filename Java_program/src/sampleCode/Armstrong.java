package sampleCode;

public class Armstrong {

	public static void main(String[] args) {
	
		int num =153, temp=num;
		int rem = 0;
		int sum =0;
		
		while(num>0)
		{
			rem = rem % 10;
			sum = (rem* rem* rem) + sum;
			num = num/10;
			
		}
		if(sum==temp)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armstrong");
		}
	}

}
