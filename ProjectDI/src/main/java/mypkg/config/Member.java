package mypkg.config;

public class Member {
	private String id;
	private String name;
	private int age;
	
	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		String imsi = "";
		
		imsi += "ID : " + id + ", 이름 : " + name + ", 나이 : " + age;
		return imsi;
	}
	
	
}
