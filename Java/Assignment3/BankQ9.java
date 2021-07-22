import java.util.TreeSet;

public class BankQ9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank o1=new Bank(10256,9,"Loius",true);
		Bank o2=new Bank(78569,85,"Jennie",true);
		Bank o3=new Bank(758462,62,"Robert",true);

		TreeSet<Bank> set=new TreeSet<>();
		set.add(o1);
		set.add(o2);
		set.add(o3);

		for(Bank s:set)
		{
			System.out.println(s.getAcc_ID());
		}
	}
}


