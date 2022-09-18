package in.ineuron.Many_to_Many_Association;

public class MainSetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course []course = new Course[3];
		course[0]= new Course();
		course[0].setCourseId(1001);
		course[0].setcName("Java");
		course[0].setCost(1000);
		
		course[1]= new Course();
		course[1].setCourseId(1002);
		course[1].setcName("JavaScript");
		course[1].setCost(1200);
		
		
		course[2]= new Course();
		course[2].setCourseId(1003);
		course[2].setcName("DBMS");
		course[2].setCost(1300);
		
		Course []c1= {course[0],course[1]};
		
		Course []c2= {course[0],course[2]};
		Course []c3 = {course[0],course[1],course[2]};
		Student []student = new Student[2];
		student[0]= new Student();
		student[0].setsId(11705009);
		student[0].setsName("Sreekanth");
		student[0].setAge(22);
		student[0].setCourse(c1);
		
		student[1]= new Student();
		student[1].setsId(11705012);
		student[1].setsName("Benny");
		student[1].setAge(22);
		student[1].setCourse(c3);
		
		student[0].disp();
		student[1].disp();
		
		

	}

}
