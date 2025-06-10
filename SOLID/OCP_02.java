package SOLID;

public class OCP_02 {
    
    public static abstract class Shape {
        public abstract double area();
    }

    public static class Square extends Shape {
        private final double side;
        public Square(double side) { this.side = side; }
        @Override public double area() { return side * side; }
    }

    public static class Circle extends Shape {
        private final double radius;
        public Circle(double radius) { this.radius = radius; }
        @Override public double area() { return Math.PI * radius * radius; }
    }

    public static final class Rectangle extends Shape {
        private final double width;
        private final double height;
        public Rectangle(double width, double height) {
            this.width  = width;
            this.height = height;
        }
        @Override public double area() { return width * height; }
    }
 
    public static final class Triangle extends Shape {
        private final double base;
        private final double height;
        public Triangle(double base, double height) {
            this.base   = base;
            this.height = height;
        }
        @Override public double area() { return 0.5 * base * height; }
    }

    public static class AreaCalculator {
        public double getArea(Shape shape) {
            return shape.area(); 
        }
    }

    public static void main(String[] args) { 
            AreaCalculator calc = new AreaCalculator();
            System.out.println("Square area: "    + calc.getArea(new Square(8)));      
            System.out.println("Circle area: "    + calc.getArea(new Circle(6)));     
            System.out.println("Rectangle area: " + calc.getArea(new Rectangle(4, 9))); 
            System.out.println("Triangle area: "  + calc.getArea(new Triangle(3, 7))); 
            }
}
