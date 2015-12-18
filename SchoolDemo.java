import java.io.FileNotFoundException;

public class SchoolDemo
{
	
	//test case #10
	
//	public static void main(String[] args) throws FileNotFoundException
//	  {
//	    School itcd = new School("ITCD");
//	    
//	    itcd.readData("test.txt");
//	    
//	    itcd.deleteCourse(303); 
//	    itcd.deleteCourse(304); 
//	    System.out.println("\n\n===== ANSWER: Only 2 Courses with 301 (3 enrolled) and 302 (3 enrolled) =====\n");
//	    itcd.courseInfo();
//	  }
//	
	
	
	//test case #9
	
//	public static void main(String[] args) throws FileNotFoundException
//	  {
//	    School itcd = new School("ITCD");
//	    
//	    itcd.readData("test9.txt");
//	    
//	    itcd.graduateStudent(1111);
//	    itcd.graduateStudent(2222);
//	    
//	    System.out.println("\n\n===== ANSWER: 4 courses with only one student enrolled in each course. =====\n");
//	    itcd.courseInfo();
//	  }
	
	
	//test case #8
	
//	  public static void main(String[] args) throws FileNotFoundException
//	  {
//	    School itcd = new School("ITCD");
//	    
//	    itcd.readData("test8.txt");
//	    
//	    itcd.graduateStudent(1111);
//	    
//	    System.out.println("\n\n===== ANSWER: Not exist (Student 1111) =====\n");
//	    itcd.studentInfo(1111);
//	  }
	
	//test case #7
	
//	public static void main(String[] args) throws FileNotFoundException
//	  {
//	    School itcd = new School("ITCD");
//	    
//	    itcd.readData("test7.txt");
//	    
//	    itcd.addStudent(222, "BB BBBB", 301, 85.00, "B");
//	    itcd.addStudent(333, "CC CCCC", 301, 75.00, "C");
//	    itcd.addStudent(444, "DD DDDD", 301, 65.00, "D");
//	    itcd.addStudent(555, "FF FFFF", 301, 55.00, "F");
//	    
//	    System.out.println("\n\n===== ANSWER: 301 (C. CCC) with 5 students (AVG: 75.00) =====\n");
//	    itcd.courseInfo(301);
//	  }
	
	//test case #6
	
//	public static void main(String[] args) throws FileNotFoundException
//	  {
//	    School itcd = new School("ITCD");
//	    
//	    itcd.readData("test6.txt");
//	    
//	    System.out.println("\n\n===== ANSWER: 2 course deletions should be failed. =====\n");    
//	    itcd.deleteCourse(301); 
//	    itcd.deleteCourse(302); 
//	  }
	
	//test case #5
	
//	public static void main(String[] args) throws FileNotFoundException
//	  {
//	    School itcd = new School("ITCD");
//	    
//	    itcd.readData("test5.txt");
//	 
//	    System.out.println("\n\n===== ANSWER: 3 Courses with 301 (3 enrolled), 302 (3 enrolled) and 303 (0 enrolled) =====\n");
//	    itcd.courseInfo();
//	  }
	
	//test case #4
	
//	public static void main(String[] args) throws FileNotFoundException
//	  {
//	    School itcd = new School("ITCD");
//	    Course course305;
//	    
//	    itcd.readData("test4.txt");
//	    
//	    course305 = itcd.getCourse(305);
//	    course305.updateLocation("ERROR ROOM");
//	    course305.updateLocation("MLC 104");
//	 
//	    System.out.println("\n\n===== ANSWER: CST305 (A. AAA) at MLC 104 with 2 students (AVG: 75.00) =====\n");
//	    itcd.courseInfo(305);
//	  }
	
	//test case #3
	
//	 public static void main(String[] args) throws FileNotFoundException
//	  {
//	    School itcd = new School("ITCD");
//	    
//	    itcd.readData("test3.txt");
//	    
//	    itcd.addInstructor(200, "B. BBB", "bbb@csumb.edu", "222-222-2222");
//	    itcd.addInstructor(300, "C. CCC", "ccc@csumb.edu", "333-333-3333");
//	    itcd.addCourse(302, "CST302 - Course 302", 200, "MLC102");
//	    itcd.addCourse(303, "CST303 - Course 303", 300, "MLC103");
//	    itcd.addCourse(304, "CST304 - Course 304", 100, "MLC104");
//	    itcd.addCourse(305, "CST305 - Course 305", 200, "MLC105");
//	 
//	    System.out.println("\n\n===== ANSWER: 3 Instructors, 5 Courses, 1 Student =====\n");
//	    itcd.schoolInfo();
//	  }
	
	//test case #2
	
	public static void main(String[] args) throws FileNotFoundException
	  {
	    School itcd = new School("ITCD");
	 
	    itcd.readData("test2.txt");
	    
	    System.out.println("\n\n===== ANSWER: The program should display three failed course additions. =====\n");
	    itcd.addCourse(301, "CST301 - Incorrect Course A", 100, "ERROR301");
	    itcd.addCourse(308, "CST308 - Course 308", 300, "MLC103");
	    itcd.addCourse(309, "CST309 - Course 309", 400, "MLC104");
	    itcd.addCourse(308, "CST308 - Incorrect Course B", 100, "ERROR308");
	    itcd.addCourse(305, "CST305 - Incorrect Course C", 100, "ERROR305");
	    itcd.addCourse(310, "CST310 - Course 310", 500, "MLC105");
	  }
//	
	//test case #1
	
//	public static void main(String[] args) throws FileNotFoundException
//	  {
//	    School itcd = new School("ITCD");
//	 
//	 
//	    itcd.readData("test1.txt");
//	 
//	    System.out.println("\n\n===== ANSWER: 1 Instructor (Byun), 1 Course (CST338), 1 Student (Alice) =====\n");
//	    itcd.schoolInfo();
//	  }
	
	
	/*
 public static void main(String[] args) throws FileNotFoundException
 {
 School itcd = new School("ITCD");
 Course course1;
 System.out.println(("===== Read Data ====="));
itcd.readData("test.txt");

 
 //adding manually for testing
 //*************************************************************/
// itcd.addInstructor(100,"Y. Byun","ybyun@csumb.edu","111-111-1111");
// itcd.addInstructor(200,"S. Narayanan","sathya@csumb.edu","222-222-2222");
// itcd.addInstructor( 300,"M. Lara","lara@csumb.edu","333-333-3333");
// itcd.addInstructor( 250,"S. Bude","bude@csumb.edu","444-123-4567"); 
// 
// itcd.addCourse(338,"CST338 - Software Design",100,"MLC 104");
// itcd.addCourse(205,"CST205 - Multimedia Design and Programming",200,"MLC 118");
// itcd.addCourse(336,"CST336 - Internet Programming",300,"Library 1010");
// itcd.addCourse(306,"CST306 - Game Engine Programming",100,"MLC 104"); 
// 
// itcd.addStudent( 7777,"Alice Otter",338,89.50,"B");
// itcd.addStudent( 8888,"Bob Otter",205,75.00,"C");
// itcd.addStudent( 7777,"Alice Otter",306,98.00,"A");
// itcd.addStudent(7777,"Alice Otter",205,71.00,"C");
// itcd.addStudent( 9999,"John Doe",338,89.50, "B");
 //**************************************************************//
 
 /*
 System.out.println(("\n===== School Info ====="));
 itcd.schoolInfo();
 
 itcd.addInstructor(700, "E. Tao", "tao@csumb.edu", "777-777-1234");
 itcd.addCourse(300, "CST300  ProSem", 700, "MLC110");
 itcd.addCourse(231, "CST231  Intro C++", 100, "MLC104");
 
 
 System.out.println(("\n===== Failed Course Addition ====="));
 itcd.addCourse(306, "CST306 GUI Dev", 250, "MLC120");
 itcd.addCourse(499, "CST499  iOS Dev", 150, "MLC104");

 System.out.println(("\n===== Detailed Course Info ====="));
 itcd.courseInfo(306);
 
 
 itcd.schoolInfo();
 
 
 
 course1 = itcd.getCourse(205);
 course1.updateLocation("Library 104");
 System.out.println(("\n===== Detailed Course Info 2 ====="));
 itcd.courseInfo(205);
 System.out.println(("\n===== Detailed Course Info 3 ====="));
 itcd.courseInfo();
 itcd.deleteCourse(231);
 itcd.deleteCourse(336);
 itcd.deleteCourse(338);
 
 System.out.println(("\n===== Detailed Course Info 4 ====="));
 itcd.courseInfo();
 itcd.addStudent(5555, "Chris Watson", 205, 85.50, "B");
 System.out.println(("\n===== Detailed Course Info 5 ====="));
 itcd.courseInfo(205);
 System.out.println(("\n===== Detailed Student Info ====="));
 itcd.studentInfo(7777);
 itcd.graduateStudent(7777);
 System.out.println(("\n===== Detailed Student Info 2 ====="));
 itcd.studentInfo(7777);
 itcd.graduateStudent(5555);
 System.out.println(("\n===== Detailed Course Info 6 ====="));
 itcd.courseInfo(205);
 itcd.graduateStudent(5555);
 System.out.println(("\n===== Good Job! Bye! ====="));
 
 }
 */
}
