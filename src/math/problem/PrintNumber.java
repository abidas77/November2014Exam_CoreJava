package math.problem;

public class PrintNumber {

	/**
	 * Please solve the following problem in java code.
	 */
	public static void main(String[] args) {
		
		/* use a for loop to print 1 to 100 and then store into an array.
		 *then use another for loop to print only odd numbers.Then add the 
		 *total numbers from the array.
		 */
            int [] theArray = new int[100];
            
            for (int i=1;i<=100;i++){
                System.out.println(i);
                theArray[i-1]=i;
            }
            int total = 0;
            
           for (int i=0;i<100;i++){
               if (theArray[i] %2 == 1)
                    System.out.println(theArray[i]);
                total += theArray[i];
            }
           System.out.println("Total is "+total);
            
		
		
	}

}
