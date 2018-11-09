import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Test {

	public static void main(String[] args) {
		String s = new String("kim");// built-in String class
		System.out.println(s);
		
		Integer I = new Integer(10);// built-in wrapper class
		System.out.println(I);

		ArrayList L = new ArrayList(); // built-in collection Class
		L.add("A");
		L.add("B");
		System.out.println(L);

		Test t = new Test();// user defined class
		System.out.println(t.toString(s, I, L));
		System.out.println(t.hashCode());
	}
	
	public String toString(String s, Integer I, ArrayList L) {
		return s + " " + I + " " + L;
	}
}
