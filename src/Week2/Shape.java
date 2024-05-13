package Week2;
public class Shape {
    public double calculateArea(){
        return 0;
    }
    public int calculatePerimeter(){
        return 0;
    }
}

class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public static void main(String[] args){
        Circle circle = new Circle(10);
        System.out.println(circle.calculateArea());
    }

}

class Rectangle extends Shape{
    int length;
    int width;
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    @Override
    public int calculatePerimeter(){
        return 2 * (length + width);
    }


    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(3,4);
        System.out.println(rectangle.calculatePerimeter());
    }

}