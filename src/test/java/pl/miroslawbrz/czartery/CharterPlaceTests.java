package pl.miroslawbrz.czartery;


import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import pl.miroslawbrz.czartery.repository.CharterPlaceRepository;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CharterPlaceTests {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    CharterPlaceRepository charterPlaceRepository;

    @Test
    public void ifCreateCharterPlaceRequestIsCorrectShouldReturnHttpCode200AndReturnCharterPlaceId() throws Exception{

        MvcResult mvcResult = mockMvc.perform(post("/api/charterplace")
                .contentType(MediaType.APPLICATION_JSON)
                .content( "{\"charterPlaceName\": \"Płocki Klub Żeglarski\"," +
                                "\"webSiteUrl\": \"zeglarskiploc.pl\"," +
                                "\"addressStreet\": \"Bogusławskiego\"," +
                                "\"addressCity\": \"Warszawa\", " +
                                "\"addressBuildingNumber\": \"17\"," +
                                "\"userId\" : 1 }"))
                .andExpect(status().is(200))
                .andExpect(content().string(Matchers.containsString("Poprawnie dodano")))
                .andExpect(content().string(Matchers.containsString("id")))
                .andReturn();

    }

    //todo integration tests

}
