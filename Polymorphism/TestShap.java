class Shape {
    void area() {
        System.out.println("Shape area() called");
    }
} // class Shape end

// Triangle subclass
class Triangle extends Shape {
    double base;
    double height;

    Triangle() {
        this.base = 10;
        this.height = 5;
    }

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void setBase(double base) {
        this.base = base;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getBase() {
        return base;
    }

    double getHeight() {
        return height;
    }

    @Override
    void area() {
        super.area();
        double result = 0.5 * base * height;
        System.out.println("Triangle Area: " + result);
    }
}

// Circle subclass
class Circle extends Shape {
    double radius;

    Circle() {
        this.radius = 2;
    }

    Circle(double r) {
        this.radius = r;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    @Override
    void area() {
        super.area();
        double result = 3.14 * radius * radius;
        System.out.println("Circle Area: " + result);
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle() {
        this.length = 2;
        this.breadth = 4;
    }

    Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    void setLength(double length) {
        this.length = length;
    }

    void setBreath(double b) {
        this.breadth = b;
    }

    double getLength() {
        return length;
    }

    double getBreath() {
        return breadth;
    }

    @Override
    void area() {
        super.area();
        double result = length * breadth;
        System.out.println("Rectangle Area: " + result);
    }
}

// Test class
class TestShap {
    public static void main(String[] args) {
        Shape s1 = new Triangle(6, 8);
        Shape s2 = new Circle(7);
        Shape s3 = new Rectangle(5, 10);

        s1.area();
        s2.area();
        s3.area();
    }
}
