import java.util.Scanner;

class Course {
    // private int courseId;
    // private String courseName;
    private double courseRating;
    private String mode;
    private boolean haveCertificate;

    public Course(int courseId, String courseName, double courseRating, String mode, boolean haveCertificate) {
        // this.courseId = courseId;
        // this.courseName = courseName;
        this.courseRating = courseRating;
        this.mode = mode;
        this.haveCertificate = haveCertificate;
    }

    public double getCourseRating() {
        return courseRating;
    }

    public String getMode() {
        return mode;
    }

    public boolean getHaveCertificate() {
        return haveCertificate;
    }
}

public class Solution {
    private static int countCourse(Course[] courses, String mode, double rating) {
        int count = 0;

        for (Course course : courses) {
            if (course.getHaveCertificate() && course.getCourseRating() >= rating && course.getMode().equalsIgnoreCase(mode)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] courses = new Course[4];

        for (int i = 0; i < 4; i++) {
            int courseId = sc.nextInt();
            sc.nextLine();
            String courseName = sc.nextLine();
            double courseRating = sc.nextDouble();
            sc.nextLine();
            String mode = sc.nextLine();
            boolean haveCertificate = sc.nextBoolean();
            sc.nextLine();

            courses[i] = new Course(courseId, courseName, courseRating, mode, haveCertificate);
        }

        double rating = sc.nextDouble();
        sc.nextLine();
        String mode = sc.nextLine();
        sc.close();

        int count = countCourse(courses, mode, rating);
        System.out.println(count != 0 ? count : "No course found");
    }
}