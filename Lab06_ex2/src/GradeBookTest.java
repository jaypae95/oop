public class GradeBookTest {

   public static void main(String[] args) {
      int[] gradesArray= {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
      GradeBook myGradeBook=new GradeBook(
            "CS101 Introduction to Java Programming",gradesArray);
      System.out.printf("Welcome to the grade book for%n%s%n%n",
            myGradeBook.getCourseName());
      myGradeBook.outputGrades();
      System.out.printf("%nClass average is %.2f%n", myGradeBook.getAverage());

      System.out.printf("Lowest grade is %d%n"
      		+ "Highest grade is %d%n%n",
      		myGradeBook.getMinimum(), myGradeBook.getMaximum());
      myGradeBook.outputBarChart();

     // myGradeBook.processGrades();

   }

}