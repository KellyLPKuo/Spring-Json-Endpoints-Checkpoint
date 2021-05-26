package com.cognizant.Endpoint1.Single.Movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JsonController {


        private Object Movie;
//    private double movie1;
//    private double movie2;

        public MovieObject singleMovie1() {

            MovieObject movieObject1 = MovieObject.builder()
                    .title("The GoldFather")
                    .minutes(175)
                    .genre("Crime, Drama")
                    .rating(9.2)
                    .metaScore(100)
                    .description("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.")
                    .votes(1561591)
                    .gross(134.97)
                    .year("1972")
                    .credits(List.of(
                            Person.builder()
                                    .role("Director")
                                    .firstName("Francis Ford")
                                    .lastName("Copolla")
                                    .build(),
                            Person.builder()
                                    .role("Star")
                                    .firstName("Marlon")
                                    .lastName("Brando")
                                    .build(),
                            Person.builder()
                                    .role("Star")
                                    .firstName("Al")
                                    .lastName("Pacino")
                                    .build(),
                            Person.builder()
                                    .role("Star")
                                    .firstName("James")
                                    .lastName("Caan")
                                    .build(),
                            Person.builder()
                                    .role("Star")
                                    .firstName("Diane")
                                    .lastName("Keaton")
                                    .build()
                    ))
                    .build();
            return movieObject1;

        }

        @GetMapping("/movies/movie")
        public MovieObject getJSONMovie(){
            return singleMovie1();
        }

        public MovieObject singleMovie2() {

            MovieObject movieObject2 = MovieObject.builder()
                    .title("The Godfather: Part II")
                    .minutes(202)
                    .genre("Crime, Drama")
                    .rating(9)
                    .metaScore(90)
                    .description("The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.")
                    .votes(1091420)
                    .gross(57.30)
                    .year("1974")
                    .credits(List.of(
                            Person.builder()
                                    .role("Director")
                                    .firstName("Francis Ford")
                                    .lastName("Copolla")
                                    .build(),
                            Person.builder()
                                    .role("Star")
                                    .firstName("Al")
                                    .lastName("Pacino")
                                    .build(),
                            Person.builder()
                                    .role("Star")
                                    .firstName("Robert")
                                    .lastName("De Niro")
                                    .build(),
                            Person.builder()
                                    .role("Star")
                                    .firstName("Robert")
                                    .lastName("Duvall")
                                    .build(),
                            Person.builder()
                                    .role("Star")
                                    .firstName("Diane")
                                    .lastName("Keaton")
                                    .build()
                    ))
                    .build();
            return movieObject2;
        }

        //  create movie 1 and movie 2 then add it together

        @PostMapping("/movies/gross/total")
        public Calculation postJSONMovie(){
            int total;
            total = (int) singleMovie1().getGross() + (int) singleMovie2().getGross();
            System.out.println(total);
            return Calculation.builder()
                    .result(total)
                    .build();
        }


}
