
public class Q_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 100;
		int rem,result,newNumber;
		for(;i<=999;i++)
		{
			newNumber = i;
			result = 0;
			while(newNumber>0)
			{
			rem = newNumber % 10;
			result += Math.pow(rem, 3);
			newNumber = newNumber / 10;		
			}
			if(result == i) {
				System.out.println(result);
			}
		}
		

	}

}
