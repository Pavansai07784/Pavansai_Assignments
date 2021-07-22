public class Fruit {
String Name;
int Calories;
int Price;
String Color;
public Fruit(String name, int calories, int price, String color) {
	super();
	Name = name;
	Calories = calories;
	Price = price;
	Color = color;
}
@Override
public String toString() {
	return "Fruit [Name=" + Name + ", Calories=" + Calories + ", Price=" + Price + ", Color=" + Color + "]";
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getCalories() {
	return Calories;
}
public void setCalories(int calories) {
	Calories = calories;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}
}
