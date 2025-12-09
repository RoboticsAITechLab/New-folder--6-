class Shape {
    public double getArea() {
        return 0;
    }
}

class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() { // area of triangle = 0.5 * base * height
        return 0.5 * base * height;
    }
}

class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() { // area of square = side * side
        return side * side;
    }
}

public class act2 {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0] = new Square(5);
        shape[1] = new Triangle(4, 6);

        System.out.println("Area of Square: " + shape[0].getArea());
        System.out.println("Area of Triangle: " + shape[1].getArea());
    }
}



