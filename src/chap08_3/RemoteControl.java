package chap08_3;

public interface RemoteControl {
	
	//상수
	int MAX_VOLUME=0;
	int MIN_VOLUME=0;
	
			
	}
	
	//추상 메소드
	void turnOn();
	void turnOff();
	
	void search(String string);
	void setVolume(int volume);	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음처리합니다..");
		} else {
			System.out.println("무음 해제합니다. ");
		}
	}
	//정적메소드
	static void changeBattery() {
		System.out.println("배터리를 바꿉니다");
	}
	
}