import java.util.*;
public class Q_A5 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("enter your ctc amount");
		double Ctc = input.nextDouble();
		double tax = 0;
				if (Ctc <= 180000) {
					System.out.println("Tax payed is   " + tax );
				} else if(Ctc > 180000 && Ctc <= 300000) {
					tax = Ctc * 0.1 ;
					System.out.println("tax payed is   " + tax);
				} else if( Ctc >300000 && Ctc<=500000 ) {
					tax = Ctc * 0.2 ;
					System.out.println("tax payed is   " + tax);
				} else if( Ctc >500000 && Ctc<=1000000 ) {
					tax = Ctc * 0.3 ;
					System.out.println("tax payed is   " + tax);
		}

}
}