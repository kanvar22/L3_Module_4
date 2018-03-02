// Below is a completed program that uses brute force to crack a 9-digit password. 
// On average, the program takes about 0.125 seconds to find the password.
// Your goal is to re-write the algorithm using Threads. Try to shorten the time it takes 
// to find the code to be as little as possible.
// Let's see who can crack the code the fastest!

// Pro-tip: Do not include the creation of the threads as part of the time. 
package threads;

import java.util.Random;

public class BruteForceCracker2 {
	static long code = (long) (new Random().nextDouble() * 1_000_000_000);

	static long startTime;
	static long endTime;
	static float elapsedTime;

	public static void main(String[] args) {
		System.out.println("Starting Brute Force Checker");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			new Thread(checkAlot(i)).start();
		}

	}

	private static Runnable checkAlot(int i) {
		return () -> {
			int ii = i * 100000000;
			for (int j = ii; j < ii + 100000000; j++) {
				
				if (checkCode(j) == true) {
					endTime = System.currentTimeMillis();
					elapsedTime = (float) (endTime - startTime);
					elapsedTime /= 1000.f;
					System.out.println("Total time taken: " + elapsedTime + " seconds");
				}
			}
			System.out.println("" + ii);

		};
	}

	public static boolean checkCode(long p) {
		if (p == code) {
			return true;
		} else {
			return false;
		}
	}
}
