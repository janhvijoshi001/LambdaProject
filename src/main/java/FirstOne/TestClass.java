package FirstOne;

import Second.EnumTesting;
import Second.Rectangle;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("testing");
        Rectangle obj = new Rectangle();
        int result = obj.area(30,20);
        System.out.println("result--> "+result);
        System.out.println("result--> "+Rectangle.copy);

        EnumTesting enumTesting = new EnumTesting(null);
        System.out.println("----Order Details-----"+"\n"+enumTesting.details(EnumTesting.CoffeeSize.MEDIUM,38299765));
        System.out.println("----Order Details-----"+"\n"+enumTesting.details(EnumTesting.CoffeeSize.SMALL,2222222,"janhvi joshi"));

    }
}
