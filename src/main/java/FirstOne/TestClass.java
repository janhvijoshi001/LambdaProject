package FirstOne;

import Inheritance.SolidCube;
import Inheritance.SolidCylinder;
import Second.EnumTesting;
import Second.Rectangle;
import abstractMain.Classes.FetchDetails;

import javax.json.Json;
import javax.json.JsonObject;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("testing");
        Rectangle obj = new Rectangle();
        int result = obj.area(30,20);
        System.out.println("result--> "+result);
        System.out.println("result--> "+Rectangle.copy);

        EnumTesting enumTesting = new EnumTesting(null);
        EnumTesting enumTesting1 = new EnumTesting(null);
        System.out.println("----Order Details-----"+"\n"+enumTesting.details(EnumTesting.CoffeeSize.MEDIUM,38299765));
        System.out.println("----Order Details-----"+"\n"+enumTesting.details(EnumTesting.CoffeeSize.SMALL,2222222,"janhvi joshi"));

        SolidCylinder solidCylinder = new SolidCylinder();
        SolidCube solidCube = new SolidCube();
        TestClass test = new TestClass();
        System.out.println(test.areaResponse(solidCylinder,solidCube));
        test.abstractClassDetails();


    }
    private JsonObject areaResponse(SolidCylinder solidCylinder, SolidCube solidCube) {

        JsonObject responseArea =  Json.createObjectBuilder()
                .add("given details---->",solidCube.details(4,2,5,5))
                .add("area of solid cube-->",solidCube.area(4,2,5,5))
                .add("given details---->",solidCylinder.details(5,55,65,25))
                .add("area of Solid Cylinder--->", solidCylinder.area(5,55,65,25)).build();
        return responseArea;
    }

    private void abstractClassDetails() {
        FetchDetails fetchDetails = new FetchDetails();
        System.out.println("FetchDetails " + fetchDetails.personDetails());
    }
}
