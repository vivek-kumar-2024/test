import java.util.HashMap;Add commentMore actions
import java.util.Map;

public class OrderProcessor {

    private static final String MODE_NEW = "NEW";
    private static final String MODE_LEGACY = "LEGACY";

    // Simulate different servers with different code versions
    private static final Map<String, String> serverModes = new HashMap<>();

    static {
        // Server A runs new code
        serverModes.put("ServerA", MODE_NEW);
        // Server B accidentally runs legacy code
        serverModes.put("ServerB", MODE_LEGACY);
    }

    public static void main(String[] args) {
        processOrder("ServerA", 100, "BUY");
        processOrder("ServerB", 100, "BUY");
    }

    public static void processOrder(String server, int qty, String side) {
        String mode = serverModes.get(server);
        if (MODE_NEW.equals(mode)) {
            placeOrder(qty, side);
        } else if (MODE_LEGACY.equals(mode)) {
            for (int i = 0; i < 1000; i++) {
                placeOrder(qty, side);
            }
        }
    }

    public static void placeOrder(int qty, String side) {
        System.out.println("Placed order: " + side + " " + qty + " shares");
    }
}
