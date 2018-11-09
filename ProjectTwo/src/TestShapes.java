import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class TestShapes {

	public static void main(String[] args) throws InterruptedException {

		PrintWriter output = null;
		BufferedReader input = null;
		String res = null;
		SquarePyramid[] sqpy = new SquarePyramid[3];
		File file = new File("SquarePyramid.txt");
		try {
			output = new PrintWriter(file);
			output.format(" x1\ty1\tx2\ty2\tside\tnh\tsh\tarea\tvolume%n");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		for (int i = 0; i < 3; i++) {
			try {
				sqpy[i] = new SquarePyramid();
				System.out.println();
				System.out.println("===Square Pyramid===");
				sqpy[i].input();
				sqpy[i].inputheight();
				sqpy[i].inputSlantHeight();

				// System.out.println();
				// System.out.println(sqpy.toString());
			} catch (InputMismatchException e) {
				System.out.println("Error : please enter real number.");
			}

			output.format("%-10.1f %-10.1f %-12.1f %-11.1f %-12.2f %-10.1f %-10.1f %-13.2f %-10.2f%n", sqpy[i].p[0].getPointx(),
					sqpy[i].p[0].getPointy(), sqpy[i].p[1].getPointx(), sqpy[i].p[1].getPointy(),
					sqpy[i].getDistance(sqpy[i].p[0], sqpy[i].p[1]), sqpy[i].getHeight(), sqpy[i].getSlantHeight(), sqpy[i].getArea(),
					sqpy[i].getVolume());
		}
		output.close();

		try {
			input = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			res = input.readLine();
			while ((res = input.readLine()) != null) {
				StringTokenizer token = new StringTokenizer(res, " ");
				double buf[] = new double[9];
				for (int i = 0; i < 9; i++) {
					buf[i] = Double.parseDouble(token.nextToken());
				}
				System.out.println();
				System.out.println("Properties of Square Pyramid");
				System.out.printf(
						"coordinates of upper left vertex of the square" + "as the base of the pyramid: %.1f %.1f%n",
						buf[0], buf[1]);
				System.out.printf(
						"coordinates of lower right vertex of the square" + "as the base of the pyramid: %.1f %.1f%n",
						buf[2], buf[3]);
				System.out.printf("Side of a square as the base of the pyramid: %.2f%n", buf[4]);
				System.out.printf("normal height of the pyramid: %.1f%n", buf[5]);
				System.out.printf("slant Height of the pyramid: %.1f%n", buf[6]);
				System.out.printf("Surface Area of the pyramid:  %.2f%n", buf[7]);
				System.out.printf("volume of the pyramid: %.2f", buf[8]);
				System.out.println();
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
