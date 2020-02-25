
public abstract class Vehicles {

	/*An abstract class can have simple classes and variables
	 The differences are 1. This class must have one/more abstract method(s) 2. Abstract class cannot be instantiated
	 Any class that implements the abstract class can use the abstract method in different ways*/
	
	String make;
	String model;
	int year;
	double mileage;
	
	// We will need the constructor
	public Vehicles(String n, String m, int y, double mlg) {
		this.make= n;
		this.model = m;
		this.year=y;
		this.mileage = mlg;
	}
	
	public void vehicleInfo() {
		System.out.println("The vehicle name's "+make+"\nthe model is  "+model+"\nthe year is "+year+"\n the mileage is "+mileage);
	}
	
	public abstract void goodFor();
}
