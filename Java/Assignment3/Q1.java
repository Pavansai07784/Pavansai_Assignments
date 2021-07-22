import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet; 
public class Q1 {

	public static void main(String[] args) {

		Person p1 = new Person("Adam",6.5,65);
		Person p2 = new Person("Siri",5.5,55);
		Person p3 = new Person("June",5.4,50);
		
		Set <Person> set1 = new TreeSet<Person>(); 
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		
		Iterator it = set1.iterator();  	 		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
      }
        
	}

