package com.example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile ("live")
@Component 
public class LiveCourse implements CourseService {

        @Override
        public void enrollCourse() {
                // TODO Auto-generated method stub
                System.out.println("successful student enrollment message.");
        }
        
}
