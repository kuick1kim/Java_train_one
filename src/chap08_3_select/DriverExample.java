package chap08_3_select;

public class DriverExample {

	public static void main(String[] args) {
		Driverr driver = new Driverr();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
