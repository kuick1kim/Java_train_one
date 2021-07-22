package chap08_3_remocon;


public class SmartTelevision implements RemoteControl, Searchable{

	private int volume;	
	@Override
	public void Search(String url) {
		System.out.println(url + "검색합니다. ");		
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("스마트 티브이를 끕니다");		
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
		System.out.println("티비볼륨" + this.volume);		
	}
	@Override
	public void turnOn() {
		System.out.println("스마트티비 를 켭니다");
		// TODO Auto-generated method stub
			}
//	public void search(String url) {
//		System.out.println(url +"검색합니다.  ");
//		
//	}
		
}


