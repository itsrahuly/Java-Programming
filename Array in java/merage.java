import java.util.Scanner;

class merage 
{
    	public static void main(String[] args)
 	{
        	Scanner sc = new Scanner(System.in);
   		int[] arr=new int[5];
   		int []brr=new int [5];
		int []crr=new int[10]; 

		System.out.println("Enter 5 elements for arr:");
    		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter 5 elements for brr:");
    		for(int i=0;i<brr.length;i++)
		{
			brr[i]=sc.nextInt();
		}

    		for(int i=0;i<arr.length;i++)
    			crr[i]=arr[i];

		for(int i=0;i<brr.length;i++)	
			crr[i+arr.length]=brr[i];

		  System.out.println("Merged array elements:\n");
    
		for(int i=0;i<crr.length;i++)
		System.out.println("crr[" + i + "] = " + crr[i]);
	}
}
    	