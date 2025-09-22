import java.util.Scanner;
class even
{
	public static void main(String [] a)
	{
		Scanner sc=new Scanner(System.in);
		int [] no=new int[5];

		for(int i=0;i<no.length;i++)
		{
			System.out.println("Enter a Number:");
			no[i]=sc.nextInt();
		}


		for(int i=0;i<no.length;i++)
		{
			
			if(no[i]%2==0)
				System.out.println("Even");
			else
				System.out.println("odd");
		}
	}
}