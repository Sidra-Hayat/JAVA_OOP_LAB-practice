package theory_assignment_02;

public class CRS_course {
        private String courseId;
        private String courseName;
        private int creditHours;

        public CRS_course(String courseId, String courseName, int creditHours) {
            this.courseId = courseId;
            this.courseName = courseName;
            this.creditHours = creditHours;
        }
        public String getCourseInfo() {
            return "Course ID: " + courseId + ", Name: " + courseName + ", Credit Hours: " + creditHours;
        }

        public String getCourseName() {
            return courseName;
        }

        public String getCourseId() {
            return courseId;
        }

        public int getCreditHours() {
            return creditHours;
        }
    }


