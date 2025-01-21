public class DataProcessor {

    public void processData() {
        for (int i = 0; i < 1000000; i++) {
            String logMessage = "Processing item number: " + i;
            log(logMessage);
        }
    }

    private void log(String message) {
        // Simulated logging function
        System.out.println(message);
    }

    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        long startTime = System.currentTimeMillis();

        processor.processData();

        long endTime = System.currentTimeMillis();
        System.out.println("Processing completed in " + (endTime - startTime) + " milliseconds.");
    }
}
