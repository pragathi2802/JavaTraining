import java.util.Scanner;

public class Arry {
	static Scanner scan =new Scanner(System.in);
	static int ind;
	
	public static void add(int[] week)
	{
		int index=0;
		while(index<week.length)
		{
			System.out.println("Enter the milage");
			week[index]=scan.nextInt(); 
			index++;
		}
		
		
	}
	public static void traverse(int[] kitkat)
	{
		if(ind>=kitkat.length)
			return;
		else
		{
			System.out.println(kitkat[ind]);
			ind++;
		}traverse(kitkat);
		
	}
	
	
	public static void main(String[] args)
	{
		int[] milage=new int[5];
		Arry.add(milage);
		Arry.ind=0;
		Arry.traverse(milage);
		
	}

}
