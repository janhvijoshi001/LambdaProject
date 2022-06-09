package Interface;

import lombok.Getter;
import lombok.Setter;

import javax.json.Json;
import javax.json.JsonObject;
import java.util.Date;

@Setter
@Getter
public class Student implements IFirst{

    private String name;
    private String lastname;
    private Date dob;

    @Override
    public String generateCategory() {
        return "Student";
    }

    @Override
    public JsonObject userDetails() {
        JsonObject response = Json.createObjectBuilder()
                .add("Category",generateCategory())
                .add("name",getName())
                .add("lastname",getLastname())
                .add("DateOfBirth", getDob().toString())
                .build();
        return response;
    }
}
