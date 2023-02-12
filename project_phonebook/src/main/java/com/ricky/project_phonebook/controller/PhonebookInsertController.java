package com.ricky.project_phonebook.controller;

import com.ricky.project_phonebook.model.PhoneBookRequest;
import com.ricky.project_phonebook.model.PhoneBookResponse;
import com.ricky.project_phonebook.service.PhonebookDeleteService;
import com.ricky.project_phonebook.service.PhonebookInsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("phonebookController")
public class PhonebookInsertController {

    @Autowired
    PhonebookInsertService phonebookInsertService;

    @RequestMapping(value = "/insert/person", method = RequestMethod.POST, produces = "application/json")
    public PhoneBookResponse generateResponse(PhoneBookRequest request) {
        return phonebookInsertService.buildResponse(request);
    }
}
