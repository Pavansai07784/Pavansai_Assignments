import java.util.*;
public class Q_A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner (System.in);
    String Username = "hello";
    String password = "world";
    int count = 3;
    for(int i=0;i<3;i++){
    	System.out.println("enter the Username");
    	String name = input.nextLine();
    	System.out.println("enter the password");
    	String pass = input.nextLine();
    	if(name.equals(Username)){
    	    if(pass.equals(password)){
    	        System.out.println("welcome hello");
    	    break;
    	    }
    	}
    	else{
    	    System.out.println("Invalid");
    	}
    	count=count-1;
    	if(count == 0){
    	    System.out.println("contact manager");
    	}
	}
	}
}


