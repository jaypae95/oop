import java.util.Scanner;

public class EqTriangularPyramid extends EqTriangularPrism {
	Scanner input = new Scanner(System.in);
	private double slantHeight = 0;
	boolean isBreak = false;
	private boolean showpos = false;

	public void inputSlantHeight() throws InterruptedException {
		do {
			Thread.sleep(500);
			if (showpos == false) {
				System.out.printf("Please enter Slant Height : ");
			} else if (showpos == true) {
				System.out.printf("Please enter positive value for normal height : ");
			}
			try {
				this.setSlantHeight(input.nextDouble());
				if (this.getSlantHeight() < 0) {
					showpos = true;
					throw new ArithmeticException("Error : Slant height should be positive");
				}
				else if (this.getSlantHeight() < super.getHeight()) {
					throw new ArithmeticException("Error : Slant Height should be"
							+" larger than normal Height");
				}
				isBreak = true;

			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		} while (isBreak == false);

	}

	public double getSlantHeight() {
		return slantHeight;
	}
	public void setSlantHeight(double slantHeight) {
		this.slantHeight = slantHeight;
	}
	
	@Override
	public double getArea() {
		double a = super.getDistance(p[0], p[1]);
		double b = super.getDistance(p[0], p[2]);
		double c = super.getDistance(p[1], p[2]);
		double s = (a+b+c) / 2;
		double A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		// TODO Auto-generated method stub
		return A+ ((a+b+c)*this.getSlantHeight()/2);
	}
	
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return super.getVolume()/3;
	}

	@Override
	public String toString() {
		String s = String.format("Height : %.1f%n"
	+ "Slant Height : %.1f%n"
	+ "Surface Area : %.1f%n"
	+ "Volume : %.1f%n",
	super.getHeight(), this.getSlantHeight(), this.getArea(), this.getVolume());
		return super.getS1() + s;
	}

}
