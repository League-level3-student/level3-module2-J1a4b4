package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionMath {
	
	public static int recursiveMultiplication(int number, int times) {
		//2. if times is 1 
			//3. return number 
		if (times == 1) {
			return number;
		}else {
			return number + recursiveMultiplication(number, times - 1);
		}
		//4. else return number + recursiveMultiplication(number, times-1)
	}
	
	//6. Try this one on your own! 
	//Hint: if divisor is bigger than number, you can't divide anymore
	static int increment = 0;
	
	public static int recursiveDivision(int number, int divisor) {
		increment++;
		if (divisor > number) {
			return increment - 1;
		}else {
			return recursiveDivision(number - divisor, divisor);
		}
	}
	
	//8. Try this one on your own!
	public static int recursivePower(int number, int power) {
		if (power == 0) {
			return 1;
		}else if (power == 1) {
			return number;
		}else {
			return number * recursivePower(number, power - 1);
		}
	}
}
