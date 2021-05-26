package com.cognizant.Endpoint1.Single.Movie;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.hamcrest.Matchers.is;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(JsonController.class)
public class JsonControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testSingleMovie() throws Exception {

        RequestBuilder request = get("/movies/movie");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.Title", is("The GoldFather")))
                .andExpect(jsonPath("$.Minutes", is(175)))
                .andExpect(jsonPath("$.Genre", is( "Crime, Drama")))
                .andExpect(jsonPath("$.Rating", is(9.2)))
                .andExpect(jsonPath("$.MetaScore", is(100)))
                .andExpect(jsonPath("$.Description", is("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.")))
                .andExpect(jsonPath("$.Votes", is(1561591)))
                .andExpect(jsonPath("$.Gross", is(134.97)))
                .andExpect(jsonPath("$.Year", is("1972")))
                .andExpect(jsonPath("$.Credits.Person[0].Role", is("Director")))
                .andExpect(jsonPath("$.Credits.Person[0].FirstName", is("Francis Ford")))
                .andExpect(jsonPath("$.Credits.Person[0].LastName", is("Copolla")))

                .andExpect(jsonPath("$.Credits.Person[1].Role", is("Star")))
                .andExpect(jsonPath("$.Credits.Person[1].FirstName", is("Marlon")))
                .andExpect(jsonPath("$.Credits.Person[1].LastName", is("Brando")))

                .andExpect(jsonPath("$.Credits.Person[2].Role", is("Star")))
                .andExpect(jsonPath("$.Credits.Person[2].FirstName", is("Al")))
                .andExpect(jsonPath("$.Credits.Person[2].LastName", is("Pacino")))

                .andExpect(jsonPath("$.Credits.Person[3].Role", is("Star")))
                .andExpect(jsonPath("$.Credits.Person[3].FirstName", is("James")))
                .andExpect(jsonPath("$.Credits.Person[3].LastName", is("Caan")))

                .andExpect(jsonPath("$.Credits.Person[4].Role", is("Star")))
                .andExpect(jsonPath("$.Credits.Person[4].FirstName", is("Diane")))
                .andExpect(jsonPath("$.Credits.Person[4].LastName", is("Keaton")));
    }

    @Test
    public void testGrossTotal() throws Exception {

        RequestBuilder request = post("/movies/gross/total");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath( "$.result", is(191)));
    }
}
