package abstractMain.Classes;

import abstractMain.AbstractMain;

import javax.json.Json;
import javax.json.JsonObject;
import java.util.UUID;

public class FetchDetails extends AbstractMain {


    @Override
    public JsonObject personDetails() {
        FetchDetails fetchDetails = new FetchDetails();

        JsonObject response = Json.createObjectBuilder()
                .add("AttachedNumber--->",UUID.randomUUID().toString())
                .add("Details--->",fetchDetails.details("janhvi","111","joshi")).build();
       return response;
    }
}
