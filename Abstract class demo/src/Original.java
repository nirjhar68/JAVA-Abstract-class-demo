
public class Original {

	public static void main(String[] args) {
		
		//Creating an instance of the Car class
		Car coup = new Car("Ford", "mustang GT", 2015, 10052.00);
		coup.vehicleInfo();
		coup.goodFor();
		coup.run();
		
		/*Now creating a pointer variable of type Vehicles but the instance will be of Car type*/
		Vehicles coup2 = new Car("Ford", "Shelby GT", 2015, 1005.62);
		coup2.vehicleInfo();
		coup2.goodFor();
		//coup2 cannot implement the run(), because coup2 is a variable of the Vehicles type
		//And parent class cannot inherit the child class methods
		//Therefore, coup2.run(); will give us error
		
		
		// Creating another instance of the Bus type
		Bus miniBus = new Bus("Frightliner", "x20", 2020, 105.00);
		miniBus.vehicleInfo();
		miniBus.goodFor();
		miniBus.makeNoise();
		
		//Same goes with miniBus; if we make another instance of the Bus type and make another pointer variable of the 
		//Vehicles type, that instance will not execute the makeNoise() method
		showValue(coup);
		showValue(miniBus);
	}
	
	//Declaring a method of the static type
	//This method shows a general idea of what the vehicle is good for. Different instances can use the goodFor() in different ways
	//This is called Polymorphism 
	public static void showValue(Vehicles v) {
		v.goodFor();
	}

}
