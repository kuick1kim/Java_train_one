package chap14.three;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyfunctionalInterface fi;
		
		fi = (x) -> {int result = x + 5; System.out.println(result); };
		fi.method(2);
		
		fi = (x)-> {System.out.println(x*5); };
		fi.method(10);
		
		fi = x -> System.out.println(x*5);
		fi.method(2);
		
	}

}
