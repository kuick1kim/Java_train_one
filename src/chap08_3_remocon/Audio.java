package chap08_3_remocon;

public class Audio implements RemoteControl{
	
	private int volume;
	private boolean mute;	
	
	public void turnOn() {
		System.out.println("오디오를 켭니다 ");
	}
	public void turnOff() {
		System.out.println("오디오를 끕니다 ");
	}
	
	public void setVolume(int volume) {
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume =RemoteControl.MAX_VOLUME;			
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume =RemoteControl.MIN_VOLUME;
		}else {
			this.volume =volume;
		}
		System.out.println("오디오 볼륨" + this.volume);		
	}
	
	@Override
	public void setMute(boolean mute) {		
		this.mute = mute;
		if (mute) {
			System.out.println("오디오 음량 무음");
		} else {
			System.out.println("오디오 무음 해제");
		}

	}


}