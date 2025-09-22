import java.util.Scanner;
class alternate
{
	public static void main(String [] a)
	{
		int [] arr=new int[5];
 		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter a number:");
			arr[i]=sc.nextInt();
		}

    			System.out.println("Alternate elements in the array:\n");

   			 for (int i = 0; i < arr.length; i=i+2) 
       			 	System.out.println( arr[i]);


	}
}