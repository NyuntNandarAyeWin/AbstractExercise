package AbstractExercise;

public class Circle extends Shape{

	double radius = 1.0;
	
	public Circle() {
		this.radius = 1.0;
	}
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		super.setColor(color);
		super.setFilled(filled);
	}
	
	public double getArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public double getPerimeter() {
		double peri = 2 * radius * Math.PI;
		return peri;
	}
	
	public void display() {
		System.out.println(super.toString());
		System.out.println("Circle radius : "+radius) ;
		System.out.println("Circle Area : "+this.getArea());
		System.out.println("Circle Perimeter : "+this.getPerimeter());
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		Circle c2 = new Circle(3,"blue",false);
		
		c.display();
		c2.display();
	}
}
