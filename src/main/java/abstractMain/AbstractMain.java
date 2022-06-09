package abstractMain;

import lombok.Getter;
import lombok.Setter;

import javax.json.Json;
import javax.json.JsonObject;

@Getter
@Setter
public abstract class AbstractMain {
    private String name;
    private String id;
    private String lastName;

    public abstract JsonObject personDetails();

    public JsonObject details(String name,String id, String lastName) {
        JsonObject response = Json.createObjectBuilder().add("name",name)
                .add("id",id)
                .add("Last Name",lastName).build();
        return response;
    }

}
