package chap_11_tread;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public  void setMemory(int memory) throws Exception {
		this.memory = memory;
		try {
			Thread.sleep(1000);
		} catch (IncompatibleClassChangeError e) {
			// TODO: handle exception
		}System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		
		
	}
	
		
	}



//
//
//public synchronized void setMemory(int memory) throws Exception {
//	this.memory = memory;
//	try {
//		Thread.sleep(2000);
//	} catch (IncompatibleClassChangeError e) {
//		// TODO: handle exception
//	}System.out.println(Thread.currentThread().getName() + ":" + this.memory);
//	
////	

