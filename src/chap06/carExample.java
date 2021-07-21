package chap06;

public class carExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car myCar = new car("검정", 3000);
		
		System.out.println(myCar.name);
		System.out.println(myCar.value);
		
		car mycar2 = new car();
		System.out.println(mycar2);

	}

}
