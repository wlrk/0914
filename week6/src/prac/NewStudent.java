package prac;

class NewStudent extends Person {
	
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		setWeight(99);
	}
	
	public void showStudent() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("height: " + height);
		System.out.println("weight: " + getWeight());
	}

}