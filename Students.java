package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("The id : " + id);

	}

	public void getStudentInfo(int id, String name) {
		System.out.println("The id:  " + id + ",The name: " + name);

	}

	public void getStudentInfo(String email, long phonenum) {
		System.out.println("Email ID :" +email);
		System.out.println("Phonenum :" + phonenum);
	}

	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo(001);
		std.getStudentInfo(001, "Rohit");
		std.getStudentInfo("r@r.com", 9999900);

	}

}
