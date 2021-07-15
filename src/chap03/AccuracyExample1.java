package chap03;

public class AccuracyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		
		int totalPieces = apple * 10;
		
//		double pieceUnit = 0.1;
		int number = 7;
		int temp = totalPieces - number;
		
		
//		double result = apple - number * pieceUnit;
		double result = temp/10.0;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면 ");
		System.out.println(result + " 남는다");
			

	}

}
