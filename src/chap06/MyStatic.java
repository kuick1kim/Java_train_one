package chap06;

public class MyStatic {
	static int count = 0;
	
	 MyStatic() {
		// TODO Auto-generated constructor stub
		 this.count++;
		 System.out.println(this.count);
		 
	}
	 public static void main(String[] args) {
		 
		 MyStatic my1 = new MyStatic();
		 MyStatic my2 = new MyStatic();
		 
			
	}

}
