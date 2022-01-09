package com.practice.tavant;

public class VehicleInsurance extends BaseInsurance {
   private Double depreciationvalue;

    public VehicleInsurance(Integer id, Integer policyDurattion, double premiumvalue, Double depreciationvalue) {
        super(id, policyDurattion, premiumvalue);
        this.depreciationvalue = depreciationvalue;
    }

    public Double getDepreciationvalue() {
        return depreciationvalue;
    }

    public void setDepreciationvalue(Double depreciationvalue) {
        this.depreciationvalue = depreciationvalue;
    }
}
