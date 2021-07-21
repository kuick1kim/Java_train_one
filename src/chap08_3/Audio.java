package chap08_3;

public class Audio implements RemoteControl{
	
	private int volume;
	private boolean mute;	
	
	public void turnOn() {
		System.out.println("������� �մϴ�. ");
	}
	public void turnOff() {
		System.out.println("������� ���ϴ�. ");
	}
	
	public void setVolume(int volume) {
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume =RemoteControl.MAX_VOLUME;			
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume =RemoteControl.MIN_VOLUME;
		}else {
			this.volume =volume;
		}
		System.out.println("���� ����� ����" + this.volume);		
	}
	
	@Override
	public void setMute(boolean mute) {		
		this.mute = mute;
		if (mute) {
			System.out.println("����� ����ó��");
		} else {
			System.out.println("����� ��������");
		}

	}


}