package com.cognizant.Endpoint1.Single.Movie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movie {
    private String title;
    private int minutes;
    private String genre;
    private double rating;
    private int metaScore;
    private String description;
    private int votes;
    private double gross;
    private String year;
    private List<Person> credits;

}
