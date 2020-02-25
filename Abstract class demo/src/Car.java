
public class Car extends Vehicles {
	public Car(String mk, String mdl, int yr, double mlg) {
		super(mk, mdl, yr, mlg);
	}
	 //Car mustang = new Car("Mustang", "Cobra GT", 2015, 10025.41);
	@Override
	public void goodFor() {
		System.out.println("This a muscle car!");
		
	}
	public void run() {
		System.out.println("Broom Broom");
	}
}
