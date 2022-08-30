package ru.czl.lpo.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "data_lpo", schema = "public", catalog = "LpoGis")
public class DataLpo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Object id;
    @Basic
    @Column(name = "tax_id", nullable = false)
    private Object taxId;
    @Basic
    @Column(name = "section_lp", nullable = true, length = -1)
    private String sectionLp;
    @Basic
    @Column(name = "s_lp", nullable = true, precision = 0)
    private Double sLp;
    @Basic
    @Column(name = "inspection_type_id", nullable = true)
    private Integer inspectionTypeId;
    @Basic
    @Column(name = "engineer_id", nullable = true)
    private Integer engineerId;
    @Basic
    @Column(name = "inspection_date", nullable = true)
    private Date inspectionDate;
    @Basic
    @Column(name = "stability_degree_id", nullable = true)
    private Integer stabilityDegreeId;
    @Basic
    @Column(name = "mzl_period_from", nullable = true)
    private Date mzlPeriodFrom;
    @Basic
    @Column(name = "mzl_period_to", nullable = true)
    private Date mzlPeriodTo;
    @Basic
    @Column(name = "pest_core_type_id", nullable = true)
    private Integer pestCoreTypeId;
    @Basic
    @Column(name = "pest_core_degree_id", nullable = true)
    private Integer pestCoreDegreeId;
    @Basic
    @Column(name = "pest_core_phase_id", nullable = true)
    private Integer pestCorePhaseId;
    @Basic
    @Column(name = "forecast_s_weakening", nullable = true, precision = 0)
    private Double forecastSWeakening;
    @Basic
    @Column(name = "forecast_s_shrinking", nullable = true, precision = 0)
    private Double forecastSShrinking;
    @Basic
    @Column(name = "forecast_s_pests", nullable = true, precision = 0)
    private Double forecastSPests;
    @Basic
    @Column(name = "pollution_id", nullable = true)
    private Integer pollutionId;
    @Basic
    @Column(name = "pollution_size", nullable = true, precision = 0)
    private Object pollutionSize;
    @Basic
    @Column(name = "damage_year", nullable = true)
    private Integer damageYear;
    @Basic
    @Column(name = "geom", nullable = true)
    private Object geom;
    @Basic
    @Column(name = "tax_accordance", nullable = true)
    private Boolean taxAccordance;
    @Basic
    @Column(name = "fullness_new", nullable = true, precision = 0)
    private Double fullnessNew;
    @Basic
    @Column(name = "d_avg", nullable = true)
    private Integer dAvg;
    @Basic
    @Column(name = "is_mixed", nullable = true)
    private Boolean isMixed;
    @Basic
    @Column(name = "disparity_reason_id", nullable = true)
    private Integer disparityReasonId;
    @Basic
    @Column(name = "pest_core_number", nullable = true, length = -1)
    private String pestCoreNumber;
    @Basic
    @Column(name = "forest_type_new", nullable = true, length = -1)
    private String forestTypeNew;
    @Basic
    @Column(name = "age_new", nullable = true)
    private Integer ageNew;
    @Basic
    @Column(name = "bonitet_id_new", nullable = true)
    private Integer bonitetIdNew;
    @Basic
    @Column(name = "underwood_new", nullable = true, length = -1)
    private String underwoodNew;
    @Basic
    @Column(name = "is_water_protection_zone", nullable = true)
    private Boolean isWaterProtectionZone;
    @Basic
    @Column(name = "ozu_id", nullable = true)
    private Integer ozuId;
    @Basic
    @Column(name = "oopt_id", nullable = true)
    private Integer ooptId;
    @Basic
    @Column(name = "critical_density_id", nullable = true)
    private Integer criticalDensityId;
    @Basic
    @Column(name = "age_group_id", nullable = true)
    private Integer ageGroupId;
    @Basic
    @Column(name = "deadwood_year", nullable = true)
    private Integer deadwoodYear;
    @Basic
    @Column(name = "main_damage_reason_id", nullable = true)
    private Integer mainDamageReasonId;
    @Basic
    @Column(name = "is_low_density_natural", nullable = true)
    private Boolean isLowDensityNatural;
    @Basic
    @Column(name = "decline_year_from", nullable = true)
    private Integer declineYearFrom;
    @Basic
    @Column(name = "decline_year_to", nullable = true)
    private Integer declineYearTo;
    @Basic
    @Column(name = "is_low_bonitet_natural", nullable = true)
    private Boolean isLowBonitetNatural;
    @Basic
    @Column(name = "radioactive_zone_id", nullable = true)
    private Integer radioactiveZoneId;
    @Basic
    @Column(name = "is_fire_hazard", nullable = true)
    private Boolean isFireHazard;
    @Basic
    @Column(name = "is_pest_core_hazard", nullable = true)
    private Boolean isPestCoreHazard;
    @Basic
    @Column(name = "scale", nullable = true)
    private Integer scale;
    @Basic
    @Column(name = "visual_tax_accordance", nullable = true)
    private Boolean visualTaxAccordance;
    @Basic
    @Column(name = "is_industrial_waste", nullable = true)
    private Boolean isIndustrialWaste;
    @Basic
    @Column(name = "is_household_waste", nullable = true)
    private Boolean isHouseholdWaste;
    @Basic
    @Column(name = "vegetation_period_from", nullable = true)
    private Date vegetationPeriodFrom;
    @Basic
    @Column(name = "vegetation_period_to", nullable = true)
    private Date vegetationPeriodTo;
    @Basic
    @Column(name = "nonliquid_more_90", nullable = true)
    private Boolean nonliquidMore90;
    @Basic
    @Column(name = "group_id", nullable = true)
    private Object groupId;
    @Basic
    @Column(name = "registration_date", nullable = true)
    private Timestamp registrationDate;
    @Basic
    @Column(name = "user_id", nullable = true)
    private Integer userId;
    @Basic
    @Column(name = "need_visual", nullable = false)
    private Boolean needVisual;
    @Basic
    @Column(name = "contour_id", nullable = true)
    private Object contourId;
    @Basic
    @Column(name = "is_drained", nullable = true)
    private Boolean isDrained;
    @Basic
    @Column(name = "is_after_tapping", nullable = true)
    private Boolean isAfterTapping;
    @Basic
    @Column(name = "is_artificial", nullable = true)
    private Boolean isArtificial;
    @Basic
    @Column(name = "planting_year", nullable = true)
    private Integer plantingYear;
    @Basic
    @Column(name = "is_fire_burned", nullable = true)
    private Boolean isFireBurned;
    @Basic
    @Column(name = "fire_prescription", nullable = true)
    private Integer firePrescription;
    @Basic
    @Column(name = "lease_id", nullable = true)
    private Object leaseId;
    @Basic
    @Column(name = "sketch_path", nullable = true, length = -1)
    private String sketchPath;
    @Basic
    @Column(name = "comment", nullable = true, length = -1)
    private String comment;
    @Basic
    @Column(name = "tlu_id_new", nullable = true)
    private Integer tluIdNew;
    @Basic
    @Column(name = "tlu_new", nullable = true, length = -1)
    private String tluNew;
    @Basic
    @Column(name = "s_lp_manual", nullable = true, precision = 0)
    private Double sLpManual;
    @Basic
    @Column(name = "species_tax_accordance", nullable = true)
    private Boolean speciesTaxAccordance;
    @Basic
    @Column(name = "pest_id", nullable = true)
    private Integer pestId;
    @Basic
    @Column(name = "pest_disease_phase_id", nullable = true)
    private Integer pestDiseasePhaseId;
    @Basic
    @Column(name = "pest_core_reason_id", nullable = true)
    private Integer pestCoreReasonId;
    @Basic
    @Column(name = "unforested_land_id", nullable = true)
    private Integer unforestedLandId;
    @Basic
    @Column(name = "is_more_double_loss", nullable = true)
    private Boolean isMoreDoubleLoss;
    @Basic
    @Column(name = "is_dead_seed_trees", nullable = true)
    private Boolean isDeadSeedTrees;
    @Basic
    @Column(name = "is_only_dead_felling", nullable = true)
    private Boolean isOnlyDeadFelling;
    @Basic
    @Column(name = "sketch_legend_ids", nullable = true)
    private Object sketchLegendIds;
    @Basic
    @Column(name = "is_fell_only_felling", nullable = true)
    private Boolean isFellOnlyFelling;
    @Basic
    @Column(name = "main_reason_id", nullable = true)
    private Integer mainReasonId;
    @Basic
    @Column(name = "act_id", nullable = true)
    private Object actId;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getTaxId() {
        return taxId;
    }

    public void setTaxId(Object taxId) {
        this.taxId = taxId;
    }

    public String getSectionLp() {
        return sectionLp;
    }

    public void setSectionLp(String sectionLp) {
        this.sectionLp = sectionLp;
    }

    public Double getsLp() {
        return sLp;
    }

    public void setsLp(Double sLp) {
        this.sLp = sLp;
    }

    public Integer getInspectionTypeId() {
        return inspectionTypeId;
    }

    public void setInspectionTypeId(Integer inspectionTypeId) {
        this.inspectionTypeId = inspectionTypeId;
    }

    public Integer getEngineerId() {
        return engineerId;
    }

    public void setEngineerId(Integer engineerId) {
        this.engineerId = engineerId;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public Integer getStabilityDegreeId() {
        return stabilityDegreeId;
    }

    public void setStabilityDegreeId(Integer stabilityDegreeId) {
        this.stabilityDegreeId = stabilityDegreeId;
    }

    public Date getMzlPeriodFrom() {
        return mzlPeriodFrom;
    }

    public void setMzlPeriodFrom(Date mzlPeriodFrom) {
        this.mzlPeriodFrom = mzlPeriodFrom;
    }

    public Date getMzlPeriodTo() {
        return mzlPeriodTo;
    }

    public void setMzlPeriodTo(Date mzlPeriodTo) {
        this.mzlPeriodTo = mzlPeriodTo;
    }

    public Integer getPestCoreTypeId() {
        return pestCoreTypeId;
    }

    public void setPestCoreTypeId(Integer pestCoreTypeId) {
        this.pestCoreTypeId = pestCoreTypeId;
    }

    public Integer getPestCoreDegreeId() {
        return pestCoreDegreeId;
    }

    public void setPestCoreDegreeId(Integer pestCoreDegreeId) {
        this.pestCoreDegreeId = pestCoreDegreeId;
    }

    public Integer getPestCorePhaseId() {
        return pestCorePhaseId;
    }

    public void setPestCorePhaseId(Integer pestCorePhaseId) {
        this.pestCorePhaseId = pestCorePhaseId;
    }

    public Double getForecastSWeakening() {
        return forecastSWeakening;
    }

    public void setForecastSWeakening(Double forecastSWeakening) {
        this.forecastSWeakening = forecastSWeakening;
    }

    public Double getForecastSShrinking() {
        return forecastSShrinking;
    }

    public void setForecastSShrinking(Double forecastSShrinking) {
        this.forecastSShrinking = forecastSShrinking;
    }

    public Double getForecastSPests() {
        return forecastSPests;
    }

    public void setForecastSPests(Double forecastSPests) {
        this.forecastSPests = forecastSPests;
    }

    public Integer getPollutionId() {
        return pollutionId;
    }

    public void setPollutionId(Integer pollutionId) {
        this.pollutionId = pollutionId;
    }

    public Object getPollutionSize() {
        return pollutionSize;
    }

    public void setPollutionSize(Object pollutionSize) {
        this.pollutionSize = pollutionSize;
    }

    public Integer getDamageYear() {
        return damageYear;
    }

    public void setDamageYear(Integer damageYear) {
        this.damageYear = damageYear;
    }

    public Object getGeom() {
        return geom;
    }

    public void setGeom(Object geom) {
        this.geom = geom;
    }

    public Boolean getTaxAccordance() {
        return taxAccordance;
    }

    public void setTaxAccordance(Boolean taxAccordance) {
        this.taxAccordance = taxAccordance;
    }

    public Double getFullnessNew() {
        return fullnessNew;
    }

    public void setFullnessNew(Double fullnessNew) {
        this.fullnessNew = fullnessNew;
    }

    public Integer getdAvg() {
        return dAvg;
    }

    public void setdAvg(Integer dAvg) {
        this.dAvg = dAvg;
    }

    public Boolean getMixed() {
        return isMixed;
    }

    public void setMixed(Boolean mixed) {
        isMixed = mixed;
    }

    public Integer getDisparityReasonId() {
        return disparityReasonId;
    }

    public void setDisparityReasonId(Integer disparityReasonId) {
        this.disparityReasonId = disparityReasonId;
    }

    public String getPestCoreNumber() {
        return pestCoreNumber;
    }

    public void setPestCoreNumber(String pestCoreNumber) {
        this.pestCoreNumber = pestCoreNumber;
    }

    public String getForestTypeNew() {
        return forestTypeNew;
    }

    public void setForestTypeNew(String forestTypeNew) {
        this.forestTypeNew = forestTypeNew;
    }

    public Integer getAgeNew() {
        return ageNew;
    }

    public void setAgeNew(Integer ageNew) {
        this.ageNew = ageNew;
    }

    public Integer getBonitetIdNew() {
        return bonitetIdNew;
    }

    public void setBonitetIdNew(Integer bonitetIdNew) {
        this.bonitetIdNew = bonitetIdNew;
    }

    public String getUnderwoodNew() {
        return underwoodNew;
    }

    public void setUnderwoodNew(String underwoodNew) {
        this.underwoodNew = underwoodNew;
    }

    public Boolean getWaterProtectionZone() {
        return isWaterProtectionZone;
    }

    public void setWaterProtectionZone(Boolean waterProtectionZone) {
        isWaterProtectionZone = waterProtectionZone;
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

    public Integer getCriticalDensityId() {
        return criticalDensityId;
    }

    public void setCriticalDensityId(Integer criticalDensityId) {
        this.criticalDensityId = criticalDensityId;
    }

    public Integer getAgeGroupId() {
        return ageGroupId;
    }

    public void setAgeGroupId(Integer ageGroupId) {
        this.ageGroupId = ageGroupId;
    }

    public Integer getDeadwoodYear() {
        return deadwoodYear;
    }

    public void setDeadwoodYear(Integer deadwoodYear) {
        this.deadwoodYear = deadwoodYear;
    }

    public Integer getMainDamageReasonId() {
        return mainDamageReasonId;
    }

    public void setMainDamageReasonId(Integer mainDamageReasonId) {
        this.mainDamageReasonId = mainDamageReasonId;
    }

    public Boolean getLowDensityNatural() {
        return isLowDensityNatural;
    }

    public void setLowDensityNatural(Boolean lowDensityNatural) {
        isLowDensityNatural = lowDensityNatural;
    }

    public Integer getDeclineYearFrom() {
        return declineYearFrom;
    }

    public void setDeclineYearFrom(Integer declineYearFrom) {
        this.declineYearFrom = declineYearFrom;
    }

    public Integer getDeclineYearTo() {
        return declineYearTo;
    }

    public void setDeclineYearTo(Integer declineYearTo) {
        this.declineYearTo = declineYearTo;
    }

    public Boolean getLowBonitetNatural() {
        return isLowBonitetNatural;
    }

    public void setLowBonitetNatural(Boolean lowBonitetNatural) {
        isLowBonitetNatural = lowBonitetNatural;
    }

    public Integer getRadioactiveZoneId() {
        return radioactiveZoneId;
    }

    public void setRadioactiveZoneId(Integer radioactiveZoneId) {
        this.radioactiveZoneId = radioactiveZoneId;
    }

    public Boolean getFireHazard() {
        return isFireHazard;
    }

    public void setFireHazard(Boolean fireHazard) {
        isFireHazard = fireHazard;
    }

    public Boolean getPestCoreHazard() {
        return isPestCoreHazard;
    }

    public void setPestCoreHazard(Boolean pestCoreHazard) {
        isPestCoreHazard = pestCoreHazard;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Boolean getVisualTaxAccordance() {
        return visualTaxAccordance;
    }

    public void setVisualTaxAccordance(Boolean visualTaxAccordance) {
        this.visualTaxAccordance = visualTaxAccordance;
    }

    public Boolean getIndustrialWaste() {
        return isIndustrialWaste;
    }

    public void setIndustrialWaste(Boolean industrialWaste) {
        isIndustrialWaste = industrialWaste;
    }

    public Boolean getHouseholdWaste() {
        return isHouseholdWaste;
    }

    public void setHouseholdWaste(Boolean householdWaste) {
        isHouseholdWaste = householdWaste;
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

    public Boolean getNonliquidMore90() {
        return nonliquidMore90;
    }

    public void setNonliquidMore90(Boolean nonliquidMore90) {
        this.nonliquidMore90 = nonliquidMore90;
    }

    public Object getGroupId() {
        return groupId;
    }

    public void setGroupId(Object groupId) {
        this.groupId = groupId;
    }

    public Timestamp getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getNeedVisual() {
        return needVisual;
    }

    public void setNeedVisual(Boolean needVisual) {
        this.needVisual = needVisual;
    }

    public Object getContourId() {
        return contourId;
    }

    public void setContourId(Object contourId) {
        this.contourId = contourId;
    }

    public Boolean getDrained() {
        return isDrained;
    }

    public void setDrained(Boolean drained) {
        isDrained = drained;
    }

    public Boolean getAfterTapping() {
        return isAfterTapping;
    }

    public void setAfterTapping(Boolean afterTapping) {
        isAfterTapping = afterTapping;
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

    public Boolean getFireBurned() {
        return isFireBurned;
    }

    public void setFireBurned(Boolean fireBurned) {
        isFireBurned = fireBurned;
    }

    public Integer getFirePrescription() {
        return firePrescription;
    }

    public void setFirePrescription(Integer firePrescription) {
        this.firePrescription = firePrescription;
    }

    public Object getLeaseId() {
        return leaseId;
    }

    public void setLeaseId(Object leaseId) {
        this.leaseId = leaseId;
    }

    public String getSketchPath() {
        return sketchPath;
    }

    public void setSketchPath(String sketchPath) {
        this.sketchPath = sketchPath;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getTluIdNew() {
        return tluIdNew;
    }

    public void setTluIdNew(Integer tluIdNew) {
        this.tluIdNew = tluIdNew;
    }

    public String getTluNew() {
        return tluNew;
    }

    public void setTluNew(String tluNew) {
        this.tluNew = tluNew;
    }

    public Double getsLpManual() {
        return sLpManual;
    }

    public void setsLpManual(Double sLpManual) {
        this.sLpManual = sLpManual;
    }

    public Boolean getSpeciesTaxAccordance() {
        return speciesTaxAccordance;
    }

    public void setSpeciesTaxAccordance(Boolean speciesTaxAccordance) {
        this.speciesTaxAccordance = speciesTaxAccordance;
    }

    public Integer getPestId() {
        return pestId;
    }

    public void setPestId(Integer pestId) {
        this.pestId = pestId;
    }

    public Integer getPestDiseasePhaseId() {
        return pestDiseasePhaseId;
    }

    public void setPestDiseasePhaseId(Integer pestDiseasePhaseId) {
        this.pestDiseasePhaseId = pestDiseasePhaseId;
    }

    public Integer getPestCoreReasonId() {
        return pestCoreReasonId;
    }

    public void setPestCoreReasonId(Integer pestCoreReasonId) {
        this.pestCoreReasonId = pestCoreReasonId;
    }

    public Integer getUnforestedLandId() {
        return unforestedLandId;
    }

    public void setUnforestedLandId(Integer unforestedLandId) {
        this.unforestedLandId = unforestedLandId;
    }

    public Boolean getMoreDoubleLoss() {
        return isMoreDoubleLoss;
    }

    public void setMoreDoubleLoss(Boolean moreDoubleLoss) {
        isMoreDoubleLoss = moreDoubleLoss;
    }

    public Boolean getDeadSeedTrees() {
        return isDeadSeedTrees;
    }

    public void setDeadSeedTrees(Boolean deadSeedTrees) {
        isDeadSeedTrees = deadSeedTrees;
    }

    public Boolean getOnlyDeadFelling() {
        return isOnlyDeadFelling;
    }

    public void setOnlyDeadFelling(Boolean onlyDeadFelling) {
        isOnlyDeadFelling = onlyDeadFelling;
    }

    public Object getSketchLegendIds() {
        return sketchLegendIds;
    }

    public void setSketchLegendIds(Object sketchLegendIds) {
        this.sketchLegendIds = sketchLegendIds;
    }

    public Boolean getFellOnlyFelling() {
        return isFellOnlyFelling;
    }

    public void setFellOnlyFelling(Boolean fellOnlyFelling) {
        isFellOnlyFelling = fellOnlyFelling;
    }

    public Integer getMainReasonId() {
        return mainReasonId;
    }

    public void setMainReasonId(Integer mainReasonId) {
        this.mainReasonId = mainReasonId;
    }

    public Object getActId() {
        return actId;
    }

    public void setActId(Object actId) {
        this.actId = actId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataLpo dataLpo = (DataLpo) o;

        if (id != null ? !id.equals(dataLpo.id) : dataLpo.id != null) return false;
        if (taxId != null ? !taxId.equals(dataLpo.taxId) : dataLpo.taxId != null) return false;
        if (sectionLp != null ? !sectionLp.equals(dataLpo.sectionLp) : dataLpo.sectionLp != null) return false;
        if (sLp != null ? !sLp.equals(dataLpo.sLp) : dataLpo.sLp != null) return false;
        if (inspectionTypeId != null ? !inspectionTypeId.equals(dataLpo.inspectionTypeId) : dataLpo.inspectionTypeId != null)
            return false;
        if (engineerId != null ? !engineerId.equals(dataLpo.engineerId) : dataLpo.engineerId != null) return false;
        if (inspectionDate != null ? !inspectionDate.equals(dataLpo.inspectionDate) : dataLpo.inspectionDate != null)
            return false;
        if (stabilityDegreeId != null ? !stabilityDegreeId.equals(dataLpo.stabilityDegreeId) : dataLpo.stabilityDegreeId != null)
            return false;
        if (mzlPeriodFrom != null ? !mzlPeriodFrom.equals(dataLpo.mzlPeriodFrom) : dataLpo.mzlPeriodFrom != null)
            return false;
        if (mzlPeriodTo != null ? !mzlPeriodTo.equals(dataLpo.mzlPeriodTo) : dataLpo.mzlPeriodTo != null) return false;
        if (pestCoreTypeId != null ? !pestCoreTypeId.equals(dataLpo.pestCoreTypeId) : dataLpo.pestCoreTypeId != null)
            return false;
        if (pestCoreDegreeId != null ? !pestCoreDegreeId.equals(dataLpo.pestCoreDegreeId) : dataLpo.pestCoreDegreeId != null)
            return false;
        if (pestCorePhaseId != null ? !pestCorePhaseId.equals(dataLpo.pestCorePhaseId) : dataLpo.pestCorePhaseId != null)
            return false;
        if (forecastSWeakening != null ? !forecastSWeakening.equals(dataLpo.forecastSWeakening) : dataLpo.forecastSWeakening != null)
            return false;
        if (forecastSShrinking != null ? !forecastSShrinking.equals(dataLpo.forecastSShrinking) : dataLpo.forecastSShrinking != null)
            return false;
        if (forecastSPests != null ? !forecastSPests.equals(dataLpo.forecastSPests) : dataLpo.forecastSPests != null)
            return false;
        if (pollutionId != null ? !pollutionId.equals(dataLpo.pollutionId) : dataLpo.pollutionId != null) return false;
        if (pollutionSize != null ? !pollutionSize.equals(dataLpo.pollutionSize) : dataLpo.pollutionSize != null)
            return false;
        if (damageYear != null ? !damageYear.equals(dataLpo.damageYear) : dataLpo.damageYear != null) return false;
        if (geom != null ? !geom.equals(dataLpo.geom) : dataLpo.geom != null) return false;
        if (taxAccordance != null ? !taxAccordance.equals(dataLpo.taxAccordance) : dataLpo.taxAccordance != null)
            return false;
        if (fullnessNew != null ? !fullnessNew.equals(dataLpo.fullnessNew) : dataLpo.fullnessNew != null) return false;
        if (dAvg != null ? !dAvg.equals(dataLpo.dAvg) : dataLpo.dAvg != null) return false;
        if (isMixed != null ? !isMixed.equals(dataLpo.isMixed) : dataLpo.isMixed != null) return false;
        if (disparityReasonId != null ? !disparityReasonId.equals(dataLpo.disparityReasonId) : dataLpo.disparityReasonId != null)
            return false;
        if (pestCoreNumber != null ? !pestCoreNumber.equals(dataLpo.pestCoreNumber) : dataLpo.pestCoreNumber != null)
            return false;
        if (forestTypeNew != null ? !forestTypeNew.equals(dataLpo.forestTypeNew) : dataLpo.forestTypeNew != null)
            return false;
        if (ageNew != null ? !ageNew.equals(dataLpo.ageNew) : dataLpo.ageNew != null) return false;
        if (bonitetIdNew != null ? !bonitetIdNew.equals(dataLpo.bonitetIdNew) : dataLpo.bonitetIdNew != null)
            return false;
        if (underwoodNew != null ? !underwoodNew.equals(dataLpo.underwoodNew) : dataLpo.underwoodNew != null)
            return false;
        if (isWaterProtectionZone != null ? !isWaterProtectionZone.equals(dataLpo.isWaterProtectionZone) : dataLpo.isWaterProtectionZone != null)
            return false;
        if (ozuId != null ? !ozuId.equals(dataLpo.ozuId) : dataLpo.ozuId != null) return false;
        if (ooptId != null ? !ooptId.equals(dataLpo.ooptId) : dataLpo.ooptId != null) return false;
        if (criticalDensityId != null ? !criticalDensityId.equals(dataLpo.criticalDensityId) : dataLpo.criticalDensityId != null)
            return false;
        if (ageGroupId != null ? !ageGroupId.equals(dataLpo.ageGroupId) : dataLpo.ageGroupId != null) return false;
        if (deadwoodYear != null ? !deadwoodYear.equals(dataLpo.deadwoodYear) : dataLpo.deadwoodYear != null)
            return false;
        if (mainDamageReasonId != null ? !mainDamageReasonId.equals(dataLpo.mainDamageReasonId) : dataLpo.mainDamageReasonId != null)
            return false;
        if (isLowDensityNatural != null ? !isLowDensityNatural.equals(dataLpo.isLowDensityNatural) : dataLpo.isLowDensityNatural != null)
            return false;
        if (declineYearFrom != null ? !declineYearFrom.equals(dataLpo.declineYearFrom) : dataLpo.declineYearFrom != null)
            return false;
        if (declineYearTo != null ? !declineYearTo.equals(dataLpo.declineYearTo) : dataLpo.declineYearTo != null)
            return false;
        if (isLowBonitetNatural != null ? !isLowBonitetNatural.equals(dataLpo.isLowBonitetNatural) : dataLpo.isLowBonitetNatural != null)
            return false;
        if (radioactiveZoneId != null ? !radioactiveZoneId.equals(dataLpo.radioactiveZoneId) : dataLpo.radioactiveZoneId != null)
            return false;
        if (isFireHazard != null ? !isFireHazard.equals(dataLpo.isFireHazard) : dataLpo.isFireHazard != null)
            return false;
        if (isPestCoreHazard != null ? !isPestCoreHazard.equals(dataLpo.isPestCoreHazard) : dataLpo.isPestCoreHazard != null)
            return false;
        if (scale != null ? !scale.equals(dataLpo.scale) : dataLpo.scale != null) return false;
        if (visualTaxAccordance != null ? !visualTaxAccordance.equals(dataLpo.visualTaxAccordance) : dataLpo.visualTaxAccordance != null)
            return false;
        if (isIndustrialWaste != null ? !isIndustrialWaste.equals(dataLpo.isIndustrialWaste) : dataLpo.isIndustrialWaste != null)
            return false;
        if (isHouseholdWaste != null ? !isHouseholdWaste.equals(dataLpo.isHouseholdWaste) : dataLpo.isHouseholdWaste != null)
            return false;
        if (vegetationPeriodFrom != null ? !vegetationPeriodFrom.equals(dataLpo.vegetationPeriodFrom) : dataLpo.vegetationPeriodFrom != null)
            return false;
        if (vegetationPeriodTo != null ? !vegetationPeriodTo.equals(dataLpo.vegetationPeriodTo) : dataLpo.vegetationPeriodTo != null)
            return false;
        if (nonliquidMore90 != null ? !nonliquidMore90.equals(dataLpo.nonliquidMore90) : dataLpo.nonliquidMore90 != null)
            return false;
        if (groupId != null ? !groupId.equals(dataLpo.groupId) : dataLpo.groupId != null) return false;
        if (registrationDate != null ? !registrationDate.equals(dataLpo.registrationDate) : dataLpo.registrationDate != null)
            return false;
        if (userId != null ? !userId.equals(dataLpo.userId) : dataLpo.userId != null) return false;
        if (needVisual != null ? !needVisual.equals(dataLpo.needVisual) : dataLpo.needVisual != null) return false;
        if (contourId != null ? !contourId.equals(dataLpo.contourId) : dataLpo.contourId != null) return false;
        if (isDrained != null ? !isDrained.equals(dataLpo.isDrained) : dataLpo.isDrained != null) return false;
        if (isAfterTapping != null ? !isAfterTapping.equals(dataLpo.isAfterTapping) : dataLpo.isAfterTapping != null)
            return false;
        if (isArtificial != null ? !isArtificial.equals(dataLpo.isArtificial) : dataLpo.isArtificial != null)
            return false;
        if (plantingYear != null ? !plantingYear.equals(dataLpo.plantingYear) : dataLpo.plantingYear != null)
            return false;
        if (isFireBurned != null ? !isFireBurned.equals(dataLpo.isFireBurned) : dataLpo.isFireBurned != null)
            return false;
        if (firePrescription != null ? !firePrescription.equals(dataLpo.firePrescription) : dataLpo.firePrescription != null)
            return false;
        if (leaseId != null ? !leaseId.equals(dataLpo.leaseId) : dataLpo.leaseId != null) return false;
        if (sketchPath != null ? !sketchPath.equals(dataLpo.sketchPath) : dataLpo.sketchPath != null) return false;
        if (comment != null ? !comment.equals(dataLpo.comment) : dataLpo.comment != null) return false;
        if (tluIdNew != null ? !tluIdNew.equals(dataLpo.tluIdNew) : dataLpo.tluIdNew != null) return false;
        if (tluNew != null ? !tluNew.equals(dataLpo.tluNew) : dataLpo.tluNew != null) return false;
        if (sLpManual != null ? !sLpManual.equals(dataLpo.sLpManual) : dataLpo.sLpManual != null) return false;
        if (speciesTaxAccordance != null ? !speciesTaxAccordance.equals(dataLpo.speciesTaxAccordance) : dataLpo.speciesTaxAccordance != null)
            return false;
        if (pestId != null ? !pestId.equals(dataLpo.pestId) : dataLpo.pestId != null) return false;
        if (pestDiseasePhaseId != null ? !pestDiseasePhaseId.equals(dataLpo.pestDiseasePhaseId) : dataLpo.pestDiseasePhaseId != null)
            return false;
        if (pestCoreReasonId != null ? !pestCoreReasonId.equals(dataLpo.pestCoreReasonId) : dataLpo.pestCoreReasonId != null)
            return false;
        if (unforestedLandId != null ? !unforestedLandId.equals(dataLpo.unforestedLandId) : dataLpo.unforestedLandId != null)
            return false;
        if (isMoreDoubleLoss != null ? !isMoreDoubleLoss.equals(dataLpo.isMoreDoubleLoss) : dataLpo.isMoreDoubleLoss != null)
            return false;
        if (isDeadSeedTrees != null ? !isDeadSeedTrees.equals(dataLpo.isDeadSeedTrees) : dataLpo.isDeadSeedTrees != null)
            return false;
        if (isOnlyDeadFelling != null ? !isOnlyDeadFelling.equals(dataLpo.isOnlyDeadFelling) : dataLpo.isOnlyDeadFelling != null)
            return false;
        if (sketchLegendIds != null ? !sketchLegendIds.equals(dataLpo.sketchLegendIds) : dataLpo.sketchLegendIds != null)
            return false;
        if (isFellOnlyFelling != null ? !isFellOnlyFelling.equals(dataLpo.isFellOnlyFelling) : dataLpo.isFellOnlyFelling != null)
            return false;
        if (mainReasonId != null ? !mainReasonId.equals(dataLpo.mainReasonId) : dataLpo.mainReasonId != null)
            return false;
        if (actId != null ? !actId.equals(dataLpo.actId) : dataLpo.actId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (taxId != null ? taxId.hashCode() : 0);
        result = 31 * result + (sectionLp != null ? sectionLp.hashCode() : 0);
        result = 31 * result + (sLp != null ? sLp.hashCode() : 0);
        result = 31 * result + (inspectionTypeId != null ? inspectionTypeId.hashCode() : 0);
        result = 31 * result + (engineerId != null ? engineerId.hashCode() : 0);
        result = 31 * result + (inspectionDate != null ? inspectionDate.hashCode() : 0);
        result = 31 * result + (stabilityDegreeId != null ? stabilityDegreeId.hashCode() : 0);
        result = 31 * result + (mzlPeriodFrom != null ? mzlPeriodFrom.hashCode() : 0);
        result = 31 * result + (mzlPeriodTo != null ? mzlPeriodTo.hashCode() : 0);
        result = 31 * result + (pestCoreTypeId != null ? pestCoreTypeId.hashCode() : 0);
        result = 31 * result + (pestCoreDegreeId != null ? pestCoreDegreeId.hashCode() : 0);
        result = 31 * result + (pestCorePhaseId != null ? pestCorePhaseId.hashCode() : 0);
        result = 31 * result + (forecastSWeakening != null ? forecastSWeakening.hashCode() : 0);
        result = 31 * result + (forecastSShrinking != null ? forecastSShrinking.hashCode() : 0);
        result = 31 * result + (forecastSPests != null ? forecastSPests.hashCode() : 0);
        result = 31 * result + (pollutionId != null ? pollutionId.hashCode() : 0);
        result = 31 * result + (pollutionSize != null ? pollutionSize.hashCode() : 0);
        result = 31 * result + (damageYear != null ? damageYear.hashCode() : 0);
        result = 31 * result + (geom != null ? geom.hashCode() : 0);
        result = 31 * result + (taxAccordance != null ? taxAccordance.hashCode() : 0);
        result = 31 * result + (fullnessNew != null ? fullnessNew.hashCode() : 0);
        result = 31 * result + (dAvg != null ? dAvg.hashCode() : 0);
        result = 31 * result + (isMixed != null ? isMixed.hashCode() : 0);
        result = 31 * result + (disparityReasonId != null ? disparityReasonId.hashCode() : 0);
        result = 31 * result + (pestCoreNumber != null ? pestCoreNumber.hashCode() : 0);
        result = 31 * result + (forestTypeNew != null ? forestTypeNew.hashCode() : 0);
        result = 31 * result + (ageNew != null ? ageNew.hashCode() : 0);
        result = 31 * result + (bonitetIdNew != null ? bonitetIdNew.hashCode() : 0);
        result = 31 * result + (underwoodNew != null ? underwoodNew.hashCode() : 0);
        result = 31 * result + (isWaterProtectionZone != null ? isWaterProtectionZone.hashCode() : 0);
        result = 31 * result + (ozuId != null ? ozuId.hashCode() : 0);
        result = 31 * result + (ooptId != null ? ooptId.hashCode() : 0);
        result = 31 * result + (criticalDensityId != null ? criticalDensityId.hashCode() : 0);
        result = 31 * result + (ageGroupId != null ? ageGroupId.hashCode() : 0);
        result = 31 * result + (deadwoodYear != null ? deadwoodYear.hashCode() : 0);
        result = 31 * result + (mainDamageReasonId != null ? mainDamageReasonId.hashCode() : 0);
        result = 31 * result + (isLowDensityNatural != null ? isLowDensityNatural.hashCode() : 0);
        result = 31 * result + (declineYearFrom != null ? declineYearFrom.hashCode() : 0);
        result = 31 * result + (declineYearTo != null ? declineYearTo.hashCode() : 0);
        result = 31 * result + (isLowBonitetNatural != null ? isLowBonitetNatural.hashCode() : 0);
        result = 31 * result + (radioactiveZoneId != null ? radioactiveZoneId.hashCode() : 0);
        result = 31 * result + (isFireHazard != null ? isFireHazard.hashCode() : 0);
        result = 31 * result + (isPestCoreHazard != null ? isPestCoreHazard.hashCode() : 0);
        result = 31 * result + (scale != null ? scale.hashCode() : 0);
        result = 31 * result + (visualTaxAccordance != null ? visualTaxAccordance.hashCode() : 0);
        result = 31 * result + (isIndustrialWaste != null ? isIndustrialWaste.hashCode() : 0);
        result = 31 * result + (isHouseholdWaste != null ? isHouseholdWaste.hashCode() : 0);
        result = 31 * result + (vegetationPeriodFrom != null ? vegetationPeriodFrom.hashCode() : 0);
        result = 31 * result + (vegetationPeriodTo != null ? vegetationPeriodTo.hashCode() : 0);
        result = 31 * result + (nonliquidMore90 != null ? nonliquidMore90.hashCode() : 0);
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (registrationDate != null ? registrationDate.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (needVisual != null ? needVisual.hashCode() : 0);
        result = 31 * result + (contourId != null ? contourId.hashCode() : 0);
        result = 31 * result + (isDrained != null ? isDrained.hashCode() : 0);
        result = 31 * result + (isAfterTapping != null ? isAfterTapping.hashCode() : 0);
        result = 31 * result + (isArtificial != null ? isArtificial.hashCode() : 0);
        result = 31 * result + (plantingYear != null ? plantingYear.hashCode() : 0);
        result = 31 * result + (isFireBurned != null ? isFireBurned.hashCode() : 0);
        result = 31 * result + (firePrescription != null ? firePrescription.hashCode() : 0);
        result = 31 * result + (leaseId != null ? leaseId.hashCode() : 0);
        result = 31 * result + (sketchPath != null ? sketchPath.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (tluIdNew != null ? tluIdNew.hashCode() : 0);
        result = 31 * result + (tluNew != null ? tluNew.hashCode() : 0);
        result = 31 * result + (sLpManual != null ? sLpManual.hashCode() : 0);
        result = 31 * result + (speciesTaxAccordance != null ? speciesTaxAccordance.hashCode() : 0);
        result = 31 * result + (pestId != null ? pestId.hashCode() : 0);
        result = 31 * result + (pestDiseasePhaseId != null ? pestDiseasePhaseId.hashCode() : 0);
        result = 31 * result + (pestCoreReasonId != null ? pestCoreReasonId.hashCode() : 0);
        result = 31 * result + (unforestedLandId != null ? unforestedLandId.hashCode() : 0);
        result = 31 * result + (isMoreDoubleLoss != null ? isMoreDoubleLoss.hashCode() : 0);
        result = 31 * result + (isDeadSeedTrees != null ? isDeadSeedTrees.hashCode() : 0);
        result = 31 * result + (isOnlyDeadFelling != null ? isOnlyDeadFelling.hashCode() : 0);
        result = 31 * result + (sketchLegendIds != null ? sketchLegendIds.hashCode() : 0);
        result = 31 * result + (isFellOnlyFelling != null ? isFellOnlyFelling.hashCode() : 0);
        result = 31 * result + (mainReasonId != null ? mainReasonId.hashCode() : 0);
        result = 31 * result + (actId != null ? actId.hashCode() : 0);
        return result;
    }
}
