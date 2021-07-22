import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Collections_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		contact c1  = new contact(957548464, "jack", "shdg", new ArrayList(Arrays.asList("Male")) );
		contact c2  = new contact(857548464, "mike", "shdg", new ArrayList(Arrays.asList("Male")) );
		contact c3  = new contact(952548464, "june", "shdg", new ArrayList(Arrays.asList("Female")) );
		contact c4  = new contact(256863464, "milli", "shdg", new ArrayList(Arrays.asList("Female")) );
		contact c5  = new contact(957468464, "vector", "shdg", new ArrayList(Arrays.asList("Male")) );
		contact c6  = new contact(959874554, "missi", "shdg", new ArrayList(Arrays.asList("Female")) );
		contact c7  = new contact(956468464, "james", "shdg", new ArrayList(Arrays.asList("Male")) );
		contact c8  = new contact(695326664, "frank", "shdg", new ArrayList(Arrays.asList("Male")) );
		contact c9  = new contact(789548464, "emma", "shdg", new ArrayList(Arrays.asList("Female")) );
		contact c10 = new contact(256858464, "ava", "shdg", new ArrayList(Arrays.asList("Female")) );
		contact c11 = new contact(800087464, "buddy", "shdg", new ArrayList(Arrays.asList("Male")) );
		
		
		TreeMap< Long , contact > dec = new TreeMap<>();  
		
		dec.put((long) 957548464,c1);
		dec.put((long) 857548464,c2);
		dec.put((long) 952548464,c3);
		dec.put((long) 256863464,c4);
		dec.put((long) 957468464,c5);
		dec.put((long) 959874554,c6);
		dec.put((long) 956468464,c7);
		dec.put((long) 69532666,c8);
		dec.put((long) 789548464,c9);
		dec.put((long) 256858464,c10);
		dec.put((long) 800087464,c11);
		
		
		
		
		
		
		
		
		

		System.out.println(dec.);
    

		
		
	

	}

}

class contact{
	long PhoneNumber;
	String Name;
	String Email;
    ArrayList<String> Gender;
	public contact(long phoneNumber, String name, String email, ArrayList<String> Gender) {
		super();
		PhoneNumber = phoneNumber;
		Name = name;
		Email = email;
		this.Gender = Gender;
	}
	@Override
	public String toString() {
		return "contact [PhoneNumber=" + PhoneNumber + ", Name=" + Name + ", Email=" + Email + ", Gender=" + Gender
				+ "]";
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public ArrayList<String> getGender() {
		return Gender;
	}
	public void setGender(ArrayList<String> gender) {
		Gender = gender;
	}

	
	
}