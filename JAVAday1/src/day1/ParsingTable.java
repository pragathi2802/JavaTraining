package day1;

public class ParsingTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		int deposited=0,month=0;
		float interest=0.0F;
		char type='\0';
		deposited=Integer.parseInt(args[0]);
		month=Integer.parseInt(args[1]);
		interest=Float.parseFloat(args[2]);
		type=args[3].charAt(0);
		deposited+=(deposited*(month*interest))/100;
		System.out.println("account details: "+type+" "+interest+" "+month+" "+deposited);

	}

}
