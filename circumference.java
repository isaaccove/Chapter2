import java.util.Scanner;
public class Circumference{
public static void main(String[] args){
Scanner input = new Scanner (System.in);
	System.out.print("Enter the Radius:");
	int radius = input.nextInt();
	System.out.printf("Diameter with radius %d is %d%n", radius, (2 * radius));
	System.out.printf("Circumference with radius %d is %f%n", radius, (2 * Math.PI * radius));
	System.out.printf("Area with  %d is %f%n", radius, (Math.PI * radius * radius));

}
}