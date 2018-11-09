import java.util.Scanner;

public class Square implements Shapes{
	Point2D[] p = new Point2D[2];
	Scanner input = new Scanner(System.in);
	private String s1 = "";
	private String s2 = "";
	private boolean isBreak = false;
	
	public void make() {
		for(int i = 0; i < 2; i++) {
			p[i] = new Point2D();
		}
		
	}
	
	public void input() throws InterruptedException {
		do {
			try {
				isBreak = false;
				Thread.sleep(500);
				System.out.println();
				this.getValue();
				if(!this.isUL()) {
					throw new ArithmeticException("Error : x-coordinate of upper-left vertex"
							+" should be less than x-coordinate of lower right vertex."
							+" Please enter valid coordinates."); 
				}
				else if(!this.isLR()) {
					throw new ArithmeticException("Error : y-coordinate of upper-left vertex"
							+" should be less than x-coordinate of lower-right vertex."
							+" Please enter valid coordinates.");
				}
				isBreak = true;
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		} while(isBreak == false);
	}
	public void getValue() {
		this.make();
		System.out.printf("Please input x-coordinate of the Upper Left of the square : ");
		p[0].setPointx(input.nextDouble());
		System.out.printf("Please input y-coordinate of the Upper Left of the square : ");
		p[0].setPointy(input.nextDouble());
		System.out.printf("Please input x-coordinate of the Lower Right of the square : ");
		p[1].setPointx(input.nextDouble());
		System.out.printf("Please input y-coordinate of the Lower Right of the sqaure : ");
		p[1].setPointy(input.nextDouble());
		
	}
	
	public boolean isUL() {
		if(p[0].getPointx() < p[1].getPointx()) {
			return true;
		}
		else return false;
	}
	
	public boolean isLR() {
		if(p[0].getPointy() > p[1].getPointy()) {
			return true;
		}
		else return false;
	}
	@Override
	public double getDistance(Point2D p1, Point2D p2) {
		return (Math.sqrt(Math.pow(p2.getPointx()-p1.getPointx(), 2) + 
				Math.pow(p2.getPointy()-p1.getPointy(), 2))/Math.sqrt(2));
	}

	@Override
	public double getArea() {
		return Math.pow(this.getDistance(p[0],p[1]), 2);
	}
	
	public String getS1() {
		String type = "Square";
		this.s1 = String.format("Type of shape: %s%n" 
				+ "Coordinates of Upper Left vertex: %.1f, %.1f%n"
				+ "Coordinates of Lower Right vertex: %.1f, %.1f%n"
				+ "Side of a Square: %.2f%n",
				type, p[0].getPointx(), p[0].getPointy(), p[1].getPointx(), p[1].getPointy(),
				this.getDistance(p[0], p[1]));
				
		return s1;
	}

	public String getS2() {
		 s2= String.format("Surface Area : %.2f%n", this.getArea());
		return s2;
	}
	@Override
	public String toString() {
		return this.getS1() + this.getS2();
	}
}
