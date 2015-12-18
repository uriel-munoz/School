/*
 * Name:Uriel Antonio	
 * ID:4321
 * Date:03/13/15
 * 
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class School {
	
	private String name;
	private HashMap<Integer, Course> Courses = new HashMap<Integer, Course>();
	private HashMap<Integer, Instructor> Instructors = new HashMap<Integer, Instructor>();
	private HashMap<Integer, Student> Students = new HashMap<Integer, Student>();
	DecimalFormat two = new DecimalFormat("###.##");
	public School()
	{
		name = " ";
	}
	
	public School(String name)
	{
		this.name=name;
	}
	
	public void schoolInfo() {
		System.out.println("School Name: " + name );
		System.out.println("Instructor Information ");
		//print names of instructor
		for (int key : Instructors.keySet()) {
			Instructor temp = Instructors.get(key);
			System.out.println(temp.getName());
		}
		System.out.println("Course Information");
		//print names of courses
		for(int key : Courses.keySet())
		{
			Course temp = Courses.get(key);
			System.out.println(temp.getTitle());
		}
		System.out.println("Student Information ");
		//print student names then all courses they are in
		for(int key : Students.keySet())
		{
			Student temp = Students.get(key);
			if(temp!=null)
			{
				
				ArrayList<Course> test = temp.getschedule();	
				if(test!=null)
				{
					for(Course list: test)
					{
						if(Courses.containsKey(list.getCourseNum()))
						{
							System.out.print(temp.getName() + " ");
							Course T = Courses.get(list.getCourseNum());
									System.out.println(T.getTitle());
						}
					}
				}
			}
			
		}
	}
	
	public void addInstructor(int employeeID, String name, String email, String phone) {
		//toyBox.put(key, new Person(name, Score));
		if(Instructors.containsKey(employeeID))
		{
			System.out.println("Instructor ID already taken ");
			return;
		}
		Instructors.put(employeeID, new Instructor(employeeID, name, email, phone));
		
	}
	
	public void addCourse(int courseNum, String title, int instructNum, String Location) {
		if(Courses.containsKey(courseNum))
		{
			System.out.println("Course addition failed – Course number already used. ");
			return;
		}
		
		//checks if the instructor exist before creating course
		   if(Instructors.containsKey(instructNum))
		   {
			   Courses.put(courseNum, new Course(courseNum, title, instructNum,Location));
			   return;
		}
		   System.out.println("Course addition failed – Non-existing instructor.");
		
	}
	
	public void courseInfo(int courseNum) {

		if(Courses.containsKey(courseNum))
		{
			Course temp=Courses.get(courseNum);
			int num= temp.getinstructNum();
			double average=0;
			int numStudents=0;
			Instructor prof = Instructors.get(num);
			System.out.println("Course Number: " + courseNum);
			System.out.println("Instructor: " + prof.getName());
			System.out.println("Course Title: " + temp.getTitle());
			System.out.println("Room: " + temp.getLocation());
			System.out.println("Enrolled Students: ");
			//print out the name and number grade, character
			
			for(int key : Students.keySet())
			{
				Student St = Students.get(key);
				ArrayList<Course> schedule = St.getschedule();
				for (Course sch : schedule) 
				{
					if(sch.getCourseNum()==courseNum)
					{
						System.out.println(St.getName() +": "+ two.format(sch.getScore()) + " (" + sch.getGrade()+ ")");
						average+=sch.getScore();
						numStudents++;
					}
				}
			}
			average=average/numStudents;
			
			System.out.println("Course Average:" + two.format(average));
			}
		else
			System.out.println("Course not here");
			
	}
			
	public Course getCourse(int courseNum) {
		Course temp = Courses.get(courseNum);

		return temp;
	}
	
	
	public void courseInfo() {
		
		System.out.println("Number of courses: "+ Courses.size());
		
		for(int key: Courses.keySet())
		{
			Course temp=Courses.get(key);
			int count =0;
			System.out.print(temp.getCourseNum() + ": ");
			for(int skey: Students.keySet())
			{
				Student T = Students.get(skey);
				ArrayList<Course> Sch = T.getschedule();
				for(Course code: Sch)
				{
					if(code.getCourseNum()==temp.getCourseNum())
					{
						count++;
					}
				}
			}
			System.out.println(count + " enrolled");
		}
	}
	public void deleteCourse(int courseNum) {
		//checks if a student is in the courseNum that was given
		for(int key : Students.keySet())
		{
			Student temp = Students.get(key);
			 ArrayList<Course> schedule = temp.getschedule();
			 for (Course code : schedule) {
					if(code.getCourseNum()==courseNum)
					{
						System.out.println("Course deletion failed – Enrolled student(s) in the class");
						return;
					}
				}
		}	
		
		Courses.remove(courseNum);
		
	}
	
	public void addStudent(int studentID, String name, int courseID, double finalScore, String grade) {
		
		if(Students.containsKey(studentID))
		{
			//System.out.println("Student ID already taken ");
			Student temp = Students.get(studentID);
			Students.remove(studentID);
			temp.updateSchedule(courseID, finalScore, grade);
			Students.put(studentID,temp);
			return;
		}
		
		 if(Courses.containsKey(courseID))
		 {
			   Students.put(studentID, new Student(studentID, name, courseID,finalScore,grade));
			   return;
			   }
		 else
		 {
			 System.out.println("Course does not exist therefore not ");
		 }
		
		
	}
	public void studentInfo(int ID){
		// TODO Auto-generated method stub
		/*
		 *
===== Detailed Student Info =====
Student Number: 7777
Name: Alice Otter
Courses Enrolled:
338: 89.50 (B)
306: 98.00 (A)
205: 71.00 (C)
Course Average: 86.17 
		 */

		Student temp=Students.get(ID);
		if(temp!=null)
		{
			System.out.println("Student Number: " +ID);
			System.out.println("Name: " + temp.getName());
			System.out.println("Courses Enrolled: ");
			double average =0;
			ArrayList<Course> schedule = temp.getschedule();
			int count =schedule.size();
			for(Course code : schedule)
			{
				System.out.println(code.getCourseNum()+": " + two.format(code.getScore()) +"(" + code.getGrade() +")");
				average +=code.getScore();
			}
			average/=count;
			System.out.println("Course Average: "+ two.format(average));
		}
		else
		{
			System.out.println("Student Number: " +ID);
			System.out.println("No Student info");
		}
	}
	public void graduateStudent(int ID) {
		// TODO Auto-generated method stub
		Student temp=Students.get(ID);
		if(temp!= null)
		{
			Students.remove(ID);
		}
		else
		{
			System.out.println("Student graduation failed – Non-existing student.");
		}
	}

	public void readData(String nameFile) throws FileNotFoundException {
		
		Scanner read = new Scanner (new File(nameFile));
			read.useDelimiter(",|\\n|\n");
			String num;
			int count=0;
			
			num=read.next();
			count = Integer.parseInt(num);
			
			for(int i=0; i<count; i++)
			{
			
				int employeeID=Integer.parseInt(read.next());
				String names=read.next();
				String email=read.next();
				String phone=read.next();
				
				this.addInstructor(employeeID, names, email, phone);
			}
			

			num=read.next();
			count=Integer.parseInt(num);
			for(int i=0; i<count; i++)
			{
				this.addCourse(Integer.parseInt(read.next()), read.next(),Integer.parseInt(read.next()), read.next());
			}
			
			num=read.next();
			count=Integer.parseInt(num);
			for(int i=0; i<count; i++)
			{
				this.addStudent(Integer.parseInt(read.next()), read.next(), Integer.parseInt(read.next()),
						Double.parseDouble(read.next()), read.next());
			}
			read.close();
		
	}

}
