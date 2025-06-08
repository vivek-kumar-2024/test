public class AgeCalculator {Add commentMore actions
    public static void calculateAge(int birthYear, int currentYear) {
        int birth = birthYear % 100; 1Code has comments. Press enter to view.
        int current = currentYear % 100;
        int age = current - birth;
        if (age < 0) {
            System.out.println("Calculated age: " + age + " (Possible data error)");
        } else {
            System.out.println("Calculated age: " + age);
        }
    }Add commentMore actions
}
