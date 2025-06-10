package lab1;

import java.util.ArrayList;
import java.util.List;
public class Task1_UMS_Student {

        private String studentId;
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String address;
        private String department;
        private double gpa;
        private List<String> enrolledCourses;
        private boolean isActive;

        public Task1_UMS_Student(String studentId, String firstName, String lastName) {
            this.studentId = studentId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.enrolledCourses = new ArrayList<>();
            this.isActive = true;
        }

        public void enrollInCourse(String courseId) {
            if (!enrolledCourses.contains(courseId)) {
                enrolledCourses.add(courseId);
                System.out.println("Enrolled in " + courseId);
            }
        }

        public void dropCourse(String courseId) {
            enrolledCourses.remove(courseId);
            System.out.println("Dropped course " + courseId);
        }

        public void viewEnrolledCourses() {
            System.out.println("Courses enrolled: " + enrolledCourses);
        }

        public void updateProfile(String email, String phoneNumber, String address) {
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.address = address;
        }

        public void graduate() {
            this.isActive = false;
            System.out.println("Student " + studentId + " has graduated.");
        }

        public void suspend() {
            this.isActive = false;
            System.out.println("Student " + studentId + " has been suspended.");
        }

        // Getters, setters, and additional methods like calculateGPA can be added here
    }


