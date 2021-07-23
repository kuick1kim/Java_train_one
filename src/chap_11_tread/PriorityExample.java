package chap_11_tread;

public class PriorityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10;i++) {
			
			Thread thread = new CalcThread("thread"+i);
				if (i != 10 ) {
					thread.setPriority(Thread.MIN_PRIORITY);
					System.out.println("   1" );
//				} else if(i != 2){
//					thread.setPriority(Thread.MIN_PRIORITY);
//					System.out.println("   2");
				} else {
					
					thread.setPriority(Thread.MAX_PRIORITY);
				}
			thread.start();
		}

	}

}
