package day4.mite;

public class Buffet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veg v=new Veg();
		Nonveg non=new Nonveg();
		Thread t1=new Thread(non,"Adarsh");
		Thread t2=new Thread(non,"Kumuda");
		Thread t3=new Thread(v,"HARSH");
		Thread t4=new Thread(v,"Shubham");
		Thread t5=new Thread(non,"Aishwarya");
		Thread t6=new Thread(v,"Hari");
		t1.start();t2.start();t3.start();t4.start();t5.start();t6.start();
		
		
	}

}

class Veg implements Runnable
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"had veg biryani");
		System.out.println(Thread.currentThread().getName()+"had curd rice");
		if(Thread.currentThread().getName().equals("Hari"))
		{Thread.currentThread().stop();}
		System.out.println(Thread.currentThread().getName()+"had desert");
		
		
	}
}


class Nonveg implements Runnable
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"had Muttonbiryani");
		if(Thread.currentThread().getName().equals("Kumuda"))
		{
			try {
				System.out.println(Thread.currentThread().getName()+"gonna wait");
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
		System.out.println(Thread.currentThread().getName()+"Fish");
		System.out.println(Thread.currentThread().getName()+"Chicken");
		System.out.println(Thread.currentThread().getName()+"d");
	}
	
}