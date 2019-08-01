package day4.mite;
import java.util.Scanner;
public class Differ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			atm at=new atm();
			Thread t1=new Thread(at,"pragathi");
			Thread t2=new Thread(at,"sneha");
			Thread t3=new Thread(at,"nireeksha");
			Thread t4=new Thread(at,"priya");
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			
		
	}

}

class atm extends Thread
{
	int amount;
	int total=5000;
	Scanner scan=new Scanner(System.in);
	public  void withDraw()
	{
		System.out.println("Enter the amount:");
		amount=scan.nextInt();
		if(amount<=total)
		{
			System.out.println("Yo can withdraw the money");
			total-=amount;
		}
		else
		{
			System.out.println("you cannot withdraw the money);
		}
	}
		
		synchronized public void run()
		{
			System.out.println(Thread.currentThread().getName());
			withDraw();
		}
}
