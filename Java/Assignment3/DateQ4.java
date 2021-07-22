import java.security.KeyStore.Entry;
import java.util.*;
public class DateQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Date,String> hash=new HashMap<>();
		Date d1=new Date(16,01,1999);
		Date d2=new Date(27,03,2005);
		Date d3=new Date(19,10,1998);
		Date d4=new Date(19,10,2000);
		hash.put(d1,"Lucy");
		hash.put(d2,"Brim");
		hash.put(d3,"Viper");
		hash.put(d4,"Skye");
		Set<Map.Entry<Date,String>> entry=hash.entrySet();
		Iterator<Map.Entry<Date,String>> it=entry.iterator();
		while(it.hasNext())
		{
			Map.Entry<Date,String> ent=(Map.Entry<Date, String>) it.next();
			Date d=ent.getKey();
			String a=ent.getValue();
			
			System.out.println(d.day+"/"+d.month+"/"+d.year);
			System.out.println(a);			
		}
		

	}
}

