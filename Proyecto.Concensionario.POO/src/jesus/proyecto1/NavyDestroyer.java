package jesus.proyecto1;

public class NavyDestroyer extends Vehicles implements SomeVehicleActions {
	
	public boolean moving = false, anchor = false;
	
	static final String sBrand = "US-Navy", sModel = "Arleigh-Burke";
	static final double sSpeed = 56;
	static final int sPassengers = 281, sRange = 8100;
	
	public NavyDestroyer() {
		this.brand = sBrand;
		this.model = sModel;
		this.maxSpeed = sSpeed;
		this.maxRange = sRange;
		this.numberOfPassengers = sPassengers;
		super.setPlate();
	}
	
	public boolean isAnchor() {
		return this.anchor;
	}
	
	@Override
	public boolean isMoving() {
		
		return this.moving;
	}

	@Override
	public void accelerate() {
		
		if (this.isEngineOn() == true) {
			if (this.isAnchor() == false) {
				this.moving = true;
				System.out.println("The destroyer is now moving at a speed of 25 km/h");
			}
			
			else
				System.out.println("Remove the anchor first.");
		}
		
		else
			System.out.println("Turn on the engine first.");
	}

	@Override
	public void goMaxSpeed() {
		
		if (this.isEngineOn() == true) {
			if (this.isAnchor() == false) {
				this.moving = true;
				System.out.println("The destroyer is now moving at a speed of " + this.getMaxSpeed() + "km/h");
			}
			
			else
				System.out.println("Remove the anchor first.");
		}
		
		else
			System.out.println("Turn on the engine first.");
	}

	@Override
	public void stop() {
		
		this.anchor = true;
		System.out.println("Anchor deployed.");
			
		if (this.isMoving() == true) {
			this.moving = false;
			System.out.println("The destroyer has stopped.");
		}
	}
	
	public void removeAnchor() {
		
		if (this.isAnchor() == true) {
			this.anchor = false;
			System.out.println("Anchor removed.");
		}
		
		else
			System.out.println("Can't remove the anchor if it hasn't been deployed.");
	}
	
	public void shootMissile(String target) {
		System.out.println(target + " has been destroyed :D.");
	}
}
