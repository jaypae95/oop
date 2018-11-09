import java.util.Scanner;

public class SquarePyramid extends SquarePrism{
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
					throw new ArithmeticException("Error : Slant Height should be "
							+"larger than normal Height");
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
		double a = getDistance(p[0], p[1]);
		// TODO Auto-generated method stub
		return Math.pow(a, 2)+ ((4*a)*this.getSlantHeight()/2);
	}
	
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return super.getVolume()/3;
	}

	@Override
	public String toString() {
		String s = String.format("normal height : %.1f%n"
	+ "Slant Height : %.1f%n"
	+ "Surface Area : %.2f%n"
	+ "Volume : %.2f%n",
	super.getHeight(), this.getSlantHeight(), this.getArea(), this.getVolume());
		return super.getS1() + s;
	}
}
