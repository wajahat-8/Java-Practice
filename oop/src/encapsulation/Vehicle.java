package encapsulation;
public class Vehicle {
	private final String vin;
	private double speed;
	Vehicle(String vin) {
		this.vin=vin;
	}
public String getVin() {
	return vin;
}
public double getSpeed() {
	return speed;
}
protected void setSpeed(double speed) {
	if (speed>=0) {
		this.speed=speed;
	}else {
		System.out.println("Speed cannot be negative");
	}
}
}
