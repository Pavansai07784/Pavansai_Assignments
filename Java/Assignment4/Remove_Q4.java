import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_Q4{

	public static void main(String[] args) {
		   List<String> names = new ArrayList<>(Arrays.asList("jks","mk","ck"));

		   names.removeIf( s-> s.length()%3 == 0 );

		   System.out.println(names);
	}

}
