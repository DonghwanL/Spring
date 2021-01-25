package mypkg.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 이 클래스를 설정 파일로 사용
public class MyJavaConfig {
	
	@Bean
	public Member myuser() {
		return new Member("hong", "홍길동", 30);
	}
	
	@Bean
	public Member youruser() {
		return new Member("park", "박영희", 30);
	}
	
	@Bean(name = "renamechoi")
	public Member choi() {
		return new Member("choi", "최영", 2000);
	}
	
	@Bean
	public List<Member> allList() {
		List<Member> lists = new ArrayList<Member>();
		
		lists.add(myuser());
		lists.add(youruser());
		lists.add(choi());
		
		return lists;
	}
}
