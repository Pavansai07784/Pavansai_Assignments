import java.util.*;
public class Q_A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		double p , r , t,si,ci;
		System.out.println("enter principle");
		p = input.nextDouble();
		System.out.println("enter rate");
		r = input.nextDouble();
		System.out.println("enter time");
		t = input.nextDouble();
		System.out.print("Enter number of times interest is compounded: ");
		int n = input.nextInt();

		si = (p*r*t)/100;
		ci = p * Math.pow((1+r/100), t*n) - p;
		System.out.println("The simpleinterest(si) is " + si);
		System.out.println("The compoundinterest(ci) is " + ci);
		
	}

}
