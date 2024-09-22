package sampleCode;

public class factorial {

	public static void main(String [] args)
	{
		int fact=1,n,i;
		n=5;
		
		for(i=1;i<=n;i++)
		{
			fact= fact * i;
		}
		System.out.println("factorial of given" + n + "is" + fact);
	}
}
