package in.codersage.eLearning.controller;

import in.codersage.eLearning.entity.Course;
import in.codersage.eLearning.error.CourseNotFoundException;
import in.codersage.eLearning.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    @GetMapping("/courses/{id}")
    public Course getCourseDetails(@PathVariable Long id){
        return courseRepository.findById(id).orElseThrow(() -> new CourseNotFoundException(id));
    }

    @PostMapping("/courses")
    public Course saveCourse(@RequestBody Course newCourse){
        return courseRepository.save(newCourse);
    }
}
