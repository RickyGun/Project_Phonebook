package com.ricky.project_phonebook.controller;

import com.ricky.project_phonebook.model.PhoneBookRequest;
import com.ricky.project_phonebook.model.PhoneBookResponse;
import com.ricky.project_phonebook.service.PhonebookUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("phonebookController")
public class PhonebookUpdateController {

    @Autowired
    PhonebookUpdateService phonebookUpdateService;

    @RequestMapping(value = "/update/person", method = RequestMethod.POST, produces = "application/json")
    public PhoneBookResponse generateResponse(PhoneBookRequest request) {
        return phonebookUpdateService.buildResponse(request);
    }
}
