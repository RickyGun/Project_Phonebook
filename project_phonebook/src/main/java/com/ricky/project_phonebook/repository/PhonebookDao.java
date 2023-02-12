package com.ricky.project_phonebook.repository;

import com.ricky.project_phonebook.model.Person;

import java.util.List;

public interface PhonebookDao {
    List<Person> findAll();
    List<Person> findByPhone(String hotelId);
    void insertPerson(Person person);
    void deletePerson(String phone);
    void updatePerson(Person person);
}
