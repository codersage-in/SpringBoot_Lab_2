package in.codersage.eLearning.error;

public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException(Long id) {
        super("Course not found. Id = " + id);
    }
}
