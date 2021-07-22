public class Person implements Comparable<Person>{
	int Weight;
	Double Height;
	String Name;
	public Person(String Name,Double Height ,int Weight) {
		this.Name=Name;
		this.Height=Height;
		this.Weight=Weight;
	}
	@Override
	public int compareTo(Person it) {
		// TODO Auto-generated method stub
		if (this.Weight == it.getWeight())
		
		return 0;
		else if (this.Weight > it.getWeight())
			return 1;
		else return -1;
	}


	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	public Double getHeight() {
		return Height;
	}
	public void setHeight(Double height) {
		Height = height;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public void display() {
		// TODO Auto-generated method stub
	      System.out.println("Name " + getName() + " Height " + getHeight() + " Weight " + getWeight() );

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "[Name:" + Name + " Height: " + Height + " Weight:" + Weight +" ]";
	}
}
