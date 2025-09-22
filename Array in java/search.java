import java.util.Scanner;
class search
{
	public static void main(String [] a)
	{
		Scanner sc=new Scanner(System.in);
		int found=0;
		
		int [] no=new int[2];
		
		for(int i=0;i<no.length;i++)
		{
			System.out.println("Enter a value:");
			no[i]=sc.nextInt();
		}

		System.out.println("enter number to search:");
			int search=sc.nextInt();
		
		for(int i=0;i<no.length;i++)
		{
			if(no[i]==search)
			{
				found=1;			
			}		
		}
		if(found==1)
			System.out.println(" search found:");
		else
			System.out.println("search  not found:");		
	}
	
}
		
