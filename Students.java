package week3.day1;

public class Students {
	public void getStudentsInfo(int id) {
		System.out.println("Id");
	}
	public void getStudentsInfo(int id, String name) {
		System.out.println("Id and Name");
		
	}
	public void getStudentsInfo(String email, long phoneNumber) {
		System.out.println("Email and Nunber");
		
	}
	public static void main(String[] args) {
		Students St = new Students();
		St.getStudentsInfo(1120);
		St.getStudentsInfo(1134,"Test");
		St.getStudentsInfo("a@a.com", 987676542);

	}

}
