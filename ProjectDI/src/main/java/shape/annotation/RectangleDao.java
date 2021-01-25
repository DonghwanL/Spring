package shape.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("myRectangleDao")
public class RectangleDao implements ShapeDao {

	@Override
	public Object getShapeOne() {
		// 하나의 사각형 정보를 반환
		return new RectangleBean(10.0, 20.0);
	}

	@Override
	public List<Object> getAllShape() {
		// 여러 개의 사각형을 목록으로 반환
		
		List<Object> lists = new ArrayList<Object>();
		
		lists.add(new RectangleBean(10.0, 20.0));
		lists.add(new RectangleBean(20.0, 15.0));
		
		return lists;
	}

}
