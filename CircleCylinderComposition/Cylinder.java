package CircleCylinderComposition;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double height) {
        base = new Circle();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;
    }
}
