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
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			System.out.println("���α׷��� �̹� �����߽�");
		}
	}

}
