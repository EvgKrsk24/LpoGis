package ru.czl.lpo.dao;

import ru.czl.lpo.entity.InfoDistrict;
import ru.czl.lpo.entity.InfoLocality;

import java.util.List;

public interface InfoDistrictDao {

    public InfoDistrict findById (Integer id); // поиск конктретного InfoDistrict
    public InfoLocality findInfoLocalityById(Integer id); // поиск конктреного InfoLocality

    public List<InfoDistrict> findAll(); // показать всех InfoDistrict

    void save(InfoDistrict infoDistrict);

    void update(InfoDistrict infoDistrict);

    void delete(InfoDistrict infoDistrict);
}
