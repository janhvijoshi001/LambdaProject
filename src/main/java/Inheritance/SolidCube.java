package Inheritance;

import javax.json.Json;
import javax.json.JsonObject;

public class SolidCube extends MasterClass {

    @Override
    public double area(int length, int width, int height, int radius) {
        return length*length*length;
    }

    public JsonObject details(int length,int width, int height, int radius) {
        return Json.createObjectBuilder().add("LENGTH-->",length)
                .add("WIDTH-->",width)
                .add("HEIGHT-->",height)
                .add("RADIUS-->",radius).build();
    }
}
