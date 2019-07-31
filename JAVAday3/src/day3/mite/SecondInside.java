package day3.mite;

public class SecondInside {
	String product;
	float monitorsize;
	class Enquire
	{
		int price;
		public void show()
		{
			System.out.println(product+" "+monitorsize+" "+price);
		}
		public void greetings()
		{
			System.out.println(product+" are going to display");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondInside s1=new SecondInside();
		s1.product="lenovo";
		s1.monitorsize=47;
		Enquire enq=s1.new Enquire();
		enq.price=40000;
		enq.greetings();
		enq.show();
		
		

	}

}
