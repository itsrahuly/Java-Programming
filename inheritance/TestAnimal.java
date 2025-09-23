

class Animal{
	String name;

	Animal() {
		this.name = "not given";
	}

	Animal(String name) {
		
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	 void display() {
		System.out.println("Name of animal:"+this.name);
		System.out.println();

	}
	
}
class Dog extends Animal
{
	String dName;
	


	Dog() {
		super();
		this.name ="barks";
		
	}

	Dog(String dName,String name) {
		super(name);
		this.dName =dName;
		
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	 void display() {
		 super.display();
			System.out.println("Name of dog:"+this.dName);

		}
	
}
class Cat extends Animal{
	String cName;

	Cat() {
		super("cat");
		this.cName="meows";
	}

	Cat(String cName,String name) {
		super(name);
		this.cName = cName;
	}

	String getcName() {
		return cName;
	}

	void setcName(String cName) {
		this.cName = cName;
	}
	void display() {
		 super.display();
			System.out.println("Name of cat:"+this.cName);

		}
	
}

class TestAnimal {

	public static void main(String[] args) {
		Animal a1 = new Animal();
        a1.display();

        Dog d1 = new Dog();
        d1.display();

        Cat c1 = new Cat();
        c1.display();

        Dog d2 = new Dog("Bow-bow", "Doggy");
        d2.display();

        Cat c2 = new Cat("Purr-purr", "Kitty");
        c2.display();

	}

}
