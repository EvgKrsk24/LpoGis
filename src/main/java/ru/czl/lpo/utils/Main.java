package ru.czl.lpo.utils;

import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {
        // Получаем SessionFactory и создаем сессию
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.close();
        HibernateUtil.shutdown();
    }



}
