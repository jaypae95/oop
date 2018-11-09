// Student.java
class Student {
	String name;
	int ID;

	public Student(String name, int ID) {
		this.name = name;
		this.ID = ID;
	}

	public boolean equals(Object obj) // S1.equal(S2)
	{
		if (obj == this)// instead of comparing field by field
		{
			return true;
		}
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (name.equals(s.name) && (ID == s.ID)) {
				return true;
			} else {
				return false;
			}
		} // end of if block
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Student S1 = new Student("kim", 101);
		Student S2 = new Student("Homin", 102);
		Student S3 = new Student("Homin", 102);
		Student S4 = S1;
		System.out.println(S1.equals(S2)); // 1:false
		System.out.println(S2.equals(S3)); // 2:False/true
		System.out.println(S1.equals(S4)); // 3:true
		System.out.println(S1.equals("kim"));// 4:false/classCast Exception
		System.out.println(S1.equals(null));// 4:false/NullPointerException
	}// end of main
}// end of class
