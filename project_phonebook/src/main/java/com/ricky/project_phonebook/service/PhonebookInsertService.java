package com.ricky.project_phonebook.service;

import com.ricky.project_phonebook.model.PhoneBookRequest;
import com.ricky.project_phonebook.model.PhoneBookResponse;
import com.ricky.project_phonebook.repository.PhonebookDao;
import com.ricky.project_phonebook.util.PhonebookUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("phonebookInsertService")
public class PhonebookInsertService {
    @Autowired
    PhonebookDao dao;
    @Autowired
    PhonebookUtil phonebookUtil;

    public PhoneBookResponse buildResponse(PhoneBookRequest request) {
        PhoneBookResponse response = new PhoneBookResponse();
        try {
            dao.insertPerson(phonebookUtil.generatePerson(request));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        response.setMessage("Success");
        return response;
    }

}
