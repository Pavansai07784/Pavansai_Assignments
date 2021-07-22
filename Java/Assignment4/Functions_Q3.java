import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functions_Q3 {
	
	  static void printMessage(String name){  
	        System.out.println("Hello "+name);  
	    }  
	  
	  
	public static void main(String[] args) {
		Predicate<String> isALongWord = t -> t.length() > 10;
		String s = "successfully";
		boolean result = isALongWord.test(s);
		System.out.println(result);

	       Consumer <Integer > consumer = (t) -> System.out.println(t*t);
	        consumer.accept(5);

	        Supplier<Double> randomValue = () -> Math.random();
	        System.out.println(randomValue.get());

	        Function<Integer, Double> half = a -> a / 2.0;
	        System.out.println(half.apply(10));
	     	  
	}
}





