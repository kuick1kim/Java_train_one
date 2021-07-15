package chap03;

import java.util.Scanner;

public class JT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		
		System.out.println("10진수: " + v);
		System.out.println("2진수: " + Integer.toBinaryString(v));
		System.out.println("8진수: " + Integer.toOctalString(v));
		System.out.println("16진수: " + Integer.toHexString(v));
	}

}
