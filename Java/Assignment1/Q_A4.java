import java.util.*;
public class Q_A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks of subject1");
        int s1 = input.nextInt();
        System.out.println("Enter the marks of subject2");
        int s2 = input.nextInt();
        System.out.println("Enter the marks of subject3");
        int s3 = input.nextInt();
        
        if (s1>60 && s2 > 60 && s3 > 60)
        { 
        	System.out.println("Passed");
        } else if ( (s1>60 && s2 >60)   ||  (s1>60 && s3 >60) || (s2>60 && s3 >60) )  {
        	System.out.println("Promoted");
        } else {
        	System.out.println("Failed");
        }

	}

}

