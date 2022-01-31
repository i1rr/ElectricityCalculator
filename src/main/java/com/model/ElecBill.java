package com.model;

public class ElecBill {
    private int id;
    private String name;

    private double dailyChargePrice;
    private double offPeakPrice;
    private double peakPrice;
    private double shoulderPrice;

    private double dailyChargeUsage;
    private double offPeakUsage;
    private double peakUsage;
    private double shoulderUsage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyChargePrice() {
        return dailyChargePrice;
    }

    public void setDailyChargePrice(double dailyChargePrice) {
        this.dailyChargePrice = dailyChargePrice;
    }

    public double getOffPeakPrice() {
        return offPeakPrice;
    }

    public void setOffPeakPrice(double offPeakPrice) {
        this.offPeakPrice = offPeakPrice;
    }

    public double getPeakPrice() {
        return peakPrice;
    }

    public void setPeakPrice(double peakPrice) {
        this.peakPrice = peakPrice;
    }

    public double getShoulderPrice() {
        return shoulderPrice;
    }

    public void setShoulderPrice(double shoulderPrice) {
        this.shoulderPrice = shoulderPrice;
    }

    public double getDailyChargeUsage() {
        return dailyChargeUsage;
    }

    public void setDailyChargeUsage(double dailyChargeUsage) {
        this.dailyChargeUsage = dailyChargeUsage;
    }

    public double getOffPeakUsage() {
        return offPeakUsage;
    }

    public void setOffPeakUsage(double offPeakUsage) {
        this.offPeakUsage = offPeakUsage;
    }

    public double getPeakUsage() {
        return peakUsage;
    }

    public void setPeakUsage(double peakUsage) {
        this.peakUsage = peakUsage;
    }

    public double getShoulderUsage() {
        return shoulderUsage;
    }

    public void setShoulderUsage(double shoulderUsage) {
        this.shoulderUsage = shoulderUsage;
    }
}