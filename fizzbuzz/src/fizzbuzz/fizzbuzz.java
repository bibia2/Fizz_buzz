package fizzbuzz;

import java.util.Scanner;

public class fizzbuzz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number from 1-20: "); 
		int n = scan.nextInt(); 
		
		if (n % 3 ==0 && n %5 == 0) {
			System.out.println("FizzBuzz");
		}
		else if (n % 3 ==0) {
			System.out.println("Fizz");
		}
		else if (n%5==0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println(n);
		}
		
		scan.close();

		}
}
