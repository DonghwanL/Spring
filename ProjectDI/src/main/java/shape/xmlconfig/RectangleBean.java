package shape.xmlconfig;

public class RectangleBean {
	private double base; // 밑변
	private double height; // 높이
	
	public RectangleBean(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public String toString() {
		String imsi = "";
		imsi += "밑변 : " + base + "\n";
		imsi += "높이 : " + height + "\n";
		imsi += "면적 : " + base * height + "\n";
				
		return imsi;
	}
	
}
