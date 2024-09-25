package Opgave04;


import org.w3c.dom.css.Rect;

//opgave 9.1
public class Rectangle {
    //instance variables
    double width;
    double height;

    public static void main(String[] args) {
        //Create the rectangle obeject using the constructor
        Rectangle rectangle= new Rectangle(5,7);
        System.out.println("Area " + rectangle.getArea());
        System.out.println("Perimeter " + rectangle.getPerimeter());
    }


    Rectangle() {
        double width = 1;
        double height = 1;
    }

    //Constructor
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
