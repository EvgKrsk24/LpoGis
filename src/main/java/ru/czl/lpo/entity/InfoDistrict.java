package ru.czl.lpo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "info_districts", schema = "public", catalog = "LpoGis")
public class InfoDistrict { // федеральный округ

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "name", nullable = true, length = -1)
    private String name;
 //___________________________________

    @OneToMany(mappedBy = "infoDistrict", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InfoLocality> infoLocalities;

//--------------------------------------
    public InfoDistrict() {
    }

    public InfoDistrict(String name) {
        this.name = name;
        infoLocalities = new ArrayList<>();
    }
//------------------------------------------
    public void addInfoLocality (InfoLocality infoLocality) {
        infoLocality.setInfoDistrict(this);
        infoLocalities.add(infoLocality);
    }
//-----------------------------------------------

    public void removeInfoLocality (InfoLocality infoLocality) { infoLocalities.remove(infoLocality); }

    public Integer getId() { return id; } // SetId нет тк автоинкремент

    public void setId (Integer id) {this.id=id;}

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<InfoLocality> getInfoLocalities() {return infoLocalities;}

    public void setInfoLocalities(List<InfoLocality> infoLocalities) {this.infoLocalities=infoLocalities; }

//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        InfoDistricts that = (InfoDistricts) o;
//
//        if (id != null ? !id.equals(that.id) : that.id != null) return false;
//        if (name != null ? !name.equals(that.name) : that.name != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id != null ? id.hashCode() : 0;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        return result;
//    }
}
