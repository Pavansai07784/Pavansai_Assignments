import java.util.ArrayList;
import java.util.List;




public class NewsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		News news1 =  new News(456,"Mike","GoodWork", "Proper");
		News news2=  new News(446,"June","Fine", "Noteworthy");
		News news3 =  new News(426,"Tom","GoodWork", "Proper");
		News news4 =  new News(433,"Jack","Fine", "Noteworthy");
		News news5 =  new News(441,"Rock","GoodWork", "Proper");
		News news6 =  new News(425,"Victor","GoodWork", "Proper");
		News news7 =  new News(421,"Vicky","Supreme", "Very Intresting");
		News news8 =  new News(411,"Maddy","GoodWork", "Proper");
		News news9 =  new News(487,"Bob","Delightful", "Incredible");
		News news10 =  new News(432,"Scarlet","super-job", "Top-notch");

		List<News> list = new ArrayList<>();

		list.add(news1);
		list.add(news2);
		list.add(news3);
		list.add(news4);
		list.add(news5);
		list.add(news6);
		list.add(news7);
		list.add(news8);
		list.add(news9);
		list.add(news10);

		News n = list.stream()
				.max((c1,c2)->c1.getComment().length()-c2.getComment().length())
				.get();
		System.out.println(n.getNewsID());

		list.stream()
		.filter(b -> b.getCommentByUser().equalsIgnoreCase("budget"))
		.forEach(s-> System.out.println(s.getPostedByUser()));


		//        	 if (s.getCommentByUser().equalsIgnoreCase("budget")) {
		//        		 System.out.println(s.getPostedByUser());
		//        	 }
		//        	 else {
		//        		 System.out.println("No such comment is posted by user");
		//        	 }

		//         Stream string = list.stream()
		//        		    .filter(s -> s.getCommentByUser().equalsIgnoreCase("budget"));
		//        		Stream no = list.stream()
		//        				.filter(s -> s.getCommentByUser().))


		News n2 = list.stream()
				.max((c1,c2)->c1.getComment().length()-c2.getComment().length())
				.get();
		System.out.println(n.getPostedByUser());

		list.stream()
		.forEach(s->System.out.println(
				s.getPostedByUser()  +	" Comment: "   +s.getCommentByUser() ));

	}
}
