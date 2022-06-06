package FirstOne;

import javax.json.Json;
import javax.json.JsonObject;

public class SingletonClass {
     private static SingletonClass singletonClassObject;

     private SingletonClass() {}

    public static SingletonClass getInstance() {
         if(singletonClassObject == null) {
              return singletonClassObject = new SingletonClass();
         }
        return singletonClassObject;
    }

    private JsonObject UserDetails(String name,String lastName, int age, String address) {
         return Json.createObjectBuilder().add("name", name)
                 .add("lastName",lastName)
                 .add("age",age)
                 .add("address",address).build();
    }

}
