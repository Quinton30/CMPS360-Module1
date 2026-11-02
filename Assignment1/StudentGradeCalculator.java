/** CMPS 360 - Assignment 1: Student Information and Grade Calculator. */
public class StudentGradeCalculator {
    public static void main(String[] args) {
        // Student and course information.
        String studentName = "Quinton Alexandre";
        String major = "Applied Computer Science";
        String courseName = "CMPS 360 - Survey of Programming Languages";

        // Three example assignment scores on a 0-100 scale.
        double assignmentOne = 87.0;
        double assignmentTwo = 94.0;
        double assignmentThree = 81.0;

        // Calculate the arithmetic mean of the three assignment scores.
        double average = (assignmentOne + assignmentTwo + assignmentThree) / 3.0;

        // Print student details, scores and average in the console.
        System.out.println("=== Student Grade Calculator ===");
        System.out.println("Student: " + studentName);
        System.out.println("Major: " + major);
        System.out.println("Course: " + courseName);
        System.out.printf("Assignment grades: %.1f, %.1f, %.1f%n",
                assignmentOne, assignmentTwo, assignmentThree);
        System.out.printf("Average grade: %.2f%n", average);

        // A student passes with an average of 70 or higher.
        if (average >= 70.0) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }
}
