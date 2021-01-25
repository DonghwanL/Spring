package shape.xmlconfig;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeMain {

	public static void main(String[] args) {
		String configLocation = "shape/xmlconfig/xmlconfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		//Circle circle = (Circle)context.getBean("circle");
		Circle circle2 = context.getBean(Circle.class);
		
		Object mycircle = circle2.GetShapeOne();
		System.out.println(mycircle.toString());
		System.out.println();
		
		List<Object> mycirclelist = circle2.GetAllShapes();
		System.out.println();
		
		for(Object circle : mycirclelist) {
			System.out.println(circle.toString());
		}
		
		
		System.out.println("사각형 정보 출력");
		
		Rectangle rectangle = (Rectangle)context.getBean("rectangle");
		
		Object rectangleOne = rectangle.GetShapeOne();
		System.out.println(rectangleOne.toString());
		System.out.println();
		
		List<Object> rectanglelist = rectangle.GetAllShapes();
		
		for(Object rectangleAll : rectanglelist) {
			System.out.println(rectangleAll.toString());
		}
		
	}

}
