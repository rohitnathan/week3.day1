package week3.day1;

public class AndroidPhone extends SmartPhone {

	public void takeVideo() {
		System.out.println("Take video");
	}

	public static void main(String[] args) {
		AndroidPhone ap = new AndroidPhone();
		ap.accessWhatsApp();
		ap.makeCall();
		ap.savecontact();
		ap.sendMsg();
		ap.takeVideo();

	}

}
