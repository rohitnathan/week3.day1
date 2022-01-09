package week3.day1;

public class StudentDetails {
	
	public void getStudentDetails(int id, int age) {
		System.out.println(+id + " " +age);
		
		
	}
	
	public void getStudentDetails(String name) {
		System.out.println("Name is" +" " + name);
	}
			
	public static void main(String[] args) {
		
		StudentDetails sd = new StudentDetails();
		sd.getStudentDetails(2, 35);
		sd.getStudentDetails("Rohit");
	}

}
