package chap03;


import java.util.Scanner;

public class nnn {

 public static void main(String[] args) {
 int m[]= {100000,50000,10000,5000,1000,500,100,50,10,5,1};
 while (true) {
 System.out.println("해당 금액을 입력해주세요 :");
 Scanner scanner= new Scanner(System.in);
 
 int a=scanner.nextInt();
 
 	if (a==0) {
 		scanner.close();
 		break;
 }
 for (int i = 0; i < m.length; i++) {
	 int b= a/m[i];
	 System.out.println(m[i]+"원 입니다. "+b);
	 a=a%m[i];
 }
 }
 }

}

