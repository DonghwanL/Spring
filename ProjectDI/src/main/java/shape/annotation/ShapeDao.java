package shape.annotation;

import java.util.List;

public interface ShapeDao {
	public Object getShapeOne(); // 도형 1개의 정보 구하기
	public List<Object> getAllShape(); // 모든 도형의 정보 구하기
}
