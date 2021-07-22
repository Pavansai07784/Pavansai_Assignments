import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.jar.Attributes.Name;
//import java.util.Collections;
//import java.util.HashSet;


public class TraderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trader p1= new Trader("Rahul","indore");
		Trader p2= new Trader("Pavan","Delhi");
		Trader p3= new Trader("Guru","Banglore");
		Trader p4= new Trader("Shashi","indore");
		Trader p5= new Trader("Ak","pune");
		Trader p6= new Trader("Ck","pune");
		
		
		
		
		List<Trader> personList = new ArrayList<>();
		
            personList.add(p1);
            personList.add(p2);
            personList.add(p3);
            personList.add(p4);
            personList.add(p5);
            personList.add(p6);
            
 
            
//            List<String> bList = new ArrayList<>();
            
            
//            personList.stream().map(Trader::getCity).forEach(bList::add);
//            
//            System.out.println(bList);
//            
                        
//            
//            personList.stream()
//            .filter((s) -> s.getCity())
//            .sorted()         
            
//            personList.stream()
//            .filter(p->p.getCity().equalsIgnoreCase("pune")
//            		.
//            .forEach(n-> System.out.println(n.getName()));
            
            System.out.println("Who lives in Pune");
            
            personList.stream()
            .filter(s -> s.getCity().equalsIgnoreCase("pune"))
            .sorted((f1,f2)->f1.getName().compareTo(f2.getName()))
            .forEach(s->System.out.println(s.getName()));  
            
            
            System.out.println("Names Sorted");
            personList.stream()
            .sorted((f1,f2)->f1.getName().compareTo(f2.getName()))
            .forEach(s->System.out.println(s.getName()));  
            
            
            
            
            System.out.println("Who live in indore");
            
            personList.stream()
            .filter(s -> s.getCity().equalsIgnoreCase("indore"))
            .sorted((f1,f2)->f1.getName().compareTo(f2.getName()))
            .forEach(s->System.out.println(s.getName()));  
            
            

	}

}
