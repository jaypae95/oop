import java.io.*;

class Demo1 {

	public static FileInputStream M1(String fileName) throws FileNotFoundException {
		FileInputStream fis2 = new FileInputStream(fileName);
		System.out.println("M1: File input stream created");
		return fis2;
	}

	public static void main(String args[]) {
		FileInputStream fis1 = null;
		String fileName = "foo.bar";

		System.out.println("main: Starting " + Demo1.class.getName() + "with file name = " + fileName);
		try {
			fis1 = M1(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("file not found.");
		}
		System.out.println("main:" + Demo1.class.getName() + "ended");
	}
}
