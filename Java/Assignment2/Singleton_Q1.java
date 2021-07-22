package assignment2;
public final class Singleton_Q1{
	private Singleton_Q1(int a,int b)
	{
		System.out.println("The a :" + a);
		System.out.println("The b :" + b);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton_Q1 s=new Singleton_Q1(1,2);
	}

}