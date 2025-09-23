class Vehicle {
    String brand;
    int speed;

    Vehicle() {
        this.brand = "Honda";
        this.speed = 100;
        System.out.println("Vehicle Default Constructor");
    }

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("Vehicle Parameterized Constructor");
    }
    

    String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void display() {
		System.out.println("vehicle brake is call");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}// class Vehicle ends here

class Car extends Vehicle {
    int doors;
    String fuelType;

    Car() {
        super();
        this.doors = 4;
        this.fuelType = "Petrol";
        System.out.println("Car Default Constructor");
    }

    Car(String brand, int speed, int doors, String fuelType) {
        super(brand, speed);
        this.doors = doors;
        this.fuelType = fuelType;
        System.out.println("Car Parameterized Constructor");
    }
    
    

    int getDoors() {
		return doors;
	}

	void setDoors(int doors) {
		this.doors = doors;
	}

	String getFuelType() {
		return fuelType;
	}

	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	void display() {
		System.out.println("car is brake is call");
    	System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Doors: " + doors);
        System.out.println("Fuel: " + fuelType);
    }
}// class car ends here

class TestVehicle 
{
    public static void main(String[] args) {
    	System.out.println();
        Vehicle v1 = new Vehicle();

        v1.display();
        v1=new Car("bmw",350005,1500,"cng,diseal");
        v1.display();
        
    }
}//class TestVehicle ends here

