package day2.mite;

public class bubble {
	
public static void bubble1(String take)
{
	byte[] got=take.getBytes();
	int pos=0,com=0;
	while(pos<got.length-1)
	{
		com=0;
		while(com<got.length-pos-1)
		{
			if(got[com]>got[com+1])
			{got[com]^=got[com+1];
			got[com+1]^=got[com];
			got[com]^=got[com+1];}
			com++;
			}
		pos++;
		}System.out.println(new String(got));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] orgs= {"birlasoft","ZOHO","Amazon","TCS"};
		Selection.sort(orgs);
		for(String yet:orgs) {
			System.out.println(yet);}
		String desired="DataScience";	
		bubble.bubble1(desired);
		System.out.println("Main remsins"+desired);
		
		


	}

}
