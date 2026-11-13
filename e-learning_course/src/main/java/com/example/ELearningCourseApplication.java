package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ELearningCourseApplication {

	public static void main(String[] args) {
ApplicationContext context =		SpringApplication.run(ELearningCourseApplication.class, args);
	

  CourseService cs = context.getBean(CourseService.class);
 

  cs.enrollCourse();
}

}
