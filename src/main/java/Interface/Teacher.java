package Interface;

import lombok.Getter;
import lombok.Setter;

import javax.json.Json;
import javax.json.JsonObject;
import java.util.Date;

@Getter
@Setter
public class Teacher implements IFirst{

    private String name;
    private String lastname;
    private String position;

    @Override
    public String generateCategory() {
        return "staff";
    }

    @Override
    public JsonObject userDetails() {
        JsonObject response = Json.createObjectBuilder()
                .add("Category",generateCategory())
                .add("name",getName())
                .add("lastname",getLastname())
                .add("Position", getPosition())
                .build();
        return response;
    }
}
