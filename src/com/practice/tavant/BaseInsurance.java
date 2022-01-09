package com.practice.tavant;
public class BaseInsurance {
    private Integer id;
    private Integer policyDurattion;
    private double premiumvalue;

    public BaseInsurance(Integer id, Integer policyDurattion, double premiumvalue) {
        this.id = id;
        this.policyDurattion = policyDurattion;
        this.premiumvalue = premiumvalue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPolicyDurattion() {
        return policyDurattion;
    }

    public void setPolicyDurattion(Integer policyDurattion) {
        this.policyDurattion = policyDurattion;
    }

    public double getPremiumvalue() {
        return premiumvalue;
    }

    public void setPremiumvalue(double premiumvalue) {
        this.premiumvalue = premiumvalue;
    }
}
