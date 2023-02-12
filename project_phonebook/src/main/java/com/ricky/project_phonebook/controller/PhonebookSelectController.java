package com.ricky.project_phonebook.controller;

import com.ricky.project_phonebook.model.Person;
import com.ricky.project_phonebook.model.PhoneBookRequest;
import com.ricky.project_phonebook.service.PhonebookSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("phonebookController")
public class PhonebookSelectController {

    @Autowired
    PhonebookSelectService phonebookSelectService;

    @RequestMapping(value = "/get/person", method = RequestMethod.GET, produces = "application/json")
    public List<Person> generateResponse(PhoneBookRequest request) {
        return phonebookSelectService.buildResponse(request);
    }
}
