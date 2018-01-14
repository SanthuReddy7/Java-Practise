package com.santhu;


public class PC {
    private Case thecase;
    private Monitor monitor;
    private MotherBoard motherborad;

    public PC(Case thecase, Monitor monitor, MotherBoard motherborad) {
        this.thecase = thecase;
        this.monitor = monitor;
        this.motherborad = motherborad;
    }

    public Case getThecase() {
        return thecase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherborad() {
        return motherborad;
    }
}
