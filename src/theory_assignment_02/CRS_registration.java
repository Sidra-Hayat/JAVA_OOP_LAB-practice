package theory_assignment_02;

public class CRS_registration {

        private CRS_student student;
        private CRS_course course;

        // Constructor to associate a student with a course
        public CRS_registration(CRS_student student, CRS_course course) {
            this.student = student;
            this.course = course;
        }

        // Register a student to a course
        public void register() {
            student.registerCourse(course);
            System.out.println(student.getName() + " has successfully registered for " + course.getCourseName());
        }
    }



