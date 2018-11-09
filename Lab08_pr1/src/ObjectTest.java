import java.lang.reflect.Method;

// ObjectTest.java

public class ObjectTest {
	public static void main(String[] args) throws ClassNotFoundException   {
		int count = 0;
		Class c = Class.forName("java.lang.Object");
		Method[] m = c.getDeclaredMethods();
		for (Method mi : m) // java.lang.reflect.Method
		{
			System.out.println(mi.getName());
			count++;
		}
		System.out.println("the number of methods:" + count);
	}// end of main
}// end of class
