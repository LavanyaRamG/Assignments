package week1.day1;

public class MobileOne {

	public void sendSms() {
		System.out.println("From oppo");

	}
	public long makeCall(long phno) {
		return phno;
		
	}
	
	public static void main(String [] arg) {
		
		MobileOne obj=new MobileOne();
		obj.sendSms();
		long phnoReceived = obj.makeCall(1234567890);
		System.out.println("Phone Number:"+phnoReceived);
	
		
		
	}
}
