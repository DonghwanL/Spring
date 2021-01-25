package play.instrument;

import java.util.Map;

// 해당 클래스는 컬렉션 Map을 사용
public class OneManBandMap implements Performer {
	private Map<String, Instrument> abcd; // 연주할 목록을 저장할 맵 자료형
	
	// setter injection
	public void setCcc(Map<String, Instrument> instruments) {
		// 매개 변수 이름과 인스턴스 변수 이름이 달라도 상관 없음
		this.abcd = instruments;
	}

	@Override
	public void perform() {
		System.out.println("맵 구조를 반복하여 악기들을 연주 합니다.");
		
		for(String key : abcd.keySet()) {
			Instrument inst = abcd.get(key);
			System.out.println(key + " : ");
			inst.play();
		}
	}

}
