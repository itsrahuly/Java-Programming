class Fruit{
	String fruitName;
    String fruitColor;
    double fruitWeight;
	Fruit() {
		super();
	}
	Fruit(String fruitName, String fruitColor, double fruitWeight) {
		super();
		this.fruitName = fruitName;
		this.fruitColor = fruitColor;
		this.fruitWeight = fruitWeight;
	}
	String getFruitName() {
		return fruitName;
	}
	void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	String getFruitColor() {
		return fruitColor;
	}
	void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}
	double getFruitWeight() {
		return fruitWeight;
	}
	void setFruitWeight(double fruitWeight) {
		this.fruitWeight = fruitWeight;
	} 
	void display() {
        System.out.println("Fruit Name   : " + fruitName);
        System.out.println("Fruit Color  : " + fruitColor);
        System.out.println("Fruit Weight : " + fruitWeight + " grams");
    }
    
}
class Mango extends Fruit {
    String mangoVariety;   
    String mangoSeason;
	Mango() {
		super();
	}
	
	Mango(String mangoVariety, String mangoSeason,String fruitName, String fruitColor, double fruitWeight) {
		super(fruitName,fruitColor,fruitWeight);
		this.mangoVariety = mangoVariety;
		this.mangoSeason = mangoSeason;
	}

	String getMangoVariety() {
		return mangoVariety;
	}
	void setMangoVariety(String mangoVariety) {
		this.mangoVariety = mangoVariety;
	}
	String getMangoSeason() {
		return mangoSeason;
	}
	void setMangoSeason(String mangoSeason) {
		this.mangoSeason = mangoSeason;
	}   
	 void display() {
	        super.display();  // Call Fruit display()
	        System.out.println("Mango Variety: " + mangoVariety);
	        System.out.println("Mango Season : " + mangoSeason);
	    }
    
}

class TestFruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Fruit f1 = new Fruit("Generic Fruit", "Green", 120);
	        f1.display();

	        System.out.println("----------------");

	        Mango m1 = new Mango("Mango", "Yellow", "Alphonso", "Summer",250);
	        m1.display();

	}

}
