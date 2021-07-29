package chap14.three;

import java.util.Scanner;

public class ninexnine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("구구단 몇단 :");
			int dan = scan.nextInt();
			if (!(dan == 0||dan ==1)) {
				for (int j =1; j<=9;j++) {
					System.out.print(dan + "*" + j + "=" + dan*j + "\t");
				}
			} else {

			}
			System.out.println("프로그램을 종료합니다");
		}

	}

}
