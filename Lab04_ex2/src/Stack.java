
public class Stack {
	private static int[] a;
	private static int top;
	
	public static void push(int n){
		a[top]=n;
		top++;
	}
	
	public static int pop(){
		top--;
		return a[top];
	}
	
	public static void main(String[] args){
		a= new int [10];
		top = 0;
		push(1);
		push(2);
		System.out.println(pop());
		push(3);
		System.out.println(pop());
		System.out.println(pop());
	}//end of main
}