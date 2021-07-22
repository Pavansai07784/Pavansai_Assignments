import java.io.ObjectInputStream.GetField;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TransactionsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction t1= new Transaction (new Trader("Rahul","indore"), 2020, 2000);
		Transaction t2= new Transaction (new Trader("Pavan","Delhi"),2021,9056);
		Transaction t3= new Transaction (new Trader("Guru","Banglore"),1998,6847);
		Transaction t4= new Transaction (new Trader("Shashi","indore"),2005,7896);
		Transaction t5= new Transaction (new Trader("Ak","pune"),2011,6546);
		Transaction t6= new Transaction (new Trader("Ck","pune"),2011,6565);


		List<Transaction> list = new ArrayList<>();

		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);

		System.out.println("year 2011");
		list.stream()
		.filter(y -> y.getYear() == 2011)
		.sorted((v1,v2) -> v1.getValue()-v2.getValue())
		.forEach(s-> System.out.println(s.getValue()));



		list.stream()
		.filter(y -> y.getTrader().getCity().equalsIgnoreCase("delhi"))
		.forEach(a-> System.out.println( "all transactions values from the traders living in Delhi:"   +a.getValue()));



		Transaction max = list.stream()
				.max((v1,v2)->v1.getValue()-v2.getValue())
				.get();
		System.out.println(  "max value:" + max.getValue());



		Transaction min =  list.stream()
				.min((v1,v2)->v1.getValue()-v2.getValue())
				.get();

		System.out.println( "min value:" + min.getValue());







	}

}
