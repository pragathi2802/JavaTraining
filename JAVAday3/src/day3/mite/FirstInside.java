package day3.mite;

public class FirstInside {
	String org;double pack;static int count;
	public String toString()
	{
		return org+" "+pack+" "+count+"\n ";
	}
static class Magno{
	String tech;
	public void detail()
	{
		System.out.println(tech);
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstInside first=new FirstInside();
		first.org="Infosys";first.pack=3.7;first.count=30;
		FirstInside second=new FirstInside();
		second.org="TCS";second.pack=6.5;second.count=12;
		System.out.println(first+"\n"+second);
		FirstInside.Magno mag=new FirstInside.Magno();
		mag.tech="Spring";mag.detail();
		
	}

}
