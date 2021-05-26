package com.cognizant.Endpoint1.Single.Movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JsonController {


    public Movie singleMovie() {
       Movie movie = Movie.builder()
                .title("The GoldFather")
                .minutes(175)
                .genre("Crime, Drama")
                .rating(9.2)
                .metaScore(100)

               .description("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.")
               .votes(1561591)
               .gross(134.97)
               .year("1972")
               .credits(List.of(Person.builder()
                       .role("Director")
                       .build(),
                       Person.builder()
                               .role("Star")
                               .build()))
//               .credits(Person[0].role("Director")))
               .credits(List.copyOf(Person[0].role("Director")))
               .credits(List.copyOf(Person[0].firstName("Francis Ford")))
               .credits(List.copyOf(Person[0].lastName("Copolla")))

               .credits(List.copyOf(Person[1].role("Star")))
               .credits(List.copyOf(Person[1].firstName("Marlon")))
               .credits(List.copyOf(Person[1].lastName("Brando")))

               .credits(List.copyOf(Person[2].role("Star")))
               .credits(List.copyOf(Person[2].firstName("Al")))
               .credits(List.copyOf(Person[2].lastName("Pacino")))

               .credits(List.copyOf(Person[3].role("Star")))
               .credits(List.copyOf(Person[3].firstName("James")))
               .credits(List.copyOf(Person[3].lastName("Caan")))

               .credits(List.copyOf(Person[4].role("Star")))
               .credits(List.copyOf(Person[4].firstName("Diane")))
               .credits(List.copyOf(Person[4].lastName("Keaton")))
               .build();
        return movie;
    }


        @GetMapping("/movies/movie")
        public Movie getJSONMovie(){
            return singleMovie();
        }

        // create movie 1 and movie 2 then add it together
//        @PostMapping("/movies/gross/total")
//        public Movie postJSONMovie(){
//         return movie1.gross + movie2.gross;
//    }



}
