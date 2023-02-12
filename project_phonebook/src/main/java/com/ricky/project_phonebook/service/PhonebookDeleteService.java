package com.ricky.project_phonebook.service;

import com.ricky.project_phonebook.model.PhoneBookRequest;
import com.ricky.project_phonebook.model.PhoneBookResponse;
import com.ricky.project_phonebook.repository.PhonebookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("phonebookDeleteService")
public class PhonebookDeleteService {
    @Autowired
    PhonebookDao dao;

    public PhoneBookResponse buildResponse(PhoneBookRequest request) {
        PhoneBookResponse response = new PhoneBookResponse();
        try {
            dao.deletePerson(request.getPhone());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        response.setMessage("Success");
        return response;
    }

}
