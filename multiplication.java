import java.util.Scanner;
public class Multiplication{
public static void main (String [] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first input: ");
	int number1 = input.nextInt();

	System.out.print("Enter second input:");
	int number2 = input.nextInt();

	int result = number1 * number2;

	System.out.printf("The answer is %d%n", result);



	}


}