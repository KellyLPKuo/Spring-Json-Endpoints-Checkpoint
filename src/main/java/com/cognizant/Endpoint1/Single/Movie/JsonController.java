package com.cognizant.Endpoint1.Single.Movie;

import lombok.Builder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Builder
public class JsonController {


    private Object Movie;
    private double total;
//    private double movie1;
//    private double movie2;

    public Movie singleMovie1() {

       Movie movie1 = Movie.builder()
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
               ));
        return movie1;

    }

    @GetMapping("/movies/movie")
        public Movie getJSONMovie(){
            return singleMovie();
        }

    public Movie singleMovie2() {

        Movie movie2 = Movie.builder()
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
            ));
        return movie2;
}

       //  create movie 1 and movie 2 then add it together

        @PostMapping("/movies/gross/total")
        public Movie postJSONMovie(){
            total = singleMovie1().movie1.gross + singleMovie2().movie2.gross;
            System.out.println(total);
            return String.valueOf(total);
    }



}
