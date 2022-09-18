package in.ineuron.Many_to_Many_Association;


//Dependent class
public class Course {
	
	private int courseId;
	private String cName;
	private int cost;
	
	//Getters and Setters to get and set the values 
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	

}
