/**
 * 
 */
package tinyPrime;

import java.util.Date;

/**
 * @author jacob.wall
 *
 */
public class TinyPrime {

	private int calculatePrimes = 5_000_000;

	public static void main(String[] args) {
		TinyPrime tinyprime = new TinyPrime();
		int index;
		int primeNumber = 2;
		
		Date startTime = new Date();

		//1_000_000 primes took 14.377 seconds to run
		//2_000_000 primes took 34.684 seconds to run
		//3_000_000 primes took 58.607 seconds to run
		//4_000_000 primes took 84.54 seconds to run
		//5_000_000 primes took 117.59 seconds to run
		
		for (index = 3; primeNumber <= tinyprime.calculatePrimes; index +=2) {
			if (tinyprime.isPrime(index) == true) {
				System.out.println("Prime number " + primeNumber + " is " + index);
				primeNumber++;
			}
		}
		
		Date endTime = new Date();
		
		int seconds = ((int)endTime.getTime() - (int)startTime.getTime())/1000;
		int milliseconds = ((int)endTime.getTime() - (int)startTime.getTime())%1000;
		
		System.out.println("The program took " + seconds + "." + milliseconds + " seconds to run.");
				
	}

	boolean isPrime(int number) {
		boolean isPrime = true;
		int index;
	//	if (number % 2 == 0)
	//		return false;
		for (index = 3; index <= Math.sqrt(number); index += 2) {
			if (number % index == 0)
				return false;
		}
		return isPrime;
	}

}
