package com.ricky.project_phonebook.util;

import com.ricky.project_phonebook.model.Person;
import com.ricky.project_phonebook.model.PhoneBookRequest;
import org.springframework.stereotype.Component;

@Component
public class PhonebookUtil {

    public Person generatePerson(PhoneBookRequest req) {
        Person person = new Person();
        person.setName(req.getName());
        person.setCity(req.getCity());
        person.setPhone(req.getPhone());
        return person;
    }
}
