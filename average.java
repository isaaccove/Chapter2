import java.util.Scanner;
public class Average{
public static void main (String...args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first Integer: ");
	int x = input.nextInt();

	System.out.print("Enter second Integer:");
	int y = input.nextInt();

	System.out.print("Enter third Integer:");
	int z = input.nextInt();
	
	int Sum = x+y+z;
	System.out.printf("%d is the Sum\n", Sum);
	
	int Average = (x+y+z)/3;
	System.out.printf("%d is the Average\n", Average);

	int Product = x*y*z;
	System.out.printf("%d is the Product\n", Product);

	if(x>z){
	System.out.println("First Integer is the largest" );
}
	if(x>y){
	System.out.println("Third Integer is the smallest");
}
	
}
	
}