public class InterceptorClock {
    public static double trackTime(int iterations) {
        int tenthsOfSeconds = 0;
        double timeSeconds = 0.0;
        for (int i = 0; i < iterations; i++) {
            tenthsOfSeconds++;
            timeSeconds += 0.1;
        }
       
        return timeSeconds;
    }
}
