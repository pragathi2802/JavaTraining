package day2.mite;

import java.util.Random;

public class OTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder build=new StringBuilder();
		Random ran=new Random();
		int digit=1;
		while(digit<=4)
		{
			build.append(ran.nextInt(10));
			digit++;
			
		}
		System.out.println("Ur OTP is: "+build.toString());

	}

}
