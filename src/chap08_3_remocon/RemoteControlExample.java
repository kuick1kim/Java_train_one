package chap08_3_remocon;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc ;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		rc.setVolume(10);
//		rc.search("www.naver.com");
		
			System.out.println();
		
		rc = new SmartTelevision();
		rc.turnOff();
		rc.Search("ㅁㄴ어ㅣㄹ");
		
		
			System.out.println();
		
		RemoteControl.changeBattery();
		
		
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(false);			

		};

	}
