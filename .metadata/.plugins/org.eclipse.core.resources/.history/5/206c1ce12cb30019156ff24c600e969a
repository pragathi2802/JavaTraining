package day2.mite;

import java.util.Scanner;

public class bus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bus=0,busFare=0,seats=0,passenger=0,busCollect=0,total=0;
		Scanner scan=new Scanner(System.in);
		bus=1;
		while(bus<=4)
		{
			System.out.println("set the fare amount for bus:"+bus);
			busFare=scan.nextInt();
			seats=1;busCollect=0;
			while(seats<=7)
			{
				System.out.println("enter the amount:");
				passenger=scan.nextInt();
				if(passenger>=busFare)
				{
					System.out.println("You can travel");
					busCollect+=busFare;
				}
				else
				{
					System.out.println("You cannot travel");
				}
				seats++;
			}
			System.out.println("Collection from bus:"+bus+"is"+busCollect);
			total+=busCollect;
			bus++;
		}
		System.out.println("total Collection for corporation:"+total);
		scan.close();
		
	}

}
