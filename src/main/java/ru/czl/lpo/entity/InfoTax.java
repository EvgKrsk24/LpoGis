package ru.czl.lpo.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "info_tax", schema = "public", catalog = "LpoGis")
public class InfoTax {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Object id;
    @Basic
    @Column(name = "locality_id", nullable = false)
    private Object localityId;
    @Basic
    @Column(name = "section", nullable = false, length = -1)
    private String section;
    @Basic
    @Column(name = "forest_purpose_id", nullable = true)
    private Integer forestPurposeId;
    @Basic
    @Column(name = "protection_category_id", nullable = true)
    private Integer protectionCategoryId;
    @Basic
    @Column(name = "ozu_id", nullable = true)
    private Integer ozuId;
    @Basic
    @Column(name = "oopt_id", nullable = true)
    private Integer ooptId;
    @Basic
    @Column(name = "is_water_protection_zone", nullable = true)
    private Boolean isWaterProtectionZone;
    @Basic
    @Column(name = "tenant", nullable = true, length = -1)
    private String tenant;
    @Basic
    @Column(name = "lease_contract_num", nullable = true, length = -1)
    private String leaseContractNum;
    @Basic
    @Column(name = "lease_contract_date", nullable = true)
    private Date leaseContractDate;
    @Basic
    @Column(name = "lease_type_id", nullable = true)
    private Integer leaseTypeId;
    @Basic
    @Column(name = "cadastral_num", nullable = true, length = -1)
    private String cadastralNum;
    @Basic
    @Column(name = "fire_prescription", nullable = true)
    private Integer firePrescription;
    @Basic
    @Column(name = "forest_use_id", nullable = true)
    private Integer forestUseId;
    @Basic
    @Column(name = "geom", nullable = true)
    private Object geom;
    @Basic
    @Column(name = "s", nullable = true, precision = 0)
    private Double s;
    @Basic
    @Column(name = "forest_inventory_year", nullable = true)
    private Integer forestInventoryYear;
    @Basic
    @Column(name = "forest_type", nullable = true, length = -1)
    private String forestType;
    @Basic
    @Column(name = "tlu_id", nullable = true)
    private Integer tluId;
    @Basic
    @Column(name = "land_cat_id", nullable = true)
    private Integer landCatId;
    @Basic
    @Column(name = "bonitet_id", nullable = true)
    private Integer bonitetId;
    @Basic
    @Column(name = "underwood", nullable = true, length = -1)
    private String underwood;
    @Basic
    @Column(name = "is_natural", nullable = true)
    private Boolean isNatural;
    @Basic
    @Column(name = "lease_contract_type_id", nullable = true)
    private Integer leaseContractTypeId;
    @Basic
    @Column(name = "specificity_ids", nullable = true)
    private Object specificityIds;
    @Basic
    @Column(name = "forest_zone_id", nullable = true)
    private Integer forestZoneId;
    @Basic
    @Column(name = "is_artificial", nullable = true)
    private Boolean isArtificial;
    @Basic
    @Column(name = "planting_year", nullable = true)
    private Integer plantingYear;
    @Basic
    @Column(name = "is_after_tapping", nullable = true)
    private Boolean isAfterTapping;
    @Basic
    @Column(name = "tab_zone_id", nullable = true)
    private Integer tabZoneId;
    @Basic
    @Column(name = "tlu", nullable = true, length = -1)
    private String tlu;
    @Basic
    @Column(name = "is_drained", nullable = true)
    private Boolean isDrained;
    @Basic
    @Column(name = "age_group_id", nullable = true)
    private Integer ageGroupId;
    @Basic
    @Column(name = "is_fire_burned", nullable = true)
    private Boolean isFireBurned;
    @Basic
    @Column(name = "radioactive_zone_id", nullable = true)
    private Integer radioactiveZoneId;
    @Basic
    @Column(name = "stock_dead", nullable = true, precision = 0)
    private Double stockDead;
    @Basic
    @Column(name = "stock_open_stand", nullable = true, precision = 0)
    private Double stockOpenStand;
    @Basic
    @Column(name = "stock_single_tree", nullable = true, precision = 0)
    private Double stockSingleTree;
    @Basic
    @Column(name = "stock_felling_debris", nullable = true, precision = 0)
    private Double stockFellingDebris;
    @Basic
    @Column(name = "stock_liquid_debris", nullable = true, precision = 0)
    private Double stockLiquidDebris;
    @Basic
    @Column(name = "non_forest_land_id", nullable = true)
    private Integer nonForestLandId;
    @Basic
    @Column(name = "unforested_land_id", nullable = true)
    private Integer unforestedLandId;
    @Basic
    @Column(name = "is_draft", nullable = false)
    private Boolean isDraft;
    @Basic
    @Column(name = "modification_date", nullable = true)
    private Object modificationDate;
    @Basic
    @Column(name = "user_id", nullable = true)
    private Integer userId;
    @Basic
    @Column(name = "data_source_id", nullable = true)
    private Integer dataSourceId;
    @Basic
    @Column(name = "is_new_dead", nullable = true)
    private Boolean isNewDead;
    @Basic
    @Column(name = "oopt", nullable = true, length = -1)
    private String oopt;
    @Basic
    @Column(name = "ozu", nullable = true, length = -1)
    private String ozu;
    @Basic
    @Column(name = "forest_use", nullable = true, length = -1)
    private String forestUse;
    @Basic
    @Column(name = "stock_section", nullable = true, precision = 0)
    private Double stockSection;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getLocalityId() {
        return localityId;
    }

    public void setLocalityId(Object localityId) {
        this.localityId = localityId;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Integer getForestPurposeId() {
        return forestPurposeId;
    }

    public void setForestPurposeId(Integer forestPurposeId) {
        this.forestPurposeId = forestPurposeId;
    }

    public Integer getProtectionCategoryId() {
        return protectionCategoryId;
    }

    public void setProtectionCategoryId(Integer protectionCategoryId) {
        this.protectionCategoryId = protectionCategoryId;
    }

    public Integer getOzuId() {
        return ozuId;
    }

    public void setOzuId(Integer ozuId) {
        this.ozuId = ozuId;
    }

    public Integer getOoptId() {
        return ooptId;
    }

    public void setOoptId(Integer ooptId) {
        this.ooptId = ooptId;
    }

    public Boolean getWaterProtectionZone() {
        return isWaterProtectionZone;
    }

    public void setWaterProtectionZone(Boolean waterProtectionZone) {
        isWaterProtectionZone = waterProtectionZone;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getLeaseContractNum() {
        return leaseContractNum;
    }

    public void setLeaseContractNum(String leaseContractNum) {
        this.leaseContractNum = leaseContractNum;
    }

    public Date getLeaseContractDate() {
        return leaseContractDate;
    }

    public void setLeaseContractDate(Date leaseContractDate) {
        this.leaseContractDate = leaseContractDate;
    }

    public Integer getLeaseTypeId() {
        return leaseTypeId;
    }

    public void setLeaseTypeId(Integer leaseTypeId) {
        this.leaseTypeId = leaseTypeId;
    }

    public String getCadastralNum() {
        return cadastralNum;
    }

    public void setCadastralNum(String cadastralNum) {
        this.cadastralNum = cadastralNum;
    }

    public Integer getFirePrescription() {
        return firePrescription;
    }

    public void setFirePrescription(Integer firePrescription) {
        this.firePrescription = firePrescription;
    }

    public Integer getForestUseId() {
        return forestUseId;
    }

    public void setForestUseId(Integer forestUseId) {
        this.forestUseId = forestUseId;
    }

    public Object getGeom() {
        return geom;
    }

    public void setGeom(Object geom) {
        this.geom = geom;
    }

    public Double getS() {
        return s;
    }

    public void setS(Double s) {
        this.s = s;
    }

    public Integer getForestInventoryYear() {
        return forestInventoryYear;
    }

    public void setForestInventoryYear(Integer forestInventoryYear) {
        this.forestInventoryYear = forestInventoryYear;
    }

    public String getForestType() {
        return forestType;
    }

    public void setForestType(String forestType) {
        this.forestType = forestType;
    }

    public Integer getTluId() {
        return tluId;
    }

    public void setTluId(Integer tluId) {
        this.tluId = tluId;
    }

    public Integer getLandCatId() {
        return landCatId;
    }

    public void setLandCatId(Integer landCatId) {
        this.landCatId = landCatId;
    }

    public Integer getBonitetId() {
        return bonitetId;
    }

    public void setBonitetId(Integer bonitetId) {
        this.bonitetId = bonitetId;
    }

    public String getUnderwood() {
        return underwood;
    }

    public void setUnderwood(String underwood) {
        this.underwood = underwood;
    }

    public Boolean getNatural() {
        return isNatural;
    }

    public void setNatural(Boolean natural) {
        isNatural = natural;
    }

    public Integer getLeaseContractTypeId() {
        return leaseContractTypeId;
    }

    public void setLeaseContractTypeId(Integer leaseContractTypeId) {
        this.leaseContractTypeId = leaseContractTypeId;
    }

    public Object getSpecificityIds() {
        return specificityIds;
    }

    public void setSpecificityIds(Object specificityIds) {
        this.specificityIds = specificityIds;
    }

    public Integer getForestZoneId() {
        return forestZoneId;
    }

    public void setForestZoneId(Integer forestZoneId) {
        this.forestZoneId = forestZoneId;
    }

    public Boolean getArtificial() {
        return isArtificial;
    }

    public void setArtificial(Boolean artificial) {
        isArtificial = artificial;
    }

    public Integer getPlantingYear() {
        return plantingYear;
    }

    public void setPlantingYear(Integer plantingYear) {
        this.plantingYear = plantingYear;
    }

    public Boolean getAfterTapping() {
        return isAfterTapping;
    }

    public void setAfterTapping(Boolean afterTapping) {
        isAfterTapping = afterTapping;
    }

    public Integer getTabZoneId() {
        return tabZoneId;
    }

    public void setTabZoneId(Integer tabZoneId) {
        this.tabZoneId = tabZoneId;
    }

    public String getTlu() {
        return tlu;
    }

    public void setTlu(String tlu) {
        this.tlu = tlu;
    }

    public Boolean getDrained() {
        return isDrained;
    }

    public void setDrained(Boolean drained) {
        isDrained = drained;
    }

    public Integer getAgeGroupId() {
        return ageGroupId;
    }

    public void setAgeGroupId(Integer ageGroupId) {
        this.ageGroupId = ageGroupId;
    }

    public Boolean getFireBurned() {
        return isFireBurned;
    }

    public void setFireBurned(Boolean fireBurned) {
        isFireBurned = fireBurned;
    }

    public Integer getRadioactiveZoneId() {
        return radioactiveZoneId;
    }

    public void setRadioactiveZoneId(Integer radioactiveZoneId) {
        this.radioactiveZoneId = radioactiveZoneId;
    }

    public Double getStockDead() {
        return stockDead;
    }

    public void setStockDead(Double stockDead) {
        this.stockDead = stockDead;
    }

    public Double getStockOpenStand() {
        return stockOpenStand;
    }

    public void setStockOpenStand(Double stockOpenStand) {
        this.stockOpenStand = stockOpenStand;
    }

    public Double getStockSingleTree() {
        return stockSingleTree;
    }

    public void setStockSingleTree(Double stockSingleTree) {
        this.stockSingleTree = stockSingleTree;
    }

    public Double getStockFellingDebris() {
        return stockFellingDebris;
    }

    public void setStockFellingDebris(Double stockFellingDebris) {
        this.stockFellingDebris = stockFellingDebris;
    }

    public Double getStockLiquidDebris() {
        return stockLiquidDebris;
    }

    public void setStockLiquidDebris(Double stockLiquidDebris) {
        this.stockLiquidDebris = stockLiquidDebris;
    }

    public Integer getNonForestLandId() {
        return nonForestLandId;
    }

    public void setNonForestLandId(Integer nonForestLandId) {
        this.nonForestLandId = nonForestLandId;
    }

    public Integer getUnforestedLandId() {
        return unforestedLandId;
    }

    public void setUnforestedLandId(Integer unforestedLandId) {
        this.unforestedLandId = unforestedLandId;
    }

    public Boolean getDraft() {
        return isDraft;
    }

    public void setDraft(Boolean draft) {
        isDraft = draft;
    }

    public Object getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Object modificationDate) {
        this.modificationDate = modificationDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public Boolean getNewDead() {
        return isNewDead;
    }

    public void setNewDead(Boolean newDead) {
        isNewDead = newDead;
    }

    public String getOopt() {
        return oopt;
    }

    public void setOopt(String oopt) {
        this.oopt = oopt;
    }

    public String getOzu() {
        return ozu;
    }

    public void setOzu(String ozu) {
        this.ozu = ozu;
    }

    public String getForestUse() {
        return forestUse;
    }

    public void setForestUse(String forestUse) {
        this.forestUse = forestUse;
    }

    public Double getStockSection() {
        return stockSection;
    }

    public void setStockSection(Double stockSection) {
        this.stockSection = stockSection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InfoTax infoTax = (InfoTax) o;

        if (id != null ? !id.equals(infoTax.id) : infoTax.id != null) return false;
        if (localityId != null ? !localityId.equals(infoTax.localityId) : infoTax.localityId != null) return false;
        if (section != null ? !section.equals(infoTax.section) : infoTax.section != null) return false;
        if (forestPurposeId != null ? !forestPurposeId.equals(infoTax.forestPurposeId) : infoTax.forestPurposeId != null)
            return false;
        if (protectionCategoryId != null ? !protectionCategoryId.equals(infoTax.protectionCategoryId) : infoTax.protectionCategoryId != null)
            return false;
        if (ozuId != null ? !ozuId.equals(infoTax.ozuId) : infoTax.ozuId != null) return false;
        if (ooptId != null ? !ooptId.equals(infoTax.ooptId) : infoTax.ooptId != null) return false;
        if (isWaterProtectionZone != null ? !isWaterProtectionZone.equals(infoTax.isWaterProtectionZone) : infoTax.isWaterProtectionZone != null)
            return false;
        if (tenant != null ? !tenant.equals(infoTax.tenant) : infoTax.tenant != null) return false;
        if (leaseContractNum != null ? !leaseContractNum.equals(infoTax.leaseContractNum) : infoTax.leaseContractNum != null)
            return false;
        if (leaseContractDate != null ? !leaseContractDate.equals(infoTax.leaseContractDate) : infoTax.leaseContractDate != null)
            return false;
        if (leaseTypeId != null ? !leaseTypeId.equals(infoTax.leaseTypeId) : infoTax.leaseTypeId != null) return false;
        if (cadastralNum != null ? !cadastralNum.equals(infoTax.cadastralNum) : infoTax.cadastralNum != null)
            return false;
        if (firePrescription != null ? !firePrescription.equals(infoTax.firePrescription) : infoTax.firePrescription != null)
            return false;
        if (forestUseId != null ? !forestUseId.equals(infoTax.forestUseId) : infoTax.forestUseId != null) return false;
        if (geom != null ? !geom.equals(infoTax.geom) : infoTax.geom != null) return false;
        if (s != null ? !s.equals(infoTax.s) : infoTax.s != null) return false;
        if (forestInventoryYear != null ? !forestInventoryYear.equals(infoTax.forestInventoryYear) : infoTax.forestInventoryYear != null)
            return false;
        if (forestType != null ? !forestType.equals(infoTax.forestType) : infoTax.forestType != null) return false;
        if (tluId != null ? !tluId.equals(infoTax.tluId) : infoTax.tluId != null) return false;
        if (landCatId != null ? !landCatId.equals(infoTax.landCatId) : infoTax.landCatId != null) return false;
        if (bonitetId != null ? !bonitetId.equals(infoTax.bonitetId) : infoTax.bonitetId != null) return false;
        if (underwood != null ? !underwood.equals(infoTax.underwood) : infoTax.underwood != null) return false;
        if (isNatural != null ? !isNatural.equals(infoTax.isNatural) : infoTax.isNatural != null) return false;
        if (leaseContractTypeId != null ? !leaseContractTypeId.equals(infoTax.leaseContractTypeId) : infoTax.leaseContractTypeId != null)
            return false;
        if (specificityIds != null ? !specificityIds.equals(infoTax.specificityIds) : infoTax.specificityIds != null)
            return false;
        if (forestZoneId != null ? !forestZoneId.equals(infoTax.forestZoneId) : infoTax.forestZoneId != null)
            return false;
        if (isArtificial != null ? !isArtificial.equals(infoTax.isArtificial) : infoTax.isArtificial != null)
            return false;
        if (plantingYear != null ? !plantingYear.equals(infoTax.plantingYear) : infoTax.plantingYear != null)
            return false;
        if (isAfterTapping != null ? !isAfterTapping.equals(infoTax.isAfterTapping) : infoTax.isAfterTapping != null)
            return false;
        if (tabZoneId != null ? !tabZoneId.equals(infoTax.tabZoneId) : infoTax.tabZoneId != null) return false;
        if (tlu != null ? !tlu.equals(infoTax.tlu) : infoTax.tlu != null) return false;
        if (isDrained != null ? !isDrained.equals(infoTax.isDrained) : infoTax.isDrained != null) return false;
        if (ageGroupId != null ? !ageGroupId.equals(infoTax.ageGroupId) : infoTax.ageGroupId != null) return false;
        if (isFireBurned != null ? !isFireBurned.equals(infoTax.isFireBurned) : infoTax.isFireBurned != null)
            return false;
        if (radioactiveZoneId != null ? !radioactiveZoneId.equals(infoTax.radioactiveZoneId) : infoTax.radioactiveZoneId != null)
            return false;
        if (stockDead != null ? !stockDead.equals(infoTax.stockDead) : infoTax.stockDead != null) return false;
        if (stockOpenStand != null ? !stockOpenStand.equals(infoTax.stockOpenStand) : infoTax.stockOpenStand != null)
            return false;
        if (stockSingleTree != null ? !stockSingleTree.equals(infoTax.stockSingleTree) : infoTax.stockSingleTree != null)
            return false;
        if (stockFellingDebris != null ? !stockFellingDebris.equals(infoTax.stockFellingDebris) : infoTax.stockFellingDebris != null)
            return false;
        if (stockLiquidDebris != null ? !stockLiquidDebris.equals(infoTax.stockLiquidDebris) : infoTax.stockLiquidDebris != null)
            return false;
        if (nonForestLandId != null ? !nonForestLandId.equals(infoTax.nonForestLandId) : infoTax.nonForestLandId != null)
            return false;
        if (unforestedLandId != null ? !unforestedLandId.equals(infoTax.unforestedLandId) : infoTax.unforestedLandId != null)
            return false;
        if (isDraft != null ? !isDraft.equals(infoTax.isDraft) : infoTax.isDraft != null) return false;
        if (modificationDate != null ? !modificationDate.equals(infoTax.modificationDate) : infoTax.modificationDate != null)
            return false;
        if (userId != null ? !userId.equals(infoTax.userId) : infoTax.userId != null) return false;
        if (dataSourceId != null ? !dataSourceId.equals(infoTax.dataSourceId) : infoTax.dataSourceId != null)
            return false;
        if (isNewDead != null ? !isNewDead.equals(infoTax.isNewDead) : infoTax.isNewDead != null) return false;
        if (oopt != null ? !oopt.equals(infoTax.oopt) : infoTax.oopt != null) return false;
        if (ozu != null ? !ozu.equals(infoTax.ozu) : infoTax.ozu != null) return false;
        if (forestUse != null ? !forestUse.equals(infoTax.forestUse) : infoTax.forestUse != null) return false;
        if (stockSection != null ? !stockSection.equals(infoTax.stockSection) : infoTax.stockSection != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (localityId != null ? localityId.hashCode() : 0);
        result = 31 * result + (section != null ? section.hashCode() : 0);
        result = 31 * result + (forestPurposeId != null ? forestPurposeId.hashCode() : 0);
        result = 31 * result + (protectionCategoryId != null ? protectionCategoryId.hashCode() : 0);
        result = 31 * result + (ozuId != null ? ozuId.hashCode() : 0);
        result = 31 * result + (ooptId != null ? ooptId.hashCode() : 0);
        result = 31 * result + (isWaterProtectionZone != null ? isWaterProtectionZone.hashCode() : 0);
        result = 31 * result + (tenant != null ? tenant.hashCode() : 0);
        result = 31 * result + (leaseContractNum != null ? leaseContractNum.hashCode() : 0);
        result = 31 * result + (leaseContractDate != null ? leaseContractDate.hashCode() : 0);
        result = 31 * result + (leaseTypeId != null ? leaseTypeId.hashCode() : 0);
        result = 31 * result + (cadastralNum != null ? cadastralNum.hashCode() : 0);
        result = 31 * result + (firePrescription != null ? firePrescription.hashCode() : 0);
        result = 31 * result + (forestUseId != null ? forestUseId.hashCode() : 0);
        result = 31 * result + (geom != null ? geom.hashCode() : 0);
        result = 31 * result + (s != null ? s.hashCode() : 0);
        result = 31 * result + (forestInventoryYear != null ? forestInventoryYear.hashCode() : 0);
        result = 31 * result + (forestType != null ? forestType.hashCode() : 0);
        result = 31 * result + (tluId != null ? tluId.hashCode() : 0);
        result = 31 * result + (landCatId != null ? landCatId.hashCode() : 0);
        result = 31 * result + (bonitetId != null ? bonitetId.hashCode() : 0);
        result = 31 * result + (underwood != null ? underwood.hashCode() : 0);
        result = 31 * result + (isNatural != null ? isNatural.hashCode() : 0);
        result = 31 * result + (leaseContractTypeId != null ? leaseContractTypeId.hashCode() : 0);
        result = 31 * result + (specificityIds != null ? specificityIds.hashCode() : 0);
        result = 31 * result + (forestZoneId != null ? forestZoneId.hashCode() : 0);
        result = 31 * result + (isArtificial != null ? isArtificial.hashCode() : 0);
        result = 31 * result + (plantingYear != null ? plantingYear.hashCode() : 0);
        result = 31 * result + (isAfterTapping != null ? isAfterTapping.hashCode() : 0);
        result = 31 * result + (tabZoneId != null ? tabZoneId.hashCode() : 0);
        result = 31 * result + (tlu != null ? tlu.hashCode() : 0);
        result = 31 * result + (isDrained != null ? isDrained.hashCode() : 0);
        result = 31 * result + (ageGroupId != null ? ageGroupId.hashCode() : 0);
        result = 31 * result + (isFireBurned != null ? isFireBurned.hashCode() : 0);
        result = 31 * result + (radioactiveZoneId != null ? radioactiveZoneId.hashCode() : 0);
        result = 31 * result + (stockDead != null ? stockDead.hashCode() : 0);
        result = 31 * result + (stockOpenStand != null ? stockOpenStand.hashCode() : 0);
        result = 31 * result + (stockSingleTree != null ? stockSingleTree.hashCode() : 0);
        result = 31 * result + (stockFellingDebris != null ? stockFellingDebris.hashCode() : 0);
        result = 31 * result + (stockLiquidDebris != null ? stockLiquidDebris.hashCode() : 0);
        result = 31 * result + (nonForestLandId != null ? nonForestLandId.hashCode() : 0);
        result = 31 * result + (unforestedLandId != null ? unforestedLandId.hashCode() : 0);
        result = 31 * result + (isDraft != null ? isDraft.hashCode() : 0);
        result = 31 * result + (modificationDate != null ? modificationDate.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (dataSourceId != null ? dataSourceId.hashCode() : 0);
        result = 31 * result + (isNewDead != null ? isNewDead.hashCode() : 0);
        result = 31 * result + (oopt != null ? oopt.hashCode() : 0);
        result = 31 * result + (ozu != null ? ozu.hashCode() : 0);
        result = 31 * result + (forestUse != null ? forestUse.hashCode() : 0);
        result = 31 * result + (stockSection != null ? stockSection.hashCode() : 0);
        return result;
    }
}
