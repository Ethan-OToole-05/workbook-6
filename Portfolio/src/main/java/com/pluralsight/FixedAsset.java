package com.pluralsight;

public abstract class FixedAsset implements Valuable{
    protected String name;
    protected double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    @Override
    public double getValue() {
        //Returns 0 as a placeholder.
        return 0;
    }
}
