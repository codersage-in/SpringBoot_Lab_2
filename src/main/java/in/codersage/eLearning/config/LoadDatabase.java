package in.codersage.eLearning.config;

import in.codersage.eLearning.entity.Course;
import in.codersage.eLearning.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(CourseRepository courseRepository){
        return args -> {
            log.info("Preloading " + courseRepository.save(new Course("Spring Boot", "Learn about creating MVC web application using Spring Boot", new Date())));
            log.info("Preloading " + courseRepository.save(new Course("Java Programming", "Learn about creating OO program", new Date())));
        };
    }
}
