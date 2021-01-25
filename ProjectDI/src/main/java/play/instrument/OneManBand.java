package play.instrument;

import java.util.Collection;

// 해당 클래스는 컬렉션 Set, List를 사용
public class OneManBand implements Performer {
	private Collection<Instrument> abcd; // 연주할 목록
	
	// setter injection
	public void setAaa(Collection<Instrument> instruments) {
		// 매개 변수 이름과 인스턴스 변수 이름이 달라도 상관 없음
		this.abcd = instruments;
	}

	@Override
	public void perform() {
		System.out.println("확장 For를 이용하여 악기들을 연주 합니다.");
		
		for(Instrument inst : abcd) {
			inst.play();
		}
	}

}
