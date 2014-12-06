package math.problem;

import javax.swing.plaf.synth.SynthOptionPaneUI;

@SuppressWarnings("unused")
public class FindPrimeNumbers {

    /**
     * Please do the flowing problem.
     */
    public static void main(String[] args) {
	
		/* Find the prime numbers from 1 to 1000 then print to console.Also print out the total prime numbers within the range.
	(prime numbers are only divisible by number 1 and the number itself.)
	(for example numbers like 2,3,5,7,9,11,13.....n are prime numbers. 
		*/

        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);

            }
        }

    }

    public static boolean isPrime (int number){
        for (int i=2; i<number; i++){
            if (number % i==0){
                return false;
            }
        }
    return true;
    }

}