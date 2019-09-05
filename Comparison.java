import java.util.Scanner;
public class Comparison{
public static void main (String...args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first Integer: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second Integer:");
	int secondNumber = input.nextInt();

	if (firstNumber == secondNumber){
	System.out.println("Number is equal");
}
	if (firstNumber != secondNumber){
	System.out.println("Numbers are not equal");
}
}
	



	


}