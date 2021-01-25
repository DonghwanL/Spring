package shape.xmlconfig;

import java.util.List;

// 도형과 관련하여 데이터베이스와 연동할 다오 인터페이스
public interface ShapeDao {
	public Object GetShapeOne(); // 도형 하나의 정보
	public List<Object> GetAllShapes(); // 도형 여러개의 목록
}
