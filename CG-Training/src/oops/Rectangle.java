package oops;

public class Rectangle extends Shapes {
	int lenght;
	int breadth;

	public Rectangle(int lenght, int breadth) {
		super();
		this.lenght = lenght;
		this.breadth = breadth;
	}

	@Override
	public void draw() {
		int area = lenght * breadth;
		System.out.println("The area of the rectangle :" + area);

	}

}
