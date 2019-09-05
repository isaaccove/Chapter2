import java.util.Scanner;
public class Multiple{
public static void main (String...args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter Integer1:");
	int firstNumber = input.nextInt();

	System.out.print("Enter Integer2:");
	int secondNumber = input.nextInt();
	
	if (firstNumber % secondNumber == 0){
	System.out.printf("%d is a Multiple of %d%n", firstNumber, secondNumber);
}
	if (firstNumber % secondNumber != 0){
	System.out.printf("%d is not a Multiple of %d%n", firstNumber, secondNumber);
}

}
}