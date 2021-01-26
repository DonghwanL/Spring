package aopexam.sample01;

public class Order {
	// 로그인, 상품 주문, DB 저장, 로그아웃
	
	String msg = "상품 주문";
	
	public void order() {
		// 사전에 실행해야 할 공통 기능 (Aspect)
		System.out.println(msg + "을 위한 로그인을 수행 합니다.");
		
		// 핵심 기능
		System.out.println(msg + "하기"); 
		
		// 사후에 실행해야 할 공통 기능 (Aspect)
		System.out.println(msg + "내역을 데이터베이스에 저장 합니다.");
		System.out.println(msg + "을 위한 로그아웃을 수행 합니다.");
	}

}
