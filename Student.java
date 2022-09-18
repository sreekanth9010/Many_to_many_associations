package in.ineuron.Many_to_Many_Association;


//Target class
public class Student {
	
	private int sId;
	private String sName;
	private int age;
	
	
	//HAS A variables 
	private Course[] course;


	
	//getters and setters to get and set THE values 
	public int getsId() {
		return sId;
	}


	public void setsId(int sId) {
		this.sId = sId;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Course[] getCourse() {
		return course;
	}


	public void setCourse(Course[] course) {
		this.course = course;
	}
	
	public void disp()
	{
		System.out.println("Student Deatails are::");
		System.out.println("The studnet id is :::"+sId);
		System.out.println("The student Name is::"+sName);
		System.out.println("The studnet age is ::"+age);
		System.out.println();
		System.out.println("course details are ::" );
		for(Course c : course)
		{
			System.out.println("course id is:"+c.getCourseId());
			System.out.println(("course name is::"+c.getcName()));
			System.out.println("cost of the course is:: "+c.getCost());
			System.out.println();
		}
	}

}
