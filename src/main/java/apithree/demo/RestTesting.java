package apithree.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RestTesting implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate  = new RestTemplate();

        ResponseEntity<List<University>> response = restTemplate.exchange(
                "http://10.51.10.111:8080/universities",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<University>>(){});
        List<University> universities = response.getBody();

        for(University university : universities){
            System.out.println(university.toString());
        }

        System.err.println("Find One(GET)--------------------------------");

        University university = restTemplate.getForObject(
                "http://10.51.10.111:8080/universities/2",
                University.class);
        System.out.println(university.toString());

        System.err.println("Creating(POST)______________________________");

        University newUniversity = new University("Chuka",
                "Meru",200);
       University createdUniversity = restTemplate.postForObject(
                "http://10.51.10.111:8080/universities",
                newUniversity, University.class);
        System.out.println(createdUniversity.toString());

        System.err.println("____________________________________");
        String createCourseUrl = "http://10.51.10.111:8080/universities/"
                +createdUniversity.getId()+"/courses";

        Course newCourse = new Course("Bsc Parting and Swimming");
        Course createdCourse = restTemplate.postForObject(
                createCourseUrl,
                newCourse, Course.class);
        System.out.println(createdCourse.toString());

    }
}
