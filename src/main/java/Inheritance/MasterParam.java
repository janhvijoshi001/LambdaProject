package Inheritance;

public class MasterParam  extends MasterClass{

    protected final double pi = 3.14;;

    public int circumference(int length, int width, int height,int radius) {
        System.out.println("Master class");

        return length+width+height;
    }
    @Override
    public double area(int length, int width, int height,int radius) {
        return length*width*height;
    }
}


class Circle extends MasterParam {
    public void circleMethod() {
        System.out.println("circle own method");
    }

    @Override
    public double area(int length, int width, int height,int radius) {
        return length*width*height;
    }

    @Override
    public int circumference(int length, int width, int height,int radius) {
        System.out.println("circle class");
        return (int)(2*pi*radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();

        MasterParam masterParam = new MasterParam();
        masterParam.circumference(4,5,6,7);
        circle.circumference(2,3,5,6);
        System.out.println(circle.area(2,3,5,6));
    }
}
