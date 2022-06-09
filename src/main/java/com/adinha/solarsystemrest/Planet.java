package com.adinha.solarsystemrest;

public class Planet {
    private final String name;
    private final String rotationSpeed;
    private final String distanceFromEarth;
    private final int satelites;
    private final String surfaceArea;
    private final String rotationPeriod;
    private final String imageUrl;

    public Planet(String name, String rotationSpeed, String distanceFromEarth, int satelites, String surfaceArea,
                  String rotationPeriod, String imageUrl){
        this.name = name;
        this.rotationSpeed = rotationSpeed;
        this.distanceFromEarth = distanceFromEarth;
        this.satelites = satelites;
        this.surfaceArea = surfaceArea;
        this.rotationPeriod = rotationPeriod;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getRotationSpeed() {
        return rotationSpeed;
    }

    public String getDistanceFromEarth() {
        return distanceFromEarth;
    }

    public int getSatelites() {
        return satelites;
    }

    public String getSurfaceArea() {
        return surfaceArea;
    }

    public String getRotationPeriod() {
        return rotationPeriod;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
