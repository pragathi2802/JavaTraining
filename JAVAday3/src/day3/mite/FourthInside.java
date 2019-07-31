package day3.mite;

public class FourthInside {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Merchant().gets();
		new Merchant().get(2);
	}

}

class Merchant
{
	int[] price= {1200,3422,345,3500};
	public void get(int index) 
	{
	   System.out.println(price[index]);
	 }
	 public void gets()
	 {
		 for(int k:price) 
		 {
			 System.out.println(k);
		 }
	}
}

