package aopexam.sample02;

public class DataBase {
	
	// 데이터베이스와 관련된 기능을 별도로 생성
	public static void save(String msg) {
		System.out.println(msg + "내역을 데이터 베이스에 저장 합니다.");
	}

}
