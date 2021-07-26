package chap13.one;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		box.set("홍길동"); //자동으로 변함
		String name = (String) box.get();  //강제로 바꿔버림
		
		box.set(new Apple()); //자동으로 변함
		Apple apple = (Apple) box.get(); //강제로 바꿔버림

	}

}
