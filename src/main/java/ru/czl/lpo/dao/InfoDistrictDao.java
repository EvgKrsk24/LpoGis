package ru.czl.lpo.dao;

import java.util.List;
import java.util.Optional;

public interface InfoDistrictDao<T> {

    Optional<T> findById(Integer id); // поиск конктретного InfoDistrict
    Optional<T> findInfoLocalityById(Integer Id); // поиск конктреного InfoLocality ??? Добавлять тут ???

    List<T> findAll(); // показать всех InfoDistrict

    void save(T t);
    void update (T t);
    void delete (T t);

}
