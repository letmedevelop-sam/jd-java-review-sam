package com.cybertek.lambda.shape;

public class ShapeTest {
    public static void main(String[] args) {

        System.out.println(" //No Parameter, No return Type");
        Drawable drawable = () -> System.out.println(" Drawing a circle");
        drawable.draw();


        System.out.println(" //One Parameter, No return Type");
        Drawable2 drawable2 = shape -> System.out.println("Drawing a " + shape);
        drawable2.draw("Triangle");

        System.out.println("//Multiple Parameter (SO YOU WRITE THEM IN PARENTHESIS), No return Type");
        Drawable3 drawable3 = ((shape, name) -> System.out.println(name + " is drawing a " + shape));
        drawable3.draw("Circle", "Mike");



        System.out.println("//Multiple Parameter (SO YOU WRITE THEM IN PARENTHESIS), With return Type (NO NEED TO USE SOUT IN THE METHOD BUR PRITNT IT WHEN YOU CALL METHOD)");
        Drawable4 drawable4 = (shape, area) -> "Drawing a " + shape + " and it's area is " + area;
        System.out.println(drawable4.draw("Circle", 200));

        //In the action (implementation) if you have more than one line then use curly braces

        Drawable3 drawable31 = (shape, name) -> {
            System.out.println("What kind of shape is this :  " + shape);
            System.out.println("Who is drawing this shape  :  " + name);
        };
        drawable31.draw("Triangle", "Mike");

    }
}
