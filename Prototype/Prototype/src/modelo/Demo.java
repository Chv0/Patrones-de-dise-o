/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Legion
 */
public class Demo {
    /*public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Las formas son objetos diferentes (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": Y son idénticas (yay!)");
                } else {
                    System.out.println(i + ": Pero no son idénticas (booo!)");
                }
            } else {
                System.out.println(i + ": Las formas de los objetos son iguales (booo!)");
            }
        }
    }*/
     public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("Gran círculo verde");
        Shape shape2 = cache.get("Rectángulo azul mediano");
        Shape shape3 = cache.get("Rectángulo azul mediano");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("¡Círculo verde grande! = Rectángulo azul mediano (yay!)");
        } else {
            System.out.println("Círculo verde grande == Rectángulo azul mediano (booo!)");
        }

        if (shape2 != shape3) {
            System.out.println("Los rectángulos azules medianos son dos objetos diferentes (yay!)");
            if (shape2.equals(shape3)) {
                System.out.println("Y ellos son idénticos (yay!)");
            } else {
                System.out.println("Pero ellos no son idénticos (booo!)");
            }
        } else {
            System.out.println("Los objetos rectangulares son iguales (booo!)");
        }
    }
    

}
