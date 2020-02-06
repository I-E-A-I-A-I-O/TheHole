package jesus.proyecto1;

public class Car extends Vehicles implements SomeVehicleActions{
	static final String sBrand = "Tesla", sModel = "Model-S-P85D";
	static final double sSpeed = 249.5, sRange = 407.2;
	static final int sPassengers = 3;
	
	private boolean Moving = false;
	
	public Car() {
		this.brand = sBrand;
		this.model = sModel;
		this.maxSpeed = sSpeed;
		this.maxRange = (int) sRange;
		this.numberOfPassengers = sPassengers;
		super.setPlate();
	}
	
	public void accelerate() {
		
		if (this.isEngineOn() == true) {
			this.Moving = true;
			System.out.println("You're now moving at 80km/h");
		}
		
		else
			System.out.println("Turn on the car first.");
	}
	
	public void goMaxSpeed() {
		
		if (this.isEngineOn() == true) {
			this.Moving = true;
			System.out.println("You're now moving at " + this.getMaxSpeed() + "km/h");
		}
		
		else
			System.out.println("Turn on the car first.");
	}
	
	public boolean isMoving() {
		return this.Moving;
	}
	
	public void stop() {
		
		if (this.isMoving() == true) {
			this.Moving = false;
			System.out.println("The car has stopped but its still on.");
		}
		
		else
			System.out.println("You can't stop the car if it isn't moving.");
	}
}
