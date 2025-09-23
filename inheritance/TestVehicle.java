class Vehicle{
	String vehicleNumber;
	String vehicleBrand;
	String vehicleColor;
	Vehicle() {
		this.vehicleNumber = "ve3542";
		this.vehicleBrand = "tata";
		this.vehicleColor = "black";
	}
	Vehicle(String vehicleNumber, String vehicleBrand, String vehicleColor) {
		
		this.vehicleNumber = vehicleNumber;
		this.vehicleBrand = vehicleBrand;
		this.vehicleColor = vehicleColor;
	}
	String getVehicleNumber() {
		return vehicleNumber;
	}
	void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	String getVehicleBrand() {
		return vehicleBrand;
	}
	void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	String getVehicleColor() {
		return vehicleColor;
	}
	void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}
	void display()
	{
		System.out.println("VehicleNumber:"+this.vehicleNumber);
		System.out.println("VehicleBrand:"+this.vehicleBrand);
		System.out.println("VehicleColor"+this.vehicleColor);
		System.out.println();
	}
}
class Car extends Vehicle{
	int numberDoors;
	String fuelType;
	Car() {
		super();
		this.numberDoors = 5;
		this.fuelType = "diseal,cng";
	}
	Car(int numberDoors, String fuelType,String vehicleNumber, String vehicleBrand, String vehicleColor) {
		super(vehicleNumber,vehicleBrand,vehicleColor);
		this.numberDoors = numberDoors;
		this.fuelType = fuelType;
	}
	int getNumberDoors() {
		return numberDoors;
	}
	void setNumberDoors(int numberDoors) {
		this.numberDoors = numberDoors;
	}
	String getFuelType() {
		return fuelType;
	}
	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	void display() {
		super.display();
		System.out.println("Car Number of Doors:"+this.numberDoors);
		System.out.println("car fuel Type"+this.fuelType);
	}
	
}
class Bike extends Vehicle{
	int engineCapacity;
	String bikeType;
	Bike() {
		super();
		this.engineCapacity = 500;
		this.bikeType = "sport";
	}
	Bike(int engineCapacity, String bikeType,String vehicleNumber, String vehicleBrand, String vehicleColor) {
		super(vehicleNumber,vehicleBrand,vehicleColor);
		this.engineCapacity = engineCapacity;
		this.bikeType = bikeType;
	}
	int getEngineCapacity() {
		return engineCapacity;
	}
	void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	String getBikeType() {
		return bikeType;
	}
	void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}
	void display()
	{
		super.display();
		System.out.println("Engine Capicity:"+this.engineCapacity);
		System.out.println("Bike Type:"+this.bikeType);
	}
}
class TestVehicle {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		v1.display();
		Car c1=new Car();
		c1.display();
		Bike b1=new Bike();
		b1.display();
	}

}
