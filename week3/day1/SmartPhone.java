package week3.day1;

public class SmartPhone extends AndroidPhone {
	public void takeVideo() {
		System.out.println("SmartPhone class takeVideo");

	}
	public static void main(String[] args) {
		SmartPhone obj= new SmartPhone();
		obj.takeVideo();
	}
}
