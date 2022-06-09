package Inheritance;

import javax.json.Json;
import javax.json.JsonObject;

public class SolidCylinder extends MasterClass {

    @Override
    public double area(int length, int width, int height,int radius) {
        height = height > 0 ? height : 4;
        return 2*radius*pi*(radius + height);
    }

    public JsonObject details(int length, int width, int height, int radius) {
        return Json.createObjectBuilder().add("LENGTH-->",length)
                .add("WIDTH-->",width)
                .add("HEIGHT-->",height)
                .add("RADIUS-->",radius).build();
    }
}
