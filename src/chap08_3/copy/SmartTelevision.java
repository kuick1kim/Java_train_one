package chap08_3.copy;


public class SmartTelevision implements RemoteControl, Searchable{

	private int volume;	
	@Override
	public void Search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + " �� �˻��մϴ�. ");		
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV�� ���ϴ�");		
	}
	@Override	
	public void setVolume(int volume) {
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume =RemoteControl.MAX_VOLUME;			
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume =RemoteControl.MIN_VOLUME;
		}else {
			this.volume =volume;
		}
		System.out.println("���� TV����" + this.volume);		
	}
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
		// TODO Auto-generated method stub
			}
		
}


