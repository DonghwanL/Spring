package shape.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("myCircleDao") // CircleDao myCircleDao = new CircleDao();
public class CircleDao implements ShapeDao {

	@Override
	public Object getShapeOne() {
		// 하나의 원 정보를 반환
		return new CircleBean(3.0, 4.0, 5.0);
	}

	@Override
	public List<Object> getAllShape() {
		// 여러 개의 원을 목록으로 반환
		
		List<Object> lists = new ArrayList<Object>();
		
		lists.add(new CircleBean(3.0, 4.0, 5.0));
		lists.add(new CircleBean(4.0, 5.0, 6.0));
		lists.add(new CircleBean(5.0, 6.0, 7.0));
		
		return lists;
	}

}
