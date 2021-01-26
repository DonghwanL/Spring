package aopexam.sample03;

//로그아웃과 관련된 공통 기능 (Aspect)을 구현
public class Logout {
	
	public void logout() {
		System.out.println("로그아웃 기능을 수행 합니다.");
	}
}
