package drawing.test;

import drawing.model.*;

import java.util.Scanner;

public class TestGeometry {

    public static void main(String[] args) {
//
//        vezba 4
//        Point point1 = new Point();
//        Point point2 = new Point();
//        Circle circle = new Circle();
//        Rectangle rectagle = new Rectangle();
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
//
//        vezba 5
//        Point p3 = new Point(5,6);
//        System.out.println("p3 Promenljiva x:" + p3.getX() + ",p3 Promenljiva y:" + p3.getY()+",p3 Promenljiva selected:" + p3.isSelected());
//
//        Point p4 = new Point(10,20,true);
//        System.out.println("p4 Promenljiva x:" + p4.getX() + ",p4 Promenljiva y:" + p4.getY()+",p4 Promenljiva selected:" + p4.isSelected());
//
//        p3.setSelected(p4.isSelected());
//        System.out.println("Sada je p3 selected:"+ p3.isSelected() );
//
//        Point p5 = p3;
//        p3.setX(9);
//        System.out.println("Vrednost x na koju polazije p5 je: " + p5.getX());
//
//        Point p6 = new Point(p3.getX(),p3.getY());
//        System.out.println("p6 Promenljiva x:" + p6.getX() + ", p6 Promenljiva y:"+ p6.getY());
//
//        System.out.println("Zadatak 11: Bice unisten Point(30, 40) ");
//
//        System.out.println("Upisite parametre za kreiranje tacke:");
//        Scanner scanner = new Scanner(System.in);
//        String pointInput = scanner.nextLine();
//        String[] arrayPointInput = pointInput.split(" ");
//
//
//        int pointX = Integer.parseInt(arrayPointInput[0]);
//        int pointY = Integer.parseInt(arrayPointInput[1]);

//        Point pointFromInput = new Point(pointX, pointY);
//        System.out.println("pointX : "   + pointFromInput.getX());
//        System.out.println("pointY : "   + pointFromInput.getY());

//        vezba: 7

        Point startPoint = new Point(3,4,true);
        Point endPoint = new Point(3,4,false);
        Point middlePoint = new Point(2,7,false);
        Point center = new Point(4,9,false);

        Line line1 = new Line(startPoint,endPoint,true);
        Line line2 = new Line(startPoint,endPoint,false);
        Line line3 = new Line(startPoint,middlePoint,false);

        Rectangle rectangle1 = new Rectangle(startPoint,3,5);
        Rectangle rectangle2 = new Rectangle(startPoint,3,5);
        Rectangle rectangle3 = new Rectangle(endPoint,3,5);

        Donut donut1 = new Donut(center,5, true,3 );
        Donut donut2 = new Donut(center,5, false,3 );
        Donut donut3 = new Donut(center,8, false,4 );

        if (startPoint.equals(endPoint)){
            System.out.println("Tacke su iste");
        } else {
            System.out.println("Tacke nisu iste");
        }

        if (line1.equals(line3)){
            System.out.println("Linije su iste");
        } else {
            System.out.println("Linije nisu iste");
        }

        if (rectangle1.equals(rectangle3)){
            System.out.println("Pravougaonici su isti");
        } else {
            System.out.println("Pravougaonici nisu isti");
        }

        if (donut1.equals(donut3)){
            System.out.println("Krofnice su iste");
        } else {
            System.out.println("Krofnice nisu iste");
        }

    }
}






