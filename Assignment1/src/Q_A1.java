import java.util.*;
public class Q_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = input.nextInt();
		
		int rem,count =0;
		int result = 0;
		for (int temp=number;temp != 0;count++ )
		{
			temp = temp / 10 ;	
		}		
		 for(int temp = number;temp!=0;temp = temp /10) 
		 {
			 rem = temp % 10;
			 result += Math.pow(rem, count );
					 
		 }
		 
		 if(result == number)
		 {
			 System.out.println(number + " is an armstrong number");
		 }
		 else
		 {
			 System.out.println(number +  " is not an armstrong number" );
		 }

	}

}

