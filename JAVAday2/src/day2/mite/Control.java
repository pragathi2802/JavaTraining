package day2.mite;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String model=" ";
		System.out.println("Please mention model");
		model=scan.nextLine();
		switch(model)
		{
		case "R15":
			System.out.println("How many years old your bike is?");
			Integer year=scan.nextInt();
			if(year>2017)
			{
				System.out.println("Do you want EMI for your bike [y/n]?");
				String EMI=scan.next();
				if(EMI.equals("y"))
					System.out.println("price of R15 is 80000"+"per month you need to pay"+(80000+(80000*0.12)/12));
				else
					System.out.println("the price is 80000");
			}
			else if(year<2016)
			{
				System.out.println("NO EMI facility available");
			}
				
			break;
			
			//System.out.println("There are one owner price 80000");
	
		case "Enfield":
			System.out.println("Two owners price 67999");
			break;
		case "Avengers220":
			System.out.println("one owners price 79120");
			break;
		case "Splender":
			System.out.println("one owners price 56000");
			break;
				
		
		}
	}

}
