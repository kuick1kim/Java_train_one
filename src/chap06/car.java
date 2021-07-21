package chap06;

public class car {
	String name;
	
	int value;
	
	car (){
		System.out.println("나 카 생성자야");
	}
	
	car (String color, int cc) {
		name =color;
		value =cc;
		
	}

}
