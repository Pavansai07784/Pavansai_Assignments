import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ArraylistReverse {

	   public static void main(String[] args)
	    {
		   Scanner sc = new Scanner(System.in);

		   List<Integer> list = new ArrayList<Integer>();

		   list.add(sc.nextInt());	   
		   list.add(sc.nextInt());
		   list.add(sc.nextInt());
		   list.add(sc.nextInt());


		   ListIterator<Integer> itr = list.listIterator(list.size());


		   while (itr.hasPrevious()) {
			   System.out.println(itr.previous());
		   }
	    }
	
	
}
