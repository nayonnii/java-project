package com.example.javaproject2.week7.day2.connjdbc;

import com.example.javaproject2.week7.day2.connjdbc.model.BaseDAO;
import com.example.javaproject2.week7.day2.connjdbc.model.Person;
import com.example.javaproject2.week7.day2.connjdbc.model.PersonDAO;

import java.util.List;

public class DBMain extends BaseDAO {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        personDAO.initPerson();
        System.out.println(personDAO.insertPerson("leo"));
        System.out.println(personDAO.insertPerson("yui"));
        List<Person> personList = personDAO.findAllPerson();
        System.out.println(personList.toString());
        System.out.println(personDAO.findByNamePerson("bab"));
    }
}
