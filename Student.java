import java.util.ArrayList;


/*
 * 5
7777,Alice Otter,338,89.50,B
8888,Bob Otter,205,75.00,C
7777,Alice Otter,306,98.00,A
7777,Alice Otter,205,71.00,C
9999,John Doe,338,89.50,B
 */
//student’s unique ID, name,
//course enrolled, final score, and letter grade. 
public class Student {

	private int studentID;
	private String name;

	private ArrayList<Course> schedule= new ArrayList<Course>();
	
	public Student()
	{
		studentID= 0;
		name= " ";
	}
	
	public Student(int studentID, String name, int courseID, double finalScore, String grade)
	{
		this.studentID= studentID;
		this.name= name;
	
		schedule.add(new Course(courseID, finalScore, grade));
	}

	public String toString()
	{
		//change 
		return name;
	}
	
	
	public ArrayList<Course> getschedule()
	{
		ArrayList<Course> second = new ArrayList<Course>(schedule);
		return second;
	}

	public void updateSchedule(int courseID, double finalScore, String grade) {
		schedule.add(new Course(courseID, finalScore, grade));
		
	}
	public String getName()
	{
		return name;
	}
	
	
}
