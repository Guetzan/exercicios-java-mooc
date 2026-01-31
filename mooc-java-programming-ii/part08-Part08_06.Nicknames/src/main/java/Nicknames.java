import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> people = new HashMap<>();
        people.put("matthew", "matt");
        people.put("michael", "mix");
        people.put("arthur", "artie");

        System.out.println(people.get("matthew"));
    }
}
