package chap04;

public class ForSumFrom1to100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		
		for(int i=1; i<=53; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합은 : " +sum);
	}

}
