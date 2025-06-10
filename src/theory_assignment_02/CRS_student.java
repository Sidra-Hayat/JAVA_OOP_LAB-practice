package theory_assignment_02;
import java.util.ArrayList;
import java.util.List;
public class CRS_student {

        private String studentId;
        private String name;
        private List<CRS_course> registeredCourses;
        public CRS_student (String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
            this.registeredCourses = new ArrayList<>();
        }
        public void registerCourse(CRS_course course) {

            registeredCourses.add(course);
        }
        public void displayCourses() {
            System.out.println("Courses registered by " + name + ":");
            for (CRS_course course : registeredCourses) {
                System.out.println(course.getCourseInfo());
            }
        }
        public String getName() {
            return name;
        }
        public String getStudentId() {
            return studentId;
        }
    }


