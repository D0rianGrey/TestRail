import java.util.Map;
import java.util.HashMap;

import org.json.simple.JSONObject;

public class Program {
    public static void main(String[] args) throws Exception {
        APIClient client = new APIClient("https://mycareer.testrail.io/");
        client.setUser("Eugene Vakerin");
        client.setPassword("emtC3j76YdXP4UbfiRTn");
    }
}