package oops;

public class Square extends Shapes {
	int side;
	
	

	public Square(int side) {
		super();
		this.side = side;
		
	}


	@Override
	public void draw() {
		int area=side*side;
		System.out.println("area of the square is :"+ area);
		
	}

}
