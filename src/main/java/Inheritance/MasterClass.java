package Inheritance;

public class MasterClass {
    protected final double pi;

    public MasterClass() {
        pi = 3.14;
    }

    public double area(int length, int width, int height,int radius) {
        return length*width*height;
    }
}
