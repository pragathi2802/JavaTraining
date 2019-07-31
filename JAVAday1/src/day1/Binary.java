package day1;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer alpha=23,cosmo=134;
		System.out.println(cosmo^90);
		System.out.println(cosmo&567);
		System.out.println(cosmo<<3);
		cosmo^=alpha;alpha^=cosmo;cosmo^=alpha;//swaping 2 integers
		System.out.println(alpha+" "+cosmo);

	}

}
