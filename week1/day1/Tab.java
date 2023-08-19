package week1.day1;

public class Tab {

	public static void main(String[] args) {
		MobileOne obj=new MobileOne();
		obj.sendSms();
		long phnoReceived = obj.makeCall(1234567890);
		System.out.println("Phone Number:"+phnoReceived);
	

	}

}
