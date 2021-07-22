package assignment2;
import java.util.Random;

abstract class Persistence {

	public Persistence() {
		// TODO Auto-generated constructor stub
	}
	abstract void persist();

}
class FilePersistence extends Persistence{

	@Override
	void persist() {
		System.out.println("Data saved in File");
	}
	
}
class DatabasePersistence extends Persistence{

	@Override
	void persist() {
		System.out.println("Data saved in database");
	}
	
}
