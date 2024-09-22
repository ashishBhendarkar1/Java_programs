package sampleCode;

public class primeno {

	public static void main(String[] args) {
		
		int num=10, count;
		
		for(int i=1; i<=num; i++)
		{
			count=0;
			
			for(int j=2; j<= i/2; j++)
			{
				if(i % j == 0)
				{
					count = 1;
					break;
				}
			}
			
			if(count == 0)
			{
				System.out.println("Prime number" + i);
			}
			else
			{
				System.out.println("Not Prime number" + i);
			}
		}

		}	
	


}
