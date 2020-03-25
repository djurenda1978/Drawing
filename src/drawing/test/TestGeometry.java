package drawing.test;

import drawing.model.Circle;
import drawing.model.Line;
import drawing.model.Point;
import drawing.model.Rectagle;

public class TestGeometry {

    public static void main(String[] args) {


        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        Point d = new Point();

        Line line1 = new Line();
        Line line2 = new Line();
        Circle circle = new Circle();
        Rectagle rectagle = new Rectagle();

        a.setX(0);
        a.setY(0);
        b.setX(3);
        b.setY(4);

        line1.setStartPoint(a);
        line1.setEndPoint(b);

        double distanca1 = a.distance(b);
        double distanca2 = line1.length();

        System.out.println("Vrednost tacke 1:" + a.getX());
        System.out.println("Vrednost tacke 2:" + a.getY());
        System.out.println("Duzina 1 nacin  je :" + distanca1);
        System.out.println("Duzina 2 nacin  je :" + distanca2);

        a.setX(0);
        a.setY(0);
        b.setX(0);
        b.setY(3);
        line1.setStartPoint(a);
        line1.setEndPoint(b);

        circle.setRadious(line1);
         double area = circle.area();
        System.out.println("Povrsina kruga je: " + area);

        a.setX(0);
        a.setY(0);
        b.setX(0);
        b.setY(4);

        c.setX(0);
        c.setY(0);
        d.setX(6);
        d.setY(0);

        line1.setStartPoint(a);  
        line1.setEndPoint(b);
        line2.setStartPoint(c);
        line2.setEndPoint(d);

        rectagle.setUperleftY(line1);
        rectagle.setUpperleftX(line2);

        System.out.println("Povrsina pravougaonika: " + rectagle.area());


    }
}
