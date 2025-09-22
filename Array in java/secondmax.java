import java.util.Scanner;

class alternate
 {
    	public static void main(String[] a) 
	{
        	int[] arr = new int[5];
        	Scanner sc = new Scanner(System.in);

        
        	for (int i = 0; i < arr.length; i++)
		 {
           	 	System.out.println("Enter a number:");
            		arr[i] = sc.nextInt();
        	}

       
       		 int max = arr[0];
        	int secondMax = arr[0];

	        for (int i = 1; i < arr.length; i++)
		 {
            	if (arr[i] > max) 
			{
                		max = arr[i];
            		}
        	}

        int found = 0;
        for (int i = 0; i < arr.length; i++)
	 {
            if (arr[i] != max)
		 {
               		 if (found==0 || arr[i] > secondMax) 
			{
                    		secondMax = arr[i];
                    		found = 1;
                	}
           	 }
       	 }

      
        if (found==1) 
            System.out.println("Second maximum element is: " + secondMax);
         else 
            System.out.println("Second maximum not found (all elements may be equal).");

    }
}
