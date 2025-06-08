public class RapidInvoker {
    public static void main(String[] args) {
        RadiationController controller = new RadiationController();

        // Simulate rapid operator entry switching modes and doses
        controller.setXRayMode();
        controller.setDose(100);
        controller.setElectronMode();
        controller.setDose(200);
        controller.start(); // Should deliver Electron, but due to race, could misbehave

        controller.setXRayMode();
        controller.setDose(150);
        controller.start(); // Should deliver X-Ray

        // Repeat rapid switching
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                controller.setXRayMode();
                controller.setDose(50 + i);
            } else {
                controller.setElectronMode();
                controller.setDose(100 + i);
            }
            controller.start();
        }
    }
}