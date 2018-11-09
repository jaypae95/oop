import java.util.Scanner;

public class SquarePrism extends Square{
	Scanner input = new Scanner(System.in);
	private double height = 0;
	boolean isBreak = false;
	private boolean showpos = false;
	
	public void inputheight() {
		// TODO Auto-generated method stub
		do{
			isBreak = false;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
	
	public double getLeteralArea() {
		return  super.getDistance(p[0], p[1])*4*this.height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return super.getArea()*2 + this.getLeteralArea();
	}
	public double getVolume() {
		return super.getArea()*this.height;
	}
	
	@Override
	public String toString() {
		String s = String.format("Lateral Surface : %.2f%n"
	+"Surface Area : %.2f%n"
	+"Volume : %.2f%n"
	,this.getLeteralArea(), this.getArea(), this.getVolume());
		return super.getS1() + s;
	}
}
