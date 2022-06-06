package Second;

import javax.json.Json;
import javax.json.JsonObject;
import java.util.Optional;

public class EnumTesting {
    public enum CoffeeSize {
        SMALL, MEDIUM, LARGE
    }

    public enum FriesSize {
        MEDIUM, LARGE, XLARGE
    }

    public static FriesSize value;

    public EnumTesting(FriesSize friesSize) {
        if(friesSize == null) {
            value = FriesSize.LARGE;
        }else value = friesSize;
    }

    public JsonObject details(CoffeeSize size, int orderNumber) {
        JsonObject response = Json.createObjectBuilder().add("Size-->",size.toString())
                    .add("orderNumber--->" ,orderNumber).build();
        return response;
    }

    public JsonObject details(CoffeeSize size,int orderNumber, String name) {
        JsonObject response = Json.createObjectBuilder().add("Size-->",size.toString())
                .add("orderNumber--->" ,orderNumber)
                .add("Customer Name--->",name)
                .add("fries Size--->",value.toString()).build();
        return response;
    }
}
