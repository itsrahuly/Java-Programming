import java.util.Scanner;

class reversed 
{
    	public static void main(String[] args)
 	{
        	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size of n:");
		int n=sc.nextInt();
		int [] arr=new int[n];
		
		System.out.println("Enter number:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	
    		   int temp;
 
   		 for (int i = 0; i < n / 2; i++) 
		{
       		  	temp = arr[i];
        	  	arr[i] = arr[n - i - 1];
    	   		 arr[n - i - 1] = temp;
    		}
    
    		System.out.println("Reversed array:\n");
    		for (int i = 0; i < n; i++) 
        	System.out.println( arr[i]);
	}
}
