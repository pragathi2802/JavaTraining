package day3.mite;

public class Consts extends Brilliant{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consts con=new Consts();
		con.spring();
		con.hibernate();

	}
@Override
public void spring()
{
	super.spring();
}
}
class Brilliant
{
	public void spring()
	{
		System.out.println("Basic web application");
	}
	final public void hibernate()
	{
		System.out.println("ORM module");
	}
	
	final private class Android
	{
		public void skill()
		{
			System.out.println("Java ana XML");
		}
	}
}