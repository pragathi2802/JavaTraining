package day4.mite;

public class Marsh implements Cloneable{

	String bike;
	public static void main(String[] args) throws CloneNotSupportedException {
	// TODO Auto-generated method stub
		Marsh m1=new Marsh();
		m1.bike="Avenger220";
		Marsh m2=new Marsh();
		m2.bike="Apache220";
		System.out.println(m1.bike+" "+m2.bike);
		Marsh m3=new Marsh();
		m3=m2;
		System.out.println(m3.bike);
		m3.bike="R15";
		System.out.println("M3 "+m3.bike+" M2 "+m2.bike+" M1 "+m1.bike);
		Marsh m4=(Marsh)m1.clone();
		System.out.println("M4 "+m4.bike+" M1 "+m1.bike);
		m1.bike="Mahindra Jawa";
		System.out.println("M4 "+m4.bike+" M1 "+m1.bike);

	}

}
