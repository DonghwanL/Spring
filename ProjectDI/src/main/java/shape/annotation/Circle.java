package shape.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


// Circle circle = new Circle();
// @Component Annotation은 Class 이름을 소문자로 만들어서 객체를 생성
@Component("myCircle") // 이름을 별도 지정
public class Circle implements Shape {
	
	// shpaeDao는 외부에서 주입 필요
	@Autowired(required = true) // 이 변수는 자동으로 주입 (required = true는 필수의 의미)
	@Qualifier("myCircleDao") // ShapeDao 타입 중에서 이름이 "myCircleDao"인 항목을 검색
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
