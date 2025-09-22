import java.util.Scanner;

class Prime 
{
    	public static void main(String[] args)
 	{
        	Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
        	int n = sc.nextInt();

        	int[] arr = new int[n]; 

	        System.out.printf("Enter %d elements:\n", n);
        	for (int i = 0; i < n; i++) 
		{
        	    arr[i] = sc.nextInt();
        	}

        	System.out.println("Prime check result:");
        	for (int i = 0; i < n; i++)
	 	{
            		int num = arr[i];
            		int isPrime = 0;

            	if (num <= 1) 
		{
                	isPrime = 1;
            	} 
		else 
		{
                for (int j = 2; j * j <= num; j++)
		 {
                    if (num % j == 0) {
                        isPrime = 1;
                        break;
                  }
                }
            }

            if (isPrime==0) 
                System.out.println(num + " is prime.");
             else 
                System.out.println(num + " is not prime.");
            
        }

       
    }
}
