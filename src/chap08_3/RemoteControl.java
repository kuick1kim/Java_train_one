package chap08_3;

public interface RemoteControl {
	
	//���
	int MAX_VOLUME=0;
	int MIN_VOLUME=0;
	
	//�߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void search(String string);
	void setVolume(int volume);	
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�");
		}
	}
	//�����޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�");
	}
	
}