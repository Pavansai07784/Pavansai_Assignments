
public class Trader {
String Name;
String City;
public Trader(String name, String city) {
	super();
	Name = name;
	City = city;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
@Override
public String toString() {
	return "Trader [Name=" + Name + ", City=" + City + "]";
}
}
