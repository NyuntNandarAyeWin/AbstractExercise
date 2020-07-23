package AbstractExercise;

public class Rectangle extends Shape{
	
	double width = 1.0;
	double length = 1.0;
	
	public Rectangle() {
		this.width = 1.0;
		this.length = 1.0;
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		this.width = width;
		this.length = length;
		super.setColor(color);
		super.setFilled(filled);
	}
	
	@Override
	public double getArea() {
		double area = width * length ;
		return area;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		double peri =2 * (width + length);
		return peri;
	}
	
	public void display() {
		System.out.println(super.toString());
		System.out.println("Rectangle Width : "+width) ;
		System.out.println("Rectangle Length : "+length);
		System.out.println("Rectangle Area : "+this.getArea());
		System.out.println("Rectangle Perimeter : "+this.getPerimeter());
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle re = new Rectangle();
		Rectangle re1 = new Rectangle(10, 20);
		Rectangle re2 = new Rectangle(15, 30, "purple", false);
		
		re.display();
		re1.display();
		re2.display();
	}

	

}
