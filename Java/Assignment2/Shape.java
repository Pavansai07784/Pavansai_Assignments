package assignment2;

public abstract class Shape {

	public Shape() {	
		
	}
	abstract void draw();

}

class line extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Lines");		
	}
}

class rectangle extends Shape{
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle");		
	}
}

class Cube extends Shape{
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Cude");		
	}
}

class Hexagon extends Shape{
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Hexagon");		
	}



}



