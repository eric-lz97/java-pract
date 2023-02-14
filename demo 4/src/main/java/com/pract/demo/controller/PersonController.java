package com.pract.demo.controller;

import com.pract.demo.collection.Person;
import com.pract.demo.repository.PersonRepository;
import com.pract.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
//@RequestMapping("/some")
public class PersonController {

//    @Autowired
//    private PersonService personService;
//
//        @PostMapping
//        public String save(@RequestBody Person person) {
//            return personService.save(person);
//        }

    @Autowired
    PersonRepository repo;

    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/persons")
    public List<Person> getAllPosts() {
        return repo.findAll();
    }
}

