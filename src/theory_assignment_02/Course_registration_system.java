package theory_assignment_02;

public class Course_registration_system {
    public static void main(String[] args) {
                // Create Course objects
        CRS_course course1 = new CRS_course("CS101", "Introduction to Computer Science", 3);
        CRS_course course2 = new CRS_course("MATH202", "Calculus II", 4);
        CRS_course course3 = new CRS_course("ENG205", "English Literature", 3);

                // Create Student objects
        CRS_student student1 = new CRS_student("S001", "Sidra");
        CRS_student student2 = new CRS_student("S002", "Laiba");

                // Create Registration objects and register students for courses
        CRS_registration registration1 = new CRS_registration (student1, course1);
                registration1.register();
        CRS_registration  registration2 = new CRS_registration (student1, course2);
                registration2.register();
        CRS_registration  registration3 = new CRS_registration (student2, course3);
                registration3.register();

                // Display registered courses for each student
                student1.displayCourses();
                student2.displayCourses();
            }
        }



