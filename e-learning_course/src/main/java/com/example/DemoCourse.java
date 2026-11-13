package com.example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile ("demo")
@Component 
public class DemoCourse implements CourseService {
        
        public void  enrollCourse(){
                System.out.println("demo enrollment message.");
        }
}
