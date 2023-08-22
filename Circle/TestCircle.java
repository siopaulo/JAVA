package Circle;

public class TestCircle {
        public static void main(String[] args) {

                Circle c1 = new Circle();
                c1.setColor("yellow");
                c1.setRadius(5);
                System.out.println("The circle is " + c1.getColor() + " and has radius of " + c1.getRadius()
                                + " and area of "
                                + c1.getArea());

                Circle c2 = new Circle(2.0);
                System.out.println("The circle is " + c2.getColor() + " and has radius of " + c2.getRadius()
                                + " and area of "
                                + c2.getArea());

                Circle c3 = new Circle(3.0, "blue");
                System.out.println("The circle is " + c3.getColor() + " and has radius of " + c3.getRadius()
                                + " and area of "
                                + c3.getArea());

                System.out.println(c1);
        }
}
