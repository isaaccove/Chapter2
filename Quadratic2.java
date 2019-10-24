
/**
 * @author user
 *
 */
public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	private double discriminant;
	
	public double getA(){
		return this.a;
	}
	public void setA(double a) {
		this.a = a;
	}
	
	public double getB() {
		return this.b;
	}
	
	public void setB(double b) {
		this.b = b;
	}
	
	public double getC() {
		return this.c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	public double getDiscriminant() {
		return this.discriminant;
	}
	public void setDiscriminant(double aNumber) {
		discriminant = aNumber;
	}
	
	public void calculateDiscriminant() {
		discriminant = b*b-(4*a*c);
		