package drawing.test;

import drawing.model.Circle;
import drawing.model.Point;
import drawing.model.Rectagle;

public class TestGeometry {

    public static void main(String[] args) {

//        Point point1 = new Point();
//        Point point2 = new Point();
//        Circle circle = new Circle();
//        Rectagle rectagle = new Rectagle();
//
//        point2.setX(3);
//        point2.setY(4);
//        System.out.println("The length between two points is: " + point1.distance(point2));
//
//        circle.setRadious(3);
//        System.out.println("The circle area is: " + circle.area());
//
//        rectagle.setHeight(4);
//        rectagle.setWidth(6);
//        System.out.println("The Rectangle area is: " + rectagle.area());
//

        Point p3 = new Point(5,6);
        System.out.println("p3 Promenljiva x:" + p3.getX() + ",p3 Promenljiva y:" + p3.getY()+",p3 Promenljiva selected:" + p3.isSelected());

        Point p4 = new Point(10,20,true);
        System.out.println("p4 Promenljiva x:" + p4.getX() + ",p4 Promenljiva y:" + p4.getY()+",p4 Promenljiva selected:" + p4.isSelected());

        p3.setSelected(p4.isSelected());
        System.out.println("Sada je p3 selected:"+ p3.isSelected() );

        Point p5 = p3;
        p3.setX(9);
        System.out.println("Vrednost x na koju polazije p5 je: " + p5.getX());

        Point p6 = new Point(p3.getX(),p3.getY());
        System.out.println("p6 Promenljiva x:" + p6.getX() + ", p6 Promenljiva y:"+ p6.getY());

        System.out.println("Zadatak 11: Bice unisten Point(30, 40) ");


    }
}
