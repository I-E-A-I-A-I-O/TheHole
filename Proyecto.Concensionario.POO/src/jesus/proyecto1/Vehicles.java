package jesus.proyecto1;

public class Vehicles {
	protected String brand, model, plate;
	protected double maxSpeed;
	protected int numberOfPassengers, maxRange;
	protected boolean engineOn = false;
	
	public void startEngine() {
		
		if (engineOn == false) {
			engineOn = true;
			System.out.println("Engine is on.");
		}
		
		else
			System.out.println("Engine is already on.");
	}
	
	public int getRange() {
		return this.maxRange;
	}
	
	public int getPassengers() {
		return this.numberOfPassengers;
	}
	
	public void EngineOff() {
		
		if (engineOn == true) {
			engineOn = false;
			System.out.println("Engine is off.");
		}
		
		else
			System.out.println("Engine is already off.");
	}

	public String getBrand() {
		return brand;
	}


	public String getPlate() {
		return plate;
	}


	public String getModel() {
		return model;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public boolean isEngineOn() {
		return engineOn;
	}
	
	public void setPlate() {
		PlateGenerator p = new PlateGenerator();
		this.plate = p.plate(6);
	}
	
	public String toString() {
		return "\nBrand: " + this.getBrand() + "\nModel: " + this.getModel() + "\nPlate: " + this.getPlate() + "\nMax speed: " 
				+ this.getMaxSpeed() + "km/h" + "\nNumber of passengers: " + this.getPassengers() + "\nRange: " + this.getRange() + "km";
	}
}
