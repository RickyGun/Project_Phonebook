package com.ricky.project_phonebook.repository;

import com.ricky.project_phonebook.model.Person;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("phonebookDaoImpl")
public class PhonebookDaoImpl extends AbstractDao<String, Person> implements PhonebookDao {

    @Override
    public List<Person> findAll() {
        Criteria criteria = getSession().createCriteria(Person.class);
        return  (List<Person>) criteria.list();
    }

    @Override
    public List<Person> findByPhone(String phone) {
        Criteria criteria = getSession().createCriteria(Person.class);
        criteria.add(Restrictions.eq("phone", phone));
        return (List<Person>) criteria.list();
    }

    @Override
    public void insertPerson(Person person) {
        try {
             persist(person);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void deletePerson(String phone){
        Query query = getSession().createSQLQuery("DELETE FROM PHONEBOOK WHERE PHONE = :phone");
        query.setString("phone", phone);
        query.executeUpdate();
    }

    @Override
    public void updatePerson(Person person){
        Query query = getSession().createSQLQuery("UPDATE PHONEBOOK SET NAME = :name, CITY = :city WHERE PHONE = :phone");
        query.setString("name", person.getName());
        query.setString("city", person.getCity());
        query.setString("phone", person.getPhone());
        query.executeUpdate();
    }
}
