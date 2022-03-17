package com.company.shapedecorator;

public class Main {

    public static void main(String  args[]){
        Component circle = new RedDecorator(new Circle());
        Component  rectangle = new RedDecorator(new Rectangle());
        Component square = new BlueDecorator(new Square());

        System.out.println("Circle has red border");
        circle.draw();

        System.out.println("Rectangle has red border");
        circle.draw();

        square.draw();
    }
}
