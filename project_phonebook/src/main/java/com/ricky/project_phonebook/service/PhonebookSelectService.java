package com.ricky.project_phonebook.service;

import com.ricky.project_phonebook.model.Person;
import com.ricky.project_phonebook.model.PhoneBookRequest;
import com.ricky.project_phonebook.repository.PhonebookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service("phonebookSelectService")
public class PhonebookSelectService {
    @Autowired
    PhonebookDao dao;

    public List<Person> buildResponse(PhoneBookRequest request) {
        List<Person> response;
        if (StringUtils.hasText(request.getPhone())) {
            response = dao.findByPhone(request.getPhone());
        } else {
            response = dao.findAll();
        }
        return response;
    }

}
