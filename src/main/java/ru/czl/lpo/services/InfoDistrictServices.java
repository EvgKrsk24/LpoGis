package ru.czl.lpo.services;

import ru.czl.lpo.dao.InfoDistrictDaoImp;
import ru.czl.lpo.entity.InfoDistrict;
import ru.czl.lpo.entity.InfoLocality;

import java.util.List;

public class InfoDistrictServices {
    private InfoDistrictDaoImp infoDistrictDaoImp = new InfoDistrictDaoImp();

    public InfoDistrictServices(){

    }

    public InfoDistrict findInfoDistrict (Integer id) {return infoDistrictDaoImp.findById(id); }

    public void saveInfoDistrict(InfoDistrict infoDistrict) { infoDistrictDaoImp.save(infoDistrict);}

    public void deleteInfodistrict(InfoDistrict infoDistrict) { infoDistrictDaoImp.delete(infoDistrict);}

    public void updateInfodistrict(InfoDistrict infoDistrict) {infoDistrictDaoImp.update(infoDistrict);}

    public List<InfoDistrict> findAllUsers() {return infoDistrictDaoImp.findAll();}

    public InfoLocality findInfoLocalityById(Integer id) {return infoDistrictDaoImp.findInfoLocalityById(id);}


}
