import java.util.Scanner;
public class Odd{
public static void main (String...args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter Integer1:");
	int firstNumber = input.nextInt();

	System.out.print("Enter Integer2:");
	int secondNumber = input.nextInt();
	
	if (firstNumber % secondNumber == 0){
	System.out.printf("%d is an Even Number", firstNumber, secondNumber);
}
	if (firstNumber % secondNumber != 0){
	System.out.printf("%d is an Odd Number", firstNumber, secondNumber);
}

}
}