package org.example.dao;

import org.example.entity.City;
import org.example.entity.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Timestamp;
import java.util.List;

public class CityDao {
    private final SessionFactory sessionFactory;

    public CityDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public City get(int id) {
        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
        City city = session.get(City.class, id);
        city.setUpdate(new Timestamp(System.currentTimeMillis()));
//        transaction.commit();
        session.close();
        return city;
    }
}
