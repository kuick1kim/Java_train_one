package chap08_3;

public class Television implements RemoteControl{

	private int volume;
	
	public void turnOn() {
		System.out.println("Tv�� �մϴ�. ");
	}
	public void turnOff() {
		System.out.println("Tv�� ���ϴ�. ");
	}
	
	public void setVolume(int volume) {
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume =RemoteControl.MAX_VOLUME;			
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume =RemoteControl.MIN_VOLUME;
		}else {
			this.volume =volume;		}
		System.out.println("���� TV����" + this.volume);
		
	}
	public void search(String url) {
		System.out.println(url +"�� �˻��մϴ�. ");
		
	}
	

}