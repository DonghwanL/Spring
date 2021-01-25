package shape.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myRectangle")
public class Rectangle implements Shape {
	@Autowired(required = true) // 이 변수는 자동으로 주입 (required = true는 필수의 의미)
	@Qualifier("myRectangleDao") // ShapeDao 타입 중에서 이름이 "myCircleDao"인 항목을 검색
	private ShapeDao shapeDao; // 약한 결합
	
	@Override
	public Object getShapeOne() {
		return this.shapeDao.getShapeOne();
	}

	@Override
	public List<Object> getAllShape() {
		return this.shapeDao.getAllShape();
	}

}
