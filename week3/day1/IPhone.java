package week3.day1;

	public class IPhone extends iOS {
		
		public void makeCall() {
			 System.out.println("IPhone class makeCall ");
			    
		}
		
		public void sendSMS() {
			System.out.println("IPhone class sens SMS");
		}

		public static void main(String[] arg) {
			
			IPhone obj = new IPhone();
			obj.makeCall();
			obj.startApp();
			obj.increaseVolume();
			obj.shutdown();
			
		}
			
		
	}


