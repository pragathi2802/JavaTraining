package day1;

public class Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short applepie=78;
		char gingerbread='R';
		double froyo=4.9;

		System.out.println((applepie+=gingerbread)*(froyo*=3)/(gingerbread/3));
		applepie=78;
		gingerbread='R';
		froyo=4.9;
		System.out.println((froyo--)-(gingerbread<<5)/(applepie%=4)+((int)froyo>>2));
	}

}
