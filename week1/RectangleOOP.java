// Object-oriented approach: data and methods are bundled in a class.
public class RectangleOOP {
    private double length;   // encapsulated fields
    private double width;

    public RectangleOOP(double length, double width) {
        this.length = length;   // 'this' = the current object
        this.width = width;
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }
    public double getArea() { return length * width; }
    public double getPerimeter() { return 2 * (length + width); }

    public static void main(String[] args) {
        RectangleOOP rect = new RectangleOOP(5.0, 3.0);
        System.out.println("OOP Approach:");
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}
