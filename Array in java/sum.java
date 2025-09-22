import java.util.Scanner;
class sum
{
	public static void main(String [] a)
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		int [] no=new int[5];
		
		for(int i=0;i<no.length;i++)
		{
			System.out.println("Enter a value in array:");
			no[i]=sc.nextInt();
		}
		
		for(int i=0;i<no.length;i++)
		{
			sum=sum+no[i];
		}
		System.out.println("Sum of :"+sum);
	}
}

				