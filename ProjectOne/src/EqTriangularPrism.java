import java.util.Scanner;

public class EqTriangularPrism extends EqTriangle{
	Scanner input = new Scanner(System.in);
	private double height = 0;
	boolean isBreak = false;
	private boolean showpos = false;
	
	public void inputheight() throws InterruptedException {
		// TODO Auto-generated method stub
		do{
			Thread.sleep(500);
			
			if(showpos == false) {
				System.out.printf("Please enter normal height : ");
			}
			else if(showpos == true) {
				System.out.printf("Please enter positive value for normal height : ");
			}
			try {
				this.setHeight(input.nextDouble());
				if(this.getHeight() <= 0) {
					showpos = true;
					throw new ArithmeticException("Error : Normal height should be positive");
				}
				isBreak = true;
				
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}while(isBreak == false);
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		double a = super.getDistance(p[0], p[1]);
		double b = super.getDistance(p[0], p[2]);
		double c = super.getDistance(p[1], p[2]);
		// TODO Auto-generated method stub
		return super.getArea()*2 + (a+b+c)*this.height;
	}
	public double getVolume() {
		return super.getArea()*this.height;
	}
	
	@Override
	public String toString() {
		String s = String.format("Height : %.1f%n"
	+ "Surface Area : %.1f%n"
	+ "Volume : %.1f%n",
	this.getHeight(), this.getArea(), this.getVolume());
		return super.getS1() + s;
	}
}
