package prac;

public class Circle {
	private final double PI = 3.15 ;
	
	public int radius;
	public String name;
	
	public Circle() {
		
	}
	
	public double getPI() {
		return this.PI;
	}
	
	public double getArea() {
		return PI * radius * radius;
	} //입력한 radius가 여기에 접근해서 원의 면적을 구함
	
	public static void main(String[] args) {
		System.out.println("Class and Object Practice");
	}

}
