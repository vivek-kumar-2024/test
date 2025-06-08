public class RocketGuidanceSystem {
    public static void processVelocity(double horizontalVelocity) {
        short velocityData = (short) horizontalVelocity;

        System.out.println("Horizontal velocity (converted): " + velocityData);

        // Using the converted value in further calculations
        try {
            if (velocityData < 0) {
                throw new Exception("Invalid velocity data received!");
            }
            // Proceed with guidance logic...
            System.out.println("Guidance calculations proceed.");
        } catch (Exception e) {
            System.out.println("Guidance system shutdown: " + e.getMessage());
        }
    }
}
