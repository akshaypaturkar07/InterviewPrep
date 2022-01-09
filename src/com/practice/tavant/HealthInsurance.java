package com.practice.tavant;
public class HealthInsurance extends BaseInsurance{
    private double copay;

    public HealthInsurance(Integer id, Integer policyDurattion, double premiumvalue, double copay) {
        super(id, policyDurattion, premiumvalue);
        this.copay = copay;
    }

    public double getCopay() {
        return copay;
    }

    public void setCopay(double copay) {
        this.copay = copay;
    }
}
