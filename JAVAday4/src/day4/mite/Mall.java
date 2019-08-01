package day4.mite;
import java.util.*;
public class Mall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Games game=new Games();
		Shopping shop=new Shopping(game);
		Thread t1=new Thread(game,"ABC");
		Thread t2=new Thread(shop,"XYZ");
		t1.start();t2.start();
	}

}

class Shopping implements Runnable
{
	Games g;
	Shopping(Games temp){g=temp;}
	
	@Override
	public void run()
	{
		synchronized(g.scan)
		{
			if(g.amount<500)
			{
			g.amount=1000;
			System.out.println(Thread.currentThread().getName()+"going to notify");
			g.scan.notify();
		}
	}
	System.out.println(Thread.currentThread().getName()+"shopping in levis and LeeCooper");
}
}


class Games implements Runnable
{
	Scanner scan=new Scanner(System.in);
	int amount;
	@Override
	public void run()
	{ 
		synchronized(scan)
		{
			System.out.println("Enter the price for entry ticket: ");
			amount=scan.nextInt();
			if(amount<=500)
			{
				try {
					scan.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"You can enjoy play station");
		}
		
	}
	
}