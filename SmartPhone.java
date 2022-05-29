package week3.day1;

public class SmartPhone extends AdroidPhone {
	public void connectWhatsApp() {
		System.out.println("WhatsApp");
	}
	public void takeVideo() {
		System.out.println("VideoTaken");
	}

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.connectWhatsApp();
		phone.takeVideo();
		phone.makeCall();
		phone.saveContact();
		phone.sendMsg();
	}
}