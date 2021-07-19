import java.util.Arrays;
import java.util.Scanner;

class loop{
	Scanner sc = new Scanner(System.in);
	public int[] loop() {
		// TODO Auto-generated method stub
		int[] A = new int[3];
		for (int i=0;i<3;i++) {
			if(i==0) {
				System.out.println("Enter Marks in A");
				A[i] = sc.nextInt();
			}
			if(i==1) {
				System.out.println("Enter Marks in B");
				A[i] = sc.nextInt();
				
			}
			if(i==2) {
				System.out.println("Enter Marks in C");
				A[i] = sc.nextInt();
			}
			
		}
		return A;
	}
	
	public void add() {
		
		
		
		
		
	}
	
}

public class Q_A9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		loop A = new  loop();
		
		int[] c = A.loop();
		System.out.println(Arrays.toString(c));

}
}

