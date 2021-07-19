import java.util.Scanner;

public class Q_A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=0;
		Scanner input = new Scanner (System.in);
		int[] a = {5,12,14,6,78,19,1,23,26,35,37,7,52,87,47};
		int value = input.nextInt();
		for (int i=0;i<=14;i++) {
			if (a[i] == value  ) {
				b=1;
			}
	}
		if(b==1) {
			System.out.println(value+" is present");
		}
		else {
			System.out.println(value+" is not present");
		}
	}
}
