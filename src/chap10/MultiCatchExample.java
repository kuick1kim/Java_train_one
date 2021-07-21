package chap10;

public class MultiCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 / value2;
			System.out.println(data1 +"+"+ data2 +"="+ result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다. ");
			// TODO: handle exception
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다. ");
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("알수 없는 예외 발생");
		}finally {
			System.out.println("다시 실행하세요");
		}

	}

}
