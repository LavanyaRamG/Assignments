package week3.day1.assignments;

public class AxisBank extends BankInfo {
	@Override
public void deposit() {
	System.out.println("BankInfo deposit override account");
}
	public static void main(String[] ards) {
		AxisBank obj = new AxisBank();
		obj.saving();
		obj.deposit();
		obj.fixed();
	}
}
