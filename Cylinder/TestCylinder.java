package Cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + cy1.getRadius()
                + " height=" + cy1.getHeight()
                + " base area=" + cy1.getArea()
                + " volume=" + cy1.getVolume());

        Cylinder cy2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius=" + cy2.getRadius()
                + " height=" + cy2.getHeight()
                + " base area=" + cy2.getArea()
                + " volume=" + cy2.getVolume());

        Cylinder cy3 = new Cylinder(3.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + cy3.getRadius()
                + " height=" + cy3.getHeight()
                + " base area=" + cy3.getArea()
                + " volume=" + cy3.getVolume());

        System.out.println(cy3);
    }
}
