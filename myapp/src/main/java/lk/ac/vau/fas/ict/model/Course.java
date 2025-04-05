package lk.ac.vau.fas.ict.model;

public class Course {
	
	   private String name;
	   private String code;
	   private int credit;
	   
	public Course(String name, String code, int credit) {
		super();
		this.name = name;
		this.code = code;
		this.credit = credit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	   
	   
}
