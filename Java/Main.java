/*
 * Run with `java Main.java`
 */

public class Main {
	public static void main(String[] args) {
		Main.fizzBuzz(10);
	}

	private static void fizzBuzz(final int end) {
		for (int i = 0; i < end; i++) {
			final boolean isDivisibleByThree = i % 3 == 0;
			final boolean isDivisibleByFive = i % 5 == 0;
			if (isDivisibleByThree && isDivisibleByFive) {
				System.out.println("FizzBuzz");
			} else if (isDivisibleByThree) {
				System.out.println("Fizz");
			} else if (isDivisibleByFive) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}

