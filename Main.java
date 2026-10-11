import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, int[]> students = new HashMap<>();

        students.put("Aisha", new int[]{85, 92, 78});
        students.put("Rahul", new int[]{70, 88, 91});
        students.put("Sara", new int[]{95, 89, 94});
        students.put("Omar", new int[]{60, 75, 80});

        String bestStudent = "";
        double highestAverage = -1;

        for (Map.Entry<String, int[]> entry : students.entrySet()) {
            int[] marks = entry.getValue();
            int total = 0;

            for (int mark : marks) {
                total += mark;
            }

            double average = (double) total / marks.length;

            System.out.printf("%s: Average = %.2f%n",
                    entry.getKey(), average);

            if (average > highestAverage) {
                highestAverage = average;
                bestStudent = entry.getKey();
            }
        }

        System.out.println("\nTop student: " + bestStudent);
    }
}