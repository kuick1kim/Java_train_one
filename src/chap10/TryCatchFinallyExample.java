package chap10;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
//			int i=5;
//			System.out.println(i);
//			System.out.println();
			Class clazz = Class.forName("java.lang.String2");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("프로그램을 이미 종료했슈");
		}
	}

}
