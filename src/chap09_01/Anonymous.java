package chap09_01;


public class Anonymous {
	Person field = new Person();
	void work() {
		System.out.println("출근합니다. ");
		
	}
	void wake() {
		System.out.println("7시에 일어납니다.");
		work();
	}

};

void method1() {
	

	Person lacalVar = new Person() {
		void walk() {
			System.out.println("산책합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("7시에 일어납니다. ");
			walk();
		}
	};
