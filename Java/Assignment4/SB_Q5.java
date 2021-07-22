import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
  
public class SB_Q5 {
	   public static void main(String args[]){

		   StringBuilder str = new StringBuilder();
		   
		   
	        List <String> strings= new ArrayList<>();
	        strings.add("K.O");
	        strings.add("Alen");
	        strings.add("West");
	        strings.add("Ava");
	        strings.add("Ino");
	        
	        strings.forEach((n) -> str.append(n.charAt(0)));
	        
	        System.out.println(str);	        
//	        
//		      Consumer<String> con  = (i) -> System.out.println(i);		      
//		      con.accept(str);
	             
	    
	}
}
