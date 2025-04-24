
package college_system;

public class EnrollmentAction {
    int studentId;
    int courseId;
    boolean isEnroll; //if enroll then true  if delete then false   

    public EnrollmentAction(int studentId, int courseId, boolean isEnroll) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.isEnroll = isEnroll;
    }
}
