package week3.day1;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student Name");
	}
	public void studentDept() {
		System.out.println("Student Department");
	}
	public void studentId() {
		System.out.println("Student ID");
	}
	public static void main(String[] args) {
		Student St = new Student();
		St.collegeCode();
		St.collegeName();
		St.collegeRank();
		St.deptName();
		St.studentDept();
		St.studentName();
		St.studentId();
	}


}
