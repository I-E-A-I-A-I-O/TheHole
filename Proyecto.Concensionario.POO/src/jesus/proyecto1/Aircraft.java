package jesus.proyecto1;

public class Aircraft extends Vehicles {
	protected double maxAltitude;
	protected boolean flying = false;
	protected int numberOfPilots;
	
	public int getPilots() {
		return this.numberOfPilots;
	}
	
	public double getMaxAltitude() {
		return this.maxAltitude;
	}
	
	public boolean isFlying() {
		return this.flying;
	}
	
	public void takeOff() {
		if (this.isEngineOn() == true) {
			this.flying = true;
			System.out.println("The vehicle is now flying at " + this.getMaxSpeed() + " km per hour with an altitude of " + 
			this.getMaxAltitude() + " km.");
		}
		
		else
			System.out.println("You must turn the engine on to take off.");
	}
	
	public String toString() {
		return super.toString() + "\nMax altitude: " + this.getMaxAltitude() + "km";
	}
}
