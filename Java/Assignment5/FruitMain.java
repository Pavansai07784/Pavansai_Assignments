import java.util.ArrayList;
import java.util.List;
public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit a = new Fruit("Apple", 70, 20, "Red");
		Fruit b = new Fruit("Banana", 150, 30, "Yellow");
		Fruit c = new Fruit("Cherries", 25, 15, "Red");
		Fruit d = new Fruit("Date_Fruit", 100, 50, "Browm");
		Fruit k = new Fruit("Kiwi", 150, 250, "Green");
			
       List<Fruit> fruitsList = new ArrayList();
       
      fruitsList.add(a);
      fruitsList.add(b);
      fruitsList.add(c);
      fruitsList.add(d);
      fruitsList.add(k);
      
      fruitsList.forEach(p -> {System.out.println(p);});
      
      System.out.println("Calories Less Than 100");
      
      fruitsList.stream()
      .filter(s -> s.getCalories() <100 ) 
      .sorted((c1,c2) -> c1.getCalories()-c2.getCalories())
      .forEach(s->System.out.println(s.getName()));
      
      System.out.println("Color Wise List");
      
      fruitsList.stream()
      .sorted((n1,n2) -> n1.getName().compareTo(n2.getName()))
      .forEach(s->System.out.println(s.getColor()));    
      
      System.out.println("Red Color Fruits In Ascending Order");
      
      
      fruitsList.stream()
      .filter(s -> s.getColor().equalsIgnoreCase("red"))
      .sorted((f1,f2)->f1.getPrice()-f2.getPrice())
      .forEach(s->System.out.println(s.getName()));  
	}
	
}


