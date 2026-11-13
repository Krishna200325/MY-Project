package com.example;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Builder 
@Data
@Accessors(chain = true)
public class Company {
        private int id;
        private String name;
}
