package jesus.proyecto1;

public class Plane extends Aircraft implements AircraftLanding {
	private boolean landingGearOut = false;
	
	static final String planeBrands = "Bombardier";
	static final String planeModels =  "Global6500";
	
	public Plane() {
		this.setBrand();
		this.setModel();
		super.setPlate();
		this.setAltitude();
		this.setPassengers();
		this.setPilots();
		this.setRange();
		this.setSpeed();
	}
	
	public boolean isLgo() {
		return this.landingGearOut;
	}
	
	public void Lgo() {
		
		if (this.isLgo() == false) {
			this.landingGearOut = true;
			System.out.println("Landing gear deployed.");
		}
		else {
			this.landingGearOut = false;
			System.out.println("Landing gear retracted.");
		}
	}
	
	public void setBrand() {
		this.brand = planeBrands;
	}
	
	public void setModel() {
		this.model = planeModels;
	}
	
	public void setSpeed() {
		this.maxSpeed = 850.0;
	}
	
	public void setPassengers() {
		this.numberOfPassengers = 17;
	}
	
	public void setRange() {
		this.maxRange = 12223;
	}
	
	public void setAltitude() {
		this.maxAltitude = 12.5;
	}
	
	public void setPilots() {
		this.numberOfPilots = 1;
	}
	
	public void setPlate() {
		PlateGenerator p = new PlateGenerator();
		this.plate = p.plate(6);
	}
	
	public void land() {
		
		if (this.isFlying() == true) {
			this.flying = false;
			if (this.isLgo() == true)
				System.out.println("The plane landed safely.");
			else {
				this.EngineOff();
				System.out.println("You crashed.");
			}
		}
		
		else
			System.out.println("You have to be flying to land.");
	}
}
