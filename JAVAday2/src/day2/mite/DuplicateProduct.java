package day2.mite;
import java.util.Scanner;
public class DuplicateProduct {
	public static int[] remdup(int[] a) {
		int[] b=new int[a.length];
		int s;
		int j;
		int pos=0;
		for(int i=0;i<a.length;i++)
		{
			s=0;
			for(j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					s=1;
					break;
				}
			}
			if(s==0)
			{
				b[pos]=a[i];
				pos++;
			}
		}
		return b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no. of elements");
		Scanner s=new Scanner(System.in);
		Integer ch=s.nextInt();
		int[] ss=new int[ch];
		for(int i=0;i<ch;i++)
			ss[i]=s.nextInt();
		int[] m=DuplicateProduct.remdup(ss);
		
		 //{1,3,2,2,4,1,1,5};
		//int[] ss=remdup(elem);
		for(int i=0;i<ss.length && m[i]!=0;i++)
			System.out.print(m[i]+" ");


	}

}


	