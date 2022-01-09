package week3.day1;

public class SmartPhone extends Mobile {

	public void accessWhatsApp() {
		System.out.println("Access Whatsapp");
	}

	public static void main(String[] args) {

		SmartPhone Sp = new SmartPhone();
		Mobile mb = new Mobile();
		Sp.accessWhatsApp();
		mb.makeCall();

	}
}
