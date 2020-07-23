package AbstractExercise;

public class Square extends Rectangle{

	public Square() {
		super();
	}
	public Square(double side) {
		this.width = side;
		this.length = side;
	}
	public Square(double side, String color, boolean filled) {
		this.width = side;
		this.length = side;
		this.color = color;
		this.filled = filled;
	}
	
	public void setWidth(double side) {
		this.width = side;
	}
	
	public void setLength(double side) {
		this.length = side;
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
		Square sq = new Square();
		Square sq1 = new Square(10);
		Square sq2 = new Square(20, "yello", false);
		
		sq.display();
		sq1.display();
		sq2.display();
	}

}
