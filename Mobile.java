package week3.day1;

public class Mobile {

	public void sendMsg() {
		System.out.println("Send Message");
	}

	public void makeCall() {
		System.out.println("Make call");
	}

	public void savecontact() {
		System.out.println("Save Contact");
	}

	public static void main(String[] args) {

		Mobile m1 = new Mobile();
		m1.sendMsg();
		m1.makeCall();
		m1.savecontact();

	}

}
