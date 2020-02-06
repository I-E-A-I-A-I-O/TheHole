package jesus.proyecto1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int op;
		boolean firstStart = false;
		String command;
		
		System.out.println("Welcome to JesusMotors.");
		System.out.println("Go to:\n1 = Land vehicles department\n2 = Aircraft department\n3 = Watercraft department\n"
				+"Your choice: ");
		op = scan.nextInt();
		if (op == 1) {
			System.out.println("Land vehicles available:\n1 = Electric car\n2 = Motorcycle\nYour choice: ");
			op = scan.nextInt();
			
			if (op == 1) {
				Car car = new Car();
				System.out.println(car.toString());
				do {
					System.out.println("\nYou can:\n-Turn on the car (ON)\n-Turn off the car (OFF)\n-Accelerate to max speed (MOVE)"
										+ "\n-Normal speed (NORMAL)\n-Stop (STOP)\n\nYour choice: ");
					command = scan.next();
					command = command.toUpperCase();
					switch (command) {
						case "ON":
							firstStart = true;
							car.startEngine();
							break;
						case "OFF":
							car.EngineOff();
							break;
						case "MOVE":
							car.goMaxSpeed();
							break;
						case "NORMAL":
							car.accelerate();
							break;
						case "STOP":
							car.stop();
							break;
						default:
							System.out.println("Command doesn't exist");
							break;
					}
				}while (car.isEngineOn() == true || firstStart == false);
			}
			
			else {
				Bike bike = new Bike();
				System.out.println(bike.toString());
				do {
					System.out.println("\nYou can:\n-Turn on the bike (ON)\n-Turn off the bike (OFF)\n-Accelerate to max speed (MOVE)"
										+ "\n-Normal speed (NORMAL)\n-Stop (STOP)"
										+ "\n-Wheelie (WHE)\n-Stoppie (STP)\n\nYour choice: ");
					command = scan.next();
					command = command.toUpperCase();
					switch (command) {
						case "ON":
							firstStart = true;
							bike.startEngine();
							break;
						case "OFF":
							bike.EngineOff();
							break;
						case "MOVE":
							bike.goMaxSpeed();
							break;
						case "NORMAL":
							bike.accelerate();
							break;
						case "STOP":
							bike.stop();
							break;
						case "WHE":
							bike.wheelie();
							break;
						case "STP":
							bike.stoppie();
							break;
						default:
							System.out.println("Command doesn't exist");
							break;
					}
				}while (bike.isEngineOn() == true || firstStart == false);
			}
		}
		
		else if(op == 2) {
			
			System.out.println("Aircraft available:\n1 = Jets\n2 = Helicopters\nYour choice: ");
			op = scan.nextInt();
			
			if (op == 1) {
				Plane jet = new Plane();
				System.out.println(jet.toString());
				
				do {
					System.out.println("\nYou can:\n-Start engine (ON)\n-Turn off engine (OFF)\n-Take off (FLY)"
							+ "\n-Land (LAND)\n-Deploy/Retract landing gear (GEAR)\n\nYour choice: ");
					
					command = scan.next();
					command = command.toUpperCase();
					
					switch (command) {
						case "ON":
							firstStart = true;
							jet.startEngine();
							break;
							
						case "OFF":
							jet.EngineOff();
							break;
						
						case "FLY":
							jet.takeOff();
							break;
							
						case "LAND":
							jet.land();
							break;
							
						case "GEAR":
							jet.Lgo();
							break;
								
						default:
							System.out.println("Command does not exist.");
							break;
					
					}
				} while (jet.isEngineOn() == true || firstStart == false);
				
			}
			
			else {
				Helicopter heli = new Helicopter();
				System.out.println(heli.toString());
				
				do {
					System.out.println("\nYou can:\n-Start engine (ON)\n-Turn off engine (OFF)\n-Take off (FLY)"
							+ "\n-Land (LAND)\n\nYour choice: ");
					
					command = scan.next();
					command = command.toUpperCase();
					
					switch (command) {
						case "ON":
							firstStart = true;
							heli.startEngine();
							break;
							
						case "OFF":
							heli.EngineOff();
							break;
						
						case "FLY":
							heli.takeOff();
							break;
							
						case "LAND":
							heli.land();
							break;
							
						default:
							System.out.println("Command does not exist.");
							break;
					
					}
				} while (heli.isEngineOn() == true || firstStart == false);
				
			}
		}
		
		else {
			System.out.println("Welcome to the watercraft department. Here you can test a Navy destroyer.");
			NavyDestroyer ship = new NavyDestroyer();
			System.out.println(ship.toString());
			do {
				System.out.println("\nYou can:\n-Turn on the engine (ON)\n-Turn off the engine (OFF)\n-Accelerate to max speed (MOVE)"
									+ "\n-Normal speed (NORMAL)\n-Stop/Deploy anchor (STOP)"
									+ "\n-Remove the anchor (REMOVE)\n-Shoot at target (SHOOT)\n\nYour choice: ");
				command = scan.next();
				command = command.toUpperCase();
				switch (command) {
					case "ON":
						firstStart = true;
						ship.startEngine();
						break;
					case "OFF":
						ship.EngineOff();
						break;
					case "MOVE":
						ship.goMaxSpeed();
						break;
					case "NORMAL":
						ship.accelerate();
						break;
					case "STOP":
						ship.stop();
						break;
					case "REMOVE":
						ship.removeAnchor();;
						break;
					case "SHOOT":
						System.out.println("Target: ");
						command = scan.next();
						ship.shootMissile(command);
						break;
					default:
						System.out.println("Command doesn't exist");
						break;
				}
			}while (ship.isEngineOn() == true || firstStart == false);
		}
	}
}
