package day2.mite;

public class Selection {

	public static void sort(String[] oreo) {
		// TODO Auto-generated method stub
		
		int pos=0,com=0;String temp=null;
		while(pos<oreo.length)
		{
			com=pos+1;
			while(com<oreo.length)
			{
				if(oreo[pos].compareTo(oreo[com])>0)
				{temp=oreo[pos];oreo[pos]=oreo[com];oreo[com]=temp;}com++;
		    }
			pos++;

	    }
	}
		public static void main(String[] args) {
			String[] orgs= {"Oreo","Infosys","Amazon","TCS"};
					Selection.sort(orgs);
					for(String arg1:orgs)
						System.out.println(arg1);
					
			}
		}

