public class ThisTest {
	public static void main(String[] args) {
		SimpleTime time = new SimpleTime(15, 30, 19);
		System.out.println(time.buildString());
	}
} 

class SimpleTime {
	private int hour1;
	private int minute1;
	private int second1;

	
	public SimpleTime(int hour, int minute, int second) {
		hour1 = hour; 
		minute1 = minute; 
		second1 = second; 

	}

	// use explicit and implicit "this" to call toUniversalString
	public String buildString() {
		return String.format("%24s: %s%n%24s: %s", "this.toUniversalString()", this.toUniversalString(),
				"toUniversalString()", toUniversalString());
	}

	public String toUniversalString() {
		
		return String.format("%02d:%02d:%02d", hour1, minute1, second1);
	}
} 