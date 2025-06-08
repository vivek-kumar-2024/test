public class RadiationController {
    private boolean isXRayMode = false;
    private boolean isElectronMode = false;
    private int dose = 0;

    public void setXRayMode() {
        isXRayMode = true;
        isElectronMode = false;
    }

    public void setElectronMode() {
        isElectronMode = true;
        isXRayMode = false;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public void start() {
        if (isXRayMode) {
            deliverXRayDose();
        } else if (isElectronMode) {
            deliverElectronDose();
        }
    }

    private void deliverXRayDose() {
        System.out.println("Delivering X-Ray dose: " + dose);
        // ... deliver X-Ray dose
    }

    private void deliverElectronDose() {
        System.out.println("Delivering Electron dose: " + dose);
        // ... deliver Electron dose
    }
}
