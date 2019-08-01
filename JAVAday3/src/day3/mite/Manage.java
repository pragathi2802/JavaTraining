package day3.mite;

public class Manage {
	
	Cndidate[] base =new Cndidate[5];
	static int pos;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cndidate f=new Cndidate("Hari","java",7);
		Cndidate b=new Cndidate("Prasad","Python",3);
		Cndidate t=new Cndidate("Shahi","C++",8);
		Cndidate m=new Cndidate("murali","java",9);
		Manage man=new Manage();
		man.insert(m);
		man.insert(f);
		man.insert(b);      
		man.insert(m);
		pos=0;
		man.search("Python");

		
	}
	@override
	public void insert(Cndidate can)
	{
		for(int index=0;index<base.length;index++)
		{
			if(base[index]==null) {
				base[index]=can;
				System.out.println(base.getName()+" Lancer added");
			}
		}
	}

}
