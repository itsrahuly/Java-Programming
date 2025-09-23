class Appliance {
    String brand;
    String model;
    double price;

    Appliance() {
		super();
	}

	Appliance(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void display() {
        System.out.println("Appliance Brand : " + brand);
        System.out.println("Appliance Model : " + model);
        System.out.println("Price           : " + price);
    }
}

class WashingMachine extends Appliance {
    double capacity;       // in kg
    String loadType;       // "Front Load" / "Top Load"

    
    WashingMachine() {
		super();
	}

	WashingMachine(String brand, String model, double price, double capacity, String loadType) {
        super(brand, model, price);
        this.capacity = capacity;
        this.loadType = loadType;
    }

    double getCapacity() {
		return capacity;
	}

	void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	String getLoadType() {
		return loadType;
	}

	void setLoadType(String loadType) {
		this.loadType = loadType;
	}

	void display() {
        super.display(); // show Appliance details
        System.out.println("Capacity        : " + capacity + " kg");
        System.out.println("Load Type       : " + loadType);
    }
}

class TestAppliance {
    public static void main(String[] args) {
        Appliance a1 = new Appliance("LG", "Basic", 15000);
        a1.display();

        System.out.println("----------------");

        WashingMachine wm1 = new WashingMachine("Samsung", "SmartWash X1", 32000, 7.5, "Front Load");
        wm1.display();
    }
}
