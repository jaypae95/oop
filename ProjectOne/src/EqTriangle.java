import java.util.Scanner;

public class EqTriangle implements Shapes {
	Point2D[] p = new Point2D[3];
	Scanner input = new Scanner(System.in);
	private String s1 = "";
	private String s2 = "";
	private boolean isBreak = false;

	public void make() {
		for(int i = 0; i < 3; i++) {
			p[i] = new Point2D();
		}
		
	}
	public void input() throws InterruptedException {
		do {
			try {
				Thread.sleep(500);
				System.out.println();
				this.getValue();
				if(!this.isTriangle()) {
					throw new ArithmeticException("Error: the three vertices are collinear."
							+ " Please enter non-collinear vertices"); 
				}
				else if(!this.isEquilateral()) {
					isBreak = true;
					throw new ArithmeticException("Warning: the three sides are not equal, "
							+ "but continue your operation");
				}
				isBreak = true;
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		} while(isBreak == false);
	}
	
	public void getValue() {
		this.make();
		System.out.printf("Please input x-coordinate of the Vertex 1 of the triangle : ");
		p[0].setPointx(input.nextDouble());
		System.out.printf("Please input y-coordinate of the Vertex 1 of the triangle : ");
		p[0].setPointy(input.nextDouble());
		System.out.printf("Please input x-coordinate of the Vertex 2 of the triangle : ");
		p[1].setPointx(input.nextDouble());
		System.out.printf("Please input y-coordinate of the Vertex 2 of the triangle : ");
		p[1].setPointy(input.nextDouble());
		System.out.printf("Please input x-coordinate of the Vertex 3 of the triangle : ");
		p[2].setPointx(input.nextDouble());
		System.out.printf("Please input y-coordinate of the Vertex 3 of the triangle : ");
		p[2].setPointy(input.nextDouble());
	}
	
	public boolean isTriangle() {
		if((p[1].getPointy()-p[0].getPointy())/(p[1].getPointx()-p[0].getPointx())
				== (p[2].getPointy()-p[0].getPointy())/(p[2].getPointx()-p[0].getPointx())) {
			return false;
		}
		else if((p[0].getPointx() == p[1].getPointx()) && (p[0].getPointx() == p[2].getPointx())) {
			return false;
		}
		else if((p[0].getPointy() == p[1].getPointy()) && (p[0].getPointy() == p[2].getPointy())) {
			return false;
		}
		else return true;
	}
	
	public boolean isEquilateral() {
		if(this.getDistance(p[0], p[1]) == this.getDistance(p[0], p[1]) &&
				this.getDistance(p[0], p[1]) == this.getDistance(p[1], p[2])) {
			return true;
		}
		else return false;
	}
	@Override
	public double getDistance(Point2D p1, Point2D p2) {
		return Math.sqrt(Math.pow(p2.getPointx()-p1.getPointx(), 2) + 
				Math.pow(p2.getPointy()-p1.getPointy(), 2));
	}

	@Override
	public double getArea() {
		double a = this.getDistance(p[0], p[1]);
		double b = this.getDistance(p[0], p[2]);
		double c = this.getDistance(p[1], p[2]);
		double s = (a+b+c) / 2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	public String getS1() {
		String type = "Equilateral Triangle";
		this.s1 = String.format("Type of shape: %s%n"
				+ "Coordinates of Vertex 1 point: %.1f, %.1f%n"
				+ "Coordinates of Vertex 2 point: %.1f, %.1f%n"
				+ "Coordinates of Vertex 3 point: %.1f, %.1f%n"
				+ "Length of side 1: %.1f%n"
				+ "Length of side 2: %.1f%n"
				+ "Length of side 3: %.1f%n",
				type, p[0].getPointx(), p[0].getPointy(), p[1].getPointx(), p[1].getPointy(),
				p[2].getPointx(), p[2].getPointy(), this.getDistance(p[0], p[1]),
				this.getDistance(p[1], p[2]), this.getDistance(p[0], p[2]));
				
		return s1;
	}

	public String getS2() {
		 s2= String.format("Surface Area : %.1f%n", this.getArea());
		return s2;
	}
	@Override
	public String toString() {
		return this.getS1() + this.getS2();
	}
	
}
