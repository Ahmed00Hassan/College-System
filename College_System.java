
package college_system;


public class College_System {


    public static void main(String[] args) {
        
    University U=new University();
    U.addstudent(1);
    U.addstudent(2);
    U.addstudent(3);
    U.addstudent(4);
    U.addstudent(5);
    U.addstudent(6);
    U.addstudent(7);
    U.addstudent(8);
    U.addstudent(9);
    U.addstudent(10);
    //U.removestudent(10);
    U.addcourse(60);
    U.addcourse(70);
    U.addcourse(80);
    //U.removecourse(10);
    U.laststudent();
    U.lastcourse();
    U.enrollStudent(3, 80);
    U.enrollStudent(1, 60);
    U.enrollStudent(2, 60);
    U.enrollStudent(9, 60);
    U.enrollStudent(4, 60);
    U.enrollStudent(10,60);
    U.enrollStudent(5, 60);
    U.enrollStudent(6, 60);
    U.ListStudentinCourse(60);
    U.list_of_Courses_For_Student(1);
    U.sort_students_in_course(60);
    U.ListStudentinCourse(60);
    U.is_full_course(60);
    }
    
}
