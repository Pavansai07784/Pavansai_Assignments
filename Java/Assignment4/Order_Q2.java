import java.util.List;
import java.util.ArrayList;

public class Order_Q2 {

	public static void main(String[] args) {

		Orderstatus cos1 = new Orderstatus(12500,"COMPLETED" );
		Orderstatus cos2 = new Orderstatus(1582,"COMPLETED" );
		Orderstatus cos3 = new Orderstatus(10200,"ACCEPTED" );
		Orderstatus cos4 = new Orderstatus(9999,"ACCEPTED" );
		Orderstatus cos5 = new Orderstatus(12500,"COMPLETED" );
		Orderstatus cos6 = new Orderstatus(450,"ACCEPTED" );
		Orderstatus cos7 = new Orderstatus(11040,"COMPLETED" );


		List<Orderstatus> list = new ArrayList<>();

		list.add(cos1);
		list.add(cos2);
		list.add(cos3);	
		list.add(cos4);
		list.add(cos5);
		list.add(cos6);
		list.add(cos7);

		list.stream()
		.filter(O -> O.getPrice()>10000 )  
		.filter(O -> O.getStatus().equalsIgnoreCase("completed"))
		.forEach(O -> System.out.println("   OrderPrice "+O.getPrice()+"   Orderstatus "  +O.getStatus()));

		list.stream()
		.filter(O -> O.getPrice()>10000 )  
		.filter(O -> O.getStatus().equalsIgnoreCase("Accepted"))
		.forEach(O -> System.out.println("   OrderPrice "+O.getPrice()+"   Orderstatus "  +O.getStatus()));
	}

}

class Orderstatus{
	int price;
	String status;
	public Orderstatus(int price, String status) {
		super();
		this.price = price;
		this.status = status;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "status [price=" + price + ", status=" + status + "]";
	}


}
