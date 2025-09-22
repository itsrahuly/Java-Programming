import java.util.Scanner;

class third 
{
    	public static void main(String[] args)
 	{
        	Scanner sc = new Scanner(System.in);
   		int[] arr=new int[5];
   		int []brr=new int [5];
		int []crr=new int[5]; 

		System.out.println("Enter arr:");
    		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter brr:");
    		for(int i=0;i<brr.length;i++)
		{
			brr[i]=sc.nextInt();
		}
		for(int i=0;i<crr.length;i++)
    		{
    			crr[i]=brr[i]+arr[i];
            		System.out.println("arr[" + i + "] + brr[" + i + "] = " + crr[i]);
		}
	}
}
