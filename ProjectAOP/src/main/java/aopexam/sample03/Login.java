package aopexam.sample03;

// 로그인과 관련된 공통 기능 (Aspect)을 구현
public class Login {
	public void login() {
		System.out.println("로그인 기능을 수행 합니다.");
	}
	
	public void welcome() {
		System.out.println("환영합니다 :)");
	}
}
