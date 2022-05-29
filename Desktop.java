package week3.day1;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Desktop size");
	}
	public static void main(String[] args) {
		Desktop dd = new Desktop();
		dd.desktopSize();
		dd.ComputerMode();

	}

}
