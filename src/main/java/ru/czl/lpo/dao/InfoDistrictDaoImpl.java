package ru.czl.lpo.dao;

import ru.czl.lpo.entity.InfoDistrict;
import ru.czl.lpo.entity.InfoLocality;
import ru.czl.lpo.utils.HibernateUtil;

import java.util.List;
import java.util.Optional;

public class InfoDistrictDaoImpl implements InfoDistrictDao{
    @Override
    public Optional<InfoDistrict> findById(Integer id) {
        return HibernateUtil.getSessionFactory().openSession().get(InfoDistrict.class,id);
                //.get(InfoDistrict.class,Id);
    }

    @Override
    public Optional findInfoLocalityById(Integer Id) {
        return HibernateUtil.getSessionFactory().openSession().get(InfoLocality.class,<Integer> Id);
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public void save(Object o) {

    }

    @Override
    public void update(Object o) {

    }

    @Override
    public void delete(Object o) {

    }
}
