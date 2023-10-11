package prac;

public class Circle2 {
    private final double PI = 3.14;
    
    public int radius;
    public String name;

    public Circle2() {
        this(1, "random pizza");
    }

    public Circle2(Circle2 c) {
        this.radius = c.radius;
        this.name = new String(c.name);
    }

    public Circle2(int r, String n) {
        this.initialize(r, n);
    }

    public void initialize(int r, String n) {
        this.radius = r;
        this.name = n;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getPI() {
        return this.PI;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public String toString() {
        return "name: " + getName() + ", radius: " + getRadius();
    }

    public static void main(String[] args) {
        System.out.println("Class and Object Practice");

        // Creating Circle2 object
        Circle2 pizza = new Circle2();

        // Initialization using reference variable
        pizza.radius = 10;
        pizza.name = "Cheese Pizza";

        // Test
        System.out.println(pizza.toString());

        // Code for initialization using method
        Circle2 pizza2 = new Circle2();

        pizza2.initialize(8, "Chicago Pizza");

        // Test
        System.out.println(pizza2.toString());

        // Code for initialization using constructor
        Circle2 pizza3 = new Circle2(15, "Hawaiian Pizza");
        System.out.println(pizza3.toString());
    }
}



