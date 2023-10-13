package prac;

public class ColorPointEx {
	public static void mian(String[] args) {
		MyPoint p = new MyPoint();  //create MyPoint object
		p.set(1, 2);     //call set() of MyPoint class
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();   //object of ColorPoint
		cp.set(3, 4);          //call set() of MyPoint class
		cp.setColor("red");    //call setColor() of ColorPoint class
		cp.showColorPoint();   //print color and coordination
	}
}
