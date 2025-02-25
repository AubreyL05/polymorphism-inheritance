package org.example;

import org.example.Shapes.Circle;
import org.example.Shapes.Rectangle;
import org.example.Shapes.Square;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(8,20);
        System.out.println(rect1);

        Square sqr1 = new Square(5);
        System.out.println(sqr1);

        Circle cir1 = new Circle(5);
        System.out.println(cir1);
    }
}