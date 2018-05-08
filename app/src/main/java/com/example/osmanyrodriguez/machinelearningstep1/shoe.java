package com.example.osmanyrodriguez.machinelearningstep1;

public class shoe {

    private String name;
    private String brand;
    private String url;

    public shoe(String name, String brand, String url) {
        this.name = name;
        this.brand = brand;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
