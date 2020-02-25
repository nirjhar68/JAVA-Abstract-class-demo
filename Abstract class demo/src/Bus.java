
public class Bus extends Vehicles{
	public Bus(String mk, String mdl, int yr, double mlg) {
		super(mk, mdl, yr, mlg);
	}

	@Override
	public void goodFor() {
		System.out.println("This vehicle is good for carrying multiple passengers!");
		
	}
	
	public void makeNoise() {
		System.out.println("Honking horns!");
	}

}
