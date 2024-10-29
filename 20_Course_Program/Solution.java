import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Course {
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public int getHandson() {
        return handson;
    }

    public String getCourseName() {
        return courseName;
    }
}

public class Solution {
    private static int findAvgOfQuizByAdmin(Course[] courses, String givenAdmin) {
        int sum = 0;
        int count = 0;

        for (Course course : courses) {
            if (course.getCourseAdmin().equalsIgnoreCase(givenAdmin)) {
                sum += course.getQuiz();
                count++;
            }
        }

        return sum != 0 ? (int) sum / count : 0;
    }

    private static Course[] sortCourseByHandsOn(Course[] courses, int givenHandson) {
        List<Course> result = new ArrayList<>();

        Arrays.sort(courses, (c1, c2) -> Integer.compare(c1.getHandson(), c2.getHandson()));

        for (Course course : courses) {
            if (course.getHandson() < givenHandson) {
                result.add(course);
            }
        }

        return result.isEmpty() ? null : result.toArray(new Course[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] courses = new Course[4];

        for (int i = 0; i < 4; i++) {
            int courseId = sc.nextInt();
            sc.nextLine();
            String courseName = sc.nextLine();
            String courseAdmin = sc.nextLine();
            int quiz = sc.nextInt();
            sc.nextLine();
            int handson = sc.nextInt();
            sc.nextLine();
            
            courses[i] = new Course(courseId, courseName, courseAdmin, quiz, handson);
        }

        String givenAdmin = sc.nextLine();
        int givenHandson = sc.nextInt();
        sc.close();

        int avg = findAvgOfQuizByAdmin(courses, givenAdmin);
        System.out.println(avg != 0 ? avg : "No Course found.");

        Course[] result = sortCourseByHandsOn(courses, givenHandson);
        if (result != null) {
            for (Course course : result) {
                System.out.println(course.getCourseName());
            }
        } else {
            System.out.println("No Course found with mentioned attribute.");
        }
    }
}