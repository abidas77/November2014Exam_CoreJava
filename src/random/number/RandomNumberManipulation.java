package random.number;
import java.util.Random;

public class RandomNumberManipulation {

	/**
	 * Please solve the following problem in java code.
	 */
	public static void main(String[] args) {
	  /*
	   * Declare an array to store 50 random numbers range from 1 to 500. Then find the 
	   * even numbers only to print to the console.
	   * Hints: use Random() class.
	   */

            
            int [] theArray = new int[50];
           
            Random ran = new Random();
            
            
            for (int i=0;i<50;i++){
              theArray[i] = ran.nextInt(499)+1;
            }
            
            
            for (int i=0;i<50;i++){
                if (theArray[i]%2==0){
                    System.out.println(theArray[i]);
                }
            }

	}

}

