package jesus.proyecto1;

public class Bike extends Vehicles implements SomeVehicleActions{
	static final String sBrand = "HarleyDavidson", sModel = "Forty-Height";
	static final double sSpeed = 177;
	static final int sPassengers = 0, sRange = 140;
	
	public boolean moving = false;
	
	public Bike() {
		this.brand = sBrand;
		this.model = sModel;
		this.maxSpeed = sSpeed;
		this.maxRange = sRange;
		this.numberOfPassengers = sPassengers;
		super.setPlate();
	}
	
public void accelerate() {
		
		if (this.isEngineOn() == true) {
			this.moving = true;
			System.out.println("You're now moving at 80km/h");
		}
		
		else
			System.out.println("Turn on the bike first.");
	}
	
	public void goMaxSpeed() {
		
		if (this.isEngineOn() == true) {
			this.moving = true;
			System.out.println("You're now moving at " + this.getMaxSpeed() + "km/h");
		}
		
		else
			System.out.println("Turn on the bike first.");
	}
	
	public void stop() {
		
		if (this.isMoving() == true) {
			this.moving = false;
			System.out.println("The bike has stopped but its still on.");
		}
		
		else
			System.out.println("You can't stop the bike if it isn't moving.");
	}
	
	public void wheelie() {
		if (this.isEngineOn() == true) {
			if (this.isMoving() == true) {
				System.out.println("Wheelie performed.");
			}
			
			else
				System.out.println("The bike has to be moving to perform this maneuver.");
		}
		
		else
			System.out.println("Turn on the engine first...");
	}
	
	public boolean isMoving() {
		return this.moving;
	}
	
	public void stoppie() {
		if (this.isEngineOn() == true) {
			if (this.isMoving() == true) {
				this.moving = false;
				System.out.println("Stoppie performed. The bike has stopped moving.");
			}
			
			else
				System.out.println("The bike has to be moving to perform this maneuver.");
		}
		
		else
			System.out.println("Turn on the engine first...");
	}
}
