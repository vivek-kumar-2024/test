public class InterceptorClock {
    public static void main(String[] args) {
        trackTime(3600000); // 100 hours * 60 mins * 60 secs * 10 tenths
    }

    public static void trackTime(int iterations) {
        int tenthsOfSeconds = 0;
        double timeSeconds = 0.0;
        for (int i = 0; i < iterations; i++) {
            tenthsOfSeconds++;
            timeSeconds += 0.1;
        }
        double expected = tenthsOfSeconds * 0.1;
        double difference = timeSeconds - expected;
        System.out.println("Accumulated time: " + timeSeconds);
        System.out.println("Expected time:    " + expected);
        System.out.println("Difference:       " + difference);
    }
}
