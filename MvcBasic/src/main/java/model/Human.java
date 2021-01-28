package model;

// bean 클래스 : JSP에서는 1건을 의미하는 객체
// Spring에서는 Command 객체
public class Human {
	private String id;
	private String name;
	private String hobby;
	private String special;
	private String birth;
	private String job;
	private String regdate;
	
	public Human() {}
	
	public Human(String id, String name, String hobby, String special, String birth, String job, String regdate) {
		super();
		this.id = id;
		this.name = name;
		this.hobby = hobby;
		this.special = special;
		this.birth = birth;
		this.job = job;
		this.regdate = regdate;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + ", hobby=" + hobby + ", special=" + special + ", birth=" + birth
				+ ", job=" + job + ", regdate=" + regdate + "]";
	}
	
}
