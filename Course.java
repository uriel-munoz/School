/*
 * 4
338,CST338 - Software Design,100,MLC 104
205,CST205 - Multimedia Design and Programming,200,MLC 118
336,CST336 - Internet Programming,300,Library 1010
306,CST306 - Game Engine Programming,100,MLC 104
 */
public class Course {

	int courseNum;
	String title;
	int instructNum;
	String Location;

	private double finalScore = 0;
	private String grade= " ";
	
	public Course()
	{
		courseNum=0;
		title =" ";
		instructNum=0;
		Location=" ";
	}
	//constructor used for school
	public Course(int courseNum, String title, int instructNum, String Location)
	{
		this.courseNum = courseNum;
		this.title = title;
		this.instructNum = instructNum;
		this.Location=Location;
	}
	//constructor used for student schedule
	public Course(int courseID, double finalScore, String grade)
	{
		courseNum=courseID;
		this.finalScore=finalScore;
		this.grade=grade;
	}
	
	public Course(Course other)
	{
		this.courseNum = other.courseNum;
		this.title = other.title;
		this.instructNum = other.instructNum;
		this.Location=other.Location;	
	}
	
	int getCourseNum()
	{
		return courseNum;
	}
	
	public String toString()
	{
		//change 
		return title;
	}
	
	public void updateLocation(String Location) {
		this.Location =Location;
	}
	public int getinstructNum()
	{
		return instructNum;
	}
	public String getTitle()
	{
		return title;
	}
	public String getLocation()
	{
		return Location;
	}
	public double getScore()
	{
		return finalScore;
	}
	
	public String getGrade()
	{
		return grade;
	}
}
