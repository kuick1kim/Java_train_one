package chap06;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.member();
		s1.aaa();
		s1.bbb();
		System.out.println("s1 변수가 Student 객체를 참조합니다");
		
		
		Student s2 = new Student();
		s1.bbb();
		System.out.println("s2 변수가 또 다른 Student객체를 참조합니다.");

	}

}
