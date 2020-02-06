package jesus.proyecto1;

import java.util.Random;

public class Helicopter extends Aircraft implements AircraftLanding{
	
	static final String heliBrands= "Bell";
	static final String heliModels = "Bell412";
	Random ran = new Random();
	
	public Helicopter() {
		this.setBrand();
		this.setModel();
		this.setAltitude();
		this.setPassengers();
		this.setPilots();
		super.setPlate();
		this.setRange();
		this.setSpeed();
	}
	
	
	public void setBrand() {
		this.brand = heliBrands;
	}
	
	public void setModel() {
		this.model = heliModels;
	}
	
	public void setSpeed() {
		this.maxSpeed = 230; 
	}
	
	public void setAltitude() {
		this.maxAltitude = 5;
	}
	
	public void setPilots() {
		this.numberOfPilots = 1;
	}
	
	public void setPassengers() {
		this.numberOfPassengers = 14;
	}
	
	public void setRange() {
		this.maxRange = 672;
	}
	
	public void land() {
		if (this.isFlying() == true) {
			this.flying = true;
			System.out.println("The helicopter has landed but the engine is still on.");
		}
			
		else 
			System.out.println("You must be flying to land");
	}
}
