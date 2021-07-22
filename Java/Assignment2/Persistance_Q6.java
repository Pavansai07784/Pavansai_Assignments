package assignment2;

import java.util.Random;

public class Persistance_Q6 {	
	public static void main(String args[]) {
	    FilePersistence FilePersistance=new FilePersistence();
        DatabasePersistence DatabasePersistence=new DatabasePersistence();
        FilePersistance.persist();
        DatabasePersistence.persist();
}
}
