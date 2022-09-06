package ru.czl.lpo.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.czl.lpo.entity.InfoDistrict;
import ru.czl.lpo.entity.InfoLocality;
import ru.czl.lpo.utils.HibernateUtil;

import java.util.List;

public class InfoDistrictDaoImplTest {

    public InfoDistrict findById (Integer Id) {
        return HibernateUtil.getSessionFactory().openSession().get(InfoDistrict.class,Id);
    }

    public void save(InfoDistrict infoDistrict) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(infoDistrict);
        tx1.commit();
        session.close();

    }

    public void update(InfoDistrict infoDistrict) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(infoDistrict);
        tx1.commit();
        session.close();
    }

    public void delete(InfoDistrict infoDistrict) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(infoDistrict);
        tx1.commit();
        session.close();
    }

    public InfoLocality findInfoLocalityById(Integer id) {
        return HibernateUtil.getSessionFactory().openSession().get(InfoLocality.class,id);
    }

    public List<InfoDistrict> findAll() {
        List<InfoDistrict> infoDistricts = (List<InfoDistrict>) HibernateUtil.getSessionFactory().openSession().createQuery("From InfoDistrict").list();
        return infoDistricts;
    }




}
