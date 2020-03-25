package drawing.test;

import drawing.model.Circle;
import drawing.model.Point;
import drawing.model.Rectagle;

public class TestGeometry {

    public static void main(String[] args) {

        Point point1 = new Point();
        Point point2 = new Point();
        Circle circle = new Circle();
        Rectagle rectagle = new Rectagle();

        point2.setX(3);
        point2.setY(4);
        System.out.println("The length between two points is: " + point1.distance(point2));

        circle.setRadious(3);
        System.out.println("The circle area is: " + circle.area());

        rectagle.setHeight(4);
        rectagle.setWidth(6);
        System.out.println("The Rectangle area is: " + rectagle.area());


    }
}
