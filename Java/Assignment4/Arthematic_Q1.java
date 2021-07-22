import java.awt.Adjustable;
import java.util.Scanner;

public class Arthematic_Q1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the no a ");

		int a = scanner.nextInt();

		System.out.println("enter the no b");
		int b = scanner.nextInt();
		
		Ope  add = (int x , int y) -> a+b;  
		
		System.out.println("add: "+add.cal(a,b));
		
		Ope  sub = (int x , int y) -> a-b;  
		
		System.out.println("sub: "+sub.cal(a,b));
		
		
		Ope  mul = (int x , int y) -> a*b;  
		
		System.out.println("mul: "+ mul.cal(a,b));
		
		try {
		Ope  div = (int x , int y) -> a/b;  
		
		System.out.println( "div: " + div.cal(a,b));
		}
		catch (Exception e) {
			System.out.println("The b cannot be Zero for div property");
		}



	}	

}

@FunctionalInterface
interface Ope
{
	int cal(int x ,int y);
}
