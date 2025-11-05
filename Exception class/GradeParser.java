import java.util.Arrays;
import java.util.List;

public class GradeParser {

    public static void main(String[] args) {
        List<String> grades = Arrays.asList("90", "A+", "85");

        for (String grade : grades) {
            try {
                int gradeInt = Integer.parseInt(grade);
                System.out.println(gradeInt);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + grade);
            }
        }
    }
}
