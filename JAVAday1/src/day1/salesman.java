package day1;
import java.util.Scanner;
public class salesman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String company;
		int salary;
		int exper;
		Scanner s=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter name ,company name,salary,experiece");
		name=s.next();
		company=s.next();
		exper=s.nextInt();
		salary=s.nextInt();
		System.out.println(salary);
		if(exper<3)
		System.out.println("Project head");
		else if(exper>3 && exper<5)
		System.out.println("branch head");
		else
		System.out.println("dist manager");
		double sal1=(double)salary/3;
		   double sal2=(double)salary/4;
		System.out.println(sal1);
		System.out.println(sal2);

	}

}
