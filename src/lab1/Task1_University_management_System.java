package lab1;
//Lab Task 1
//A Student is an object in a university management System. Analyze the concept and identify the data
//members that a Student class should have. Also analyze the behavior of student in a university
//management System and identify the methods that should be included in Student class.

public class Task1_University_management_System {

        public static void main(String[] args) {
            // Creating a new student
           Task1_UMS_Student student1 = new Task1_UMS_Student("S123", "Ali", "Raza");

            // Updating student profile
            student1.updateProfile("alice.johnson@example.com", "1234567890", "123 University Ave");

            // Enrolling in courses
            student1.enrollInCourse("CS101");
            student1.enrollInCourse("MA102");

            // Viewing enrolled courses
            student1.viewEnrolledCourses();

            // Dropping a course
            student1.dropCourse("MA102");

            // Viewing enrolled courses again
            student1.viewEnrolledCourses();

            // Graduate the student
            student1.graduate();

            // Trying to enroll in another course after graduation (just to see behavior)
            student1.enrollInCourse("PH103");
        }
    }


