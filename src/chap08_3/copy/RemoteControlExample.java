package chap08_3.copy;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		rc.search("www.naver.com");
		
		
		RemoteControl.changeBattery();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(false);			

		};

	}
