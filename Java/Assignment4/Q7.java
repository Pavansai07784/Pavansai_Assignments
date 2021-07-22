import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Q7 {
	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
		        Map<String, Integer> map  = new TreeMap<String, Integer>();
		  
		        map.put("a", 100);
		        map.put("b", 200);
		        map.put("c", 300);
		        map.put("d", 400);
		        
		        Set<Entry<String, Integer>> entrySet = map.entrySet();
				entrySet.forEach(a->result.append(a));
                 
                 System.out.println(result);


}
}