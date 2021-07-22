package chap08_3_remocon;

public interface RemoteControl {
	
	public int MAX_VOLUME =10;
	public int MIN_VOLUME =0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
//	public void search();
	
	//디폴트 메소드/\
	default void setMute(boolean mute) {
	if (mute) {
		System.out.println("무음처리합니다..");
	} else {
		System.out.println("무음 해제합니다. ");
	}
}	
	//정적 메소드
	static void changeBattery() {
		System.out.println("배터리를 바꿉니다");
	}
	public static void search(String string) {
		System.out.println("배터리를 바꿉니다");
		
	}
		
	
	
}
