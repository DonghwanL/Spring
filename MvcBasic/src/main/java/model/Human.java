package model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

// bean 클래스 : JSP에서는 1건을 의미하는 객체
// Spring에서는 Command 객체
public class Human {
	@Length(min=4, max=15, message="ID는 최소 4자리 최대 15자리 입니다.")
	@NotEmpty(message="ID는 필수 입력 사항 입니다.")
	private String id;
	
	@Length(min=3, max=12, message="이름은 최소 3자리 최대 12자리 입니다.")
	@NotEmpty(message="이름은 필수 입력 사항 입니다.")
	private String name;
	
	@NotNull(message="취미를 반드시 선택해 주세요")
	private String hobby;
	
	@NotNull(message="특기를 반드시 선택해 주세요")
	private String special;
	
	@NotEmpty(message="생일은 필수 입력 사항 입니다.")
	@Pattern(regexp="\\d{4}[-/]\\d{2}[-/]\\d{2}", message="생일은 YYYY/MM/DD 또는 YYYY-MM-DD 형식으로 입력 해주세요")
	private String birth;
	
	@Range(min=1, message="직업을 반드시 선택해 주세요")
	private String job;
	
	@Pattern(regexp="\\d{4}[-/]\\d{2}[-/]\\d{2}", message="날짜는 YYYY/MM/DD 또는 YYYY-MM-DD 형식으로 입력 해주세요")
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
