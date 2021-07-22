import java.util.HashMap;
import java.util.Map;

public class Q5 {

	public static void main(String[] args) {
		

	Employee emp1 =  new Employee(1254,"Jack");
	Employee emp2 =  new Employee(1364,"Tom");
	Employee emp3 =  new Employee(1365,"Tom");


	Map<Employee , String > empHashmap = new HashMap<>();
	empHashmap.put(emp1, "User1");
	empHashmap.put(emp2, "User2");
	empHashmap.put(emp3, "User3");
	
	System.out.println(empHashmap.get("Tom"));
	
	
	
	for(Map.Entry<Employee, String> entry : empHashmap.entrySet()) {
		System.out.println(entry.getKey() + "   " + entry.getValue() );
	}

		
	}

}
