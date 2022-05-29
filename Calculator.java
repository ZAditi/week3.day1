package week3.day1;

public class Calculator {
	
	public int Add(int a,int b) {
		int result=a+b;
		return result;
	}
	public int Add(int a,int b, int c) {
		int result=a+b+c;
		return result;
	}
	public int Sub(int a,int b) {
		int result=a-b;
		return result;
	}
	public double Sub(double a,double b) {
		double result=a-b;
		return result;
	}
	public int Mul(int a,int b) {
		int result=a*b;
		return result;
	}
	public double Mul(double a,int b) {
		double result=a*b;
		return result;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.Add(10, 12));
		System.out.println(cal.Add(1, 2, 3));
		System.out.println(cal.Sub(20, 10));
		System.out.println(cal.Sub(12.3, 1.34));
		System.out.println(cal.Mul(12, 14));
		System.out.println(cal.Mul(13.4, 8));

	}

}
