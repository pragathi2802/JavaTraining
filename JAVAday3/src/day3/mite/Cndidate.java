package day3.mite;

public class Cndidate {

	private String name,skills;
	private Integer yrExp;
	public Cndidate(String name,String skills,Integer yrExp) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.skills=skills;
		this.yrExp=yrExp;
	}

	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSkills() {
		return skills;
	}


	public void setSkills(String skills) {
		this.skills = skills;
	}


	public Integer getYrExp() {
		return yrExp;
	}


	public void setYrExp(Integer yrExp) {
		this.yrExp = yrExp;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
