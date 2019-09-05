import java.util.Scanner;
public class Comparison2{
public static void main (String...args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first Integer: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second Integer:");
	int secondNumber = input.nextInt();

	if (firstNumber > secondNumber){
	System.out.printf("%d is greater %d%n", firstNumber, secondNumber);
}
	if (firstNumber == secondNumber){
	System.out.println("These numbers are equal");

	
}
	
}
	
}