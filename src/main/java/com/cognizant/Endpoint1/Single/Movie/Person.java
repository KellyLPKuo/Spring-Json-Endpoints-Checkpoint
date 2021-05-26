package com.cognizant.Endpoint1.Single.Movie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    private String role;
    private String firstName;
    private String lastName;

}
