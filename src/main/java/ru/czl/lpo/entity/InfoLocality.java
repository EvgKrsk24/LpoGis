package ru.czl.lpo.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "info_locality", schema = "public", catalog = "LpoGis")
public class InfoLocality {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Basic
    @Column(name = "parent_ids", nullable = true)
    private UUID parentIds;

//    @Basic
//    @Column(name = "fo_id", nullable = true)
//    private Integer foId; сопоставление ниже

    @Basic
    @Column(name = "region_id", nullable = true)
    private Integer regionId;

    @Basic
    @Column(name = "forestry_id", nullable = true)
    private Integer forestryId;

    @Basic
    @Column(name = "localforestry_id", nullable = true)
    private Integer localforestryId;

    @Basic
    @Column(name = "subforestry_id", nullable = true)
    private Integer subforestryId;
    @Basic
    @Column(name = "area", nullable = false, length = -1)
    private String area;
    @Basic
    @Column(name = "order_id", nullable = true)
    private Integer orderId;
    @Basic
    @Column(name = "geom", nullable = true)
    private Object geom;
    @Basic
    @Column(name = "vegetation_period_from", nullable = true)
    private Date vegetationPeriodFrom;
    @Basic
    @Column(name = "vegetation_period_to", nullable = true)
    private Date vegetationPeriodTo;
    @Basic
    @Column(name = "forest_zone_id", nullable = true)
    private Integer forestZoneId;
    @Basic
    @Column(name = "fh_danger_zone_id", nullable = true)
    private Integer fhDangerZoneId;
    @Basic
    @Column(name = "forest_zone_ids", nullable = true)
    private Object forestZoneIds;
    @Basic
    @Column(name = "is_old_row", nullable = true)
    private Boolean isOldRow;
    @Basic
    @Column(name = "tab_zone_ids", nullable = true)
    private Integer tabZoneIds;
    @Basic
    @Column(name = "relevance_date_from", nullable = true)
    private Date relevanceDateFrom;
    @Basic
    @Column(name = "relevance_date_to", nullable = true)
    private Date relevanceDateTo;
    @Basic
    @Column(name = "update_date", nullable = true)
    private Date updateDate;

//------------------------------------------------------------
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fo_id")
    private InfoDistrict infoDistrict;
//------------------------------------------------

    public InfoLocality() {
    }

    public InfoLocality(String area) {
        this.area=area;
    }

//------------------------------------------------

    public InfoDistrict getInfoDistrict () {return  infoDistrict;}
    public void setInfoDistrict (InfoDistrict infoDistrict) {this.infoDistrict=infoDistrict;}

//----------------------------------
    public Object getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getParentIds() {
        return parentIds;
    }

    public void setParentIds(UUID parentIds) {
        this.parentIds = parentIds;
    }

//    public Integer getFoId() {
//        return foId;
//    }
//
//    public void setFoId(Integer foId) {
//        this.foId = foId;
//    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getForestryId() {
        return forestryId;
    }

    public void setForestryId(Integer forestryId) {
        this.forestryId = forestryId;
    }

    public Integer getLocalforestryId() {
        return localforestryId;
    }

    public void setLocalforestryId(Integer localforestryId) {
        this.localforestryId = localforestryId;
    }

    public Integer getSubforestryId() {
        return subforestryId;
    }

    public void setSubforestryId(Integer subforestryId) {
        this.subforestryId = subforestryId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Object getGeom() {
        return geom;
    }

    public void setGeom(Object geom) {
        this.geom = geom;
    }

    public Date getVegetationPeriodFrom() {
        return vegetationPeriodFrom;
    }

    public void setVegetationPeriodFrom(Date vegetationPeriodFrom) {
        this.vegetationPeriodFrom = vegetationPeriodFrom;
    }

    public Date getVegetationPeriodTo() {
        return vegetationPeriodTo;
    }

    public void setVegetationPeriodTo(Date vegetationPeriodTo) {
        this.vegetationPeriodTo = vegetationPeriodTo;
    }

    public Integer getForestZoneId() {
        return forestZoneId;
    }

    public void setForestZoneId(Integer forestZoneId) {
        this.forestZoneId = forestZoneId;
    }

    public Integer getFhDangerZoneId() {
        return fhDangerZoneId;
    }

    public void setFhDangerZoneId(Integer fhDangerZoneId) {
        this.fhDangerZoneId = fhDangerZoneId;
    }

    public Object getForestZoneIds() {
        return forestZoneIds;
    }

    public void setForestZoneIds(Object forestZoneIds) {
        this.forestZoneIds = forestZoneIds;
    }

    public Boolean getOldRow() {
        return isOldRow;
    }

    public void setOldRow(Boolean oldRow) {
        isOldRow = oldRow;
    }

    public Integer getTabZoneIds() {
        return tabZoneIds;
    }

    public void setTabZoneIds(Integer tabZoneIds) {
        this.tabZoneIds = tabZoneIds;
    }

    public Date getRelevanceDateFrom() {
        return relevanceDateFrom;
    }

    public void setRelevanceDateFrom(Date relevanceDateFrom) {
        this.relevanceDateFrom = relevanceDateFrom;
    }

    public Date getRelevanceDateTo() {
        return relevanceDateTo;
    }

    public void setRelevanceDateTo(Date relevanceDateTo) {
        this.relevanceDateTo = relevanceDateTo;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InfoLocality that = (InfoLocality) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (parentIds != null ? !parentIds.equals(that.parentIds) : that.parentIds != null) return false;
//        if (foId != null ? !foId.equals(that.foId) : that.foId != null) return false;
        if (regionId != null ? !regionId.equals(that.regionId) : that.regionId != null) return false;
        if (forestryId != null ? !forestryId.equals(that.forestryId) : that.forestryId != null) return false;
        if (localforestryId != null ? !localforestryId.equals(that.localforestryId) : that.localforestryId != null)
            return false;
        if (subforestryId != null ? !subforestryId.equals(that.subforestryId) : that.subforestryId != null)
            return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (geom != null ? !geom.equals(that.geom) : that.geom != null) return false;
        if (vegetationPeriodFrom != null ? !vegetationPeriodFrom.equals(that.vegetationPeriodFrom) : that.vegetationPeriodFrom != null)
            return false;
        if (vegetationPeriodTo != null ? !vegetationPeriodTo.equals(that.vegetationPeriodTo) : that.vegetationPeriodTo != null)
            return false;
        if (forestZoneId != null ? !forestZoneId.equals(that.forestZoneId) : that.forestZoneId != null) return false;
        if (fhDangerZoneId != null ? !fhDangerZoneId.equals(that.fhDangerZoneId) : that.fhDangerZoneId != null)
            return false;
        if (forestZoneIds != null ? !forestZoneIds.equals(that.forestZoneIds) : that.forestZoneIds != null)
            return false;
        if (isOldRow != null ? !isOldRow.equals(that.isOldRow) : that.isOldRow != null) return false;
        if (tabZoneIds != null ? !tabZoneIds.equals(that.tabZoneIds) : that.tabZoneIds != null) return false;
        if (relevanceDateFrom != null ? !relevanceDateFrom.equals(that.relevanceDateFrom) : that.relevanceDateFrom != null)
            return false;
        if (relevanceDateTo != null ? !relevanceDateTo.equals(that.relevanceDateTo) : that.relevanceDateTo != null)
            return false;
        if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (parentIds != null ? parentIds.hashCode() : 0);
//        result = 31 * result + (foId != null ? foId.hashCode() : 0);
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        result = 31 * result + (forestryId != null ? forestryId.hashCode() : 0);
        result = 31 * result + (localforestryId != null ? localforestryId.hashCode() : 0);
        result = 31 * result + (subforestryId != null ? subforestryId.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (geom != null ? geom.hashCode() : 0);
        result = 31 * result + (vegetationPeriodFrom != null ? vegetationPeriodFrom.hashCode() : 0);
        result = 31 * result + (vegetationPeriodTo != null ? vegetationPeriodTo.hashCode() : 0);
        result = 31 * result + (forestZoneId != null ? forestZoneId.hashCode() : 0);
        result = 31 * result + (fhDangerZoneId != null ? fhDangerZoneId.hashCode() : 0);
        result = 31 * result + (forestZoneIds != null ? forestZoneIds.hashCode() : 0);
        result = 31 * result + (isOldRow != null ? isOldRow.hashCode() : 0);
        result = 31 * result + (tabZoneIds != null ? tabZoneIds.hashCode() : 0);
        result = 31 * result + (relevanceDateFrom != null ? relevanceDateFrom.hashCode() : 0);
        result = 31 * result + (relevanceDateTo != null ? relevanceDateTo.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        return result;
    }
}
