package Interface;

import lombok.Getter;
import lombok.Setter;

import javax.json.Json;
import javax.json.JsonObject;

@Setter
@Getter
public class Management implements IFirst{
    private String name;
    private String lastname;
    private String type;
    @Override
    public String generateCategory() {
        return "Management";
    }

    @Override
    public JsonObject userDetails() {
        JsonObject response = Json.createObjectBuilder()
                .add("Category",generateCategory())
                .add("name",getName())
                .add("lastname",getLastname())
                .add("Position", getType())
                .build();
        return response;
    }
}
