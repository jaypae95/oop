import java.util.InputMismatchException;

public class TestShapes {
	public static void main(String[] args) throws InterruptedException {
		
		try {
		EqTriangle et = new EqTriangle();
		Square sq = new Square();
		EqTriangularPrism etpr = new EqTriangularPrism();
		SquarePrism sqpr = new SquarePrism();
		EqTriangularPyramid etpy = new EqTriangularPyramid();
		SquarePyramid sqpy = new SquarePyramid();

		System.out.println("===Equilateral Triangle===");
		et.input();
		
		Thread.sleep(500);
		System.out.println();
		System.out.println("===Square===");
		sq.input();
		
		System.out.println();
		System.out.println("===Equilateral Trianglular Prism===");
		etpr.input();
		etpr.inputheight();
		
		System.out.println();
		System.out.println("===Square Prism===");
		sqpr.input();
		sqpr.inputheight();
		
		System.out.println();
		System.out.println("===Equilateral Triangular Pyramid===");
		etpy.input();
		etpy.inputheight();
		etpy.inputSlantHeight();
		
		System.out.println();
		System.out.println("===Square Pyramid===");
		sqpy.input();
		sqpy.inputheight();
		sqpy.inputSlantHeight();
		
		System.out.println();
		System.out.println(et.toString());
		System.out.println(sq.toString());
		System.out.println(etpr.toString());
		System.out.println(sqpr.toString());
		System.out.println(etpy.toString());
		System.out.println(sqpy.toString());
		

		EqTriangle et2 = new EqTriangle();
		Square sq2 = new Square();
		EqTriangle etpr2= new EqTriangularPrism();
		Square sqpr2 = new SquarePrism();
		EqTriangle etpy2 = new EqTriangularPyramid();
		Square sqpy2 = new SquarePyramid();
		
		System.out.println("===Equilateral Triangle===");
		et2.input();
		
		Thread.sleep(500);
		System.out.println();
		System.out.println("===Square===");
		sq2.input();
		
		System.out.println();
		System.out.println("===Equilateral Trianglular Prism===");
		etpr2.input();
		((EqTriangularPrism) etpr2).inputheight();
		
		System.out.println();
		System.out.println("===Square Prism===");
		sqpr2.input();
		((SquarePrism) sqpr2).inputheight();
		
		System.out.println();
		System.out.println("===Equilateral Triangular Pyramid===");
		etpy2.input();
		((EqTriangularPrism) etpy2).inputheight();
		((EqTriangularPyramid) etpy2).inputSlantHeight();
		
		System.out.println();
		System.out.println("===Square Pyramid===");
		sqpy2.input();
		((SquarePrism) sqpy2).inputheight();
		((SquarePyramid) sqpy2).inputSlantHeight();
		
		System.out.println();
		System.out.println(et2.toString());
		System.out.println(sq2.toString());
		System.out.println(etpr2.toString());
		System.out.println(sqpr2.toString());
		System.out.println(etpy2.toString());
		System.out.println(sqpy2.toString());
		} 
		catch (InputMismatchException e) {
			System.out.println("Error : please enter real number.");
		}
	}
}
