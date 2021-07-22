import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class difference_Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
      Set <Integer> hash = new HashSet <>();
      Set <Integer> Linked = new LinkedHashSet <>();
      
      hash.add(sc.nextInt());
      hash.add(sc.nextInt());
      hash.add(sc.nextInt());
      hash.add(sc.nextInt());
      hash.add(sc.nextInt());
      
      System.out.println("Using HashSet" + hash);
      
      Linked.add(sc.nextInt());
      Linked.add(sc.nextInt());
      Linked.add(sc.nextInt());
      Linked.add(sc.nextInt());
      Linked.add(sc.nextInt());
      
      System.out.println( "Using LinkedSet"   + Linked);
	}

}
