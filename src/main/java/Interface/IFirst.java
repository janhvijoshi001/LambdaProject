package Interface;

import javax.json.JsonObject;
import java.util.UUID;

 interface IFirst {
     public UUID id = UUID.randomUUID();

    public String generateCategory();
    public JsonObject userDetails();
}
