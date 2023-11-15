package com.example;
package ElectronicDevice extend;
// TODO: make this class extend ElectronicDevice

public class Smartphone {
    private String brand;
    private String model;
    private int batteryLevel;
    // TODO: Declare the necessary attributes (brand, model, batteryLevel)

    // Constructor to initialize the Smartphone object
    public Smartphone(String brand, String model, int batteryLevel) {
        // TODO: Initialize the attributes with the provided parameters
        this.brand=brand;
        this.model=model;
        this.batteryLevel=batteryLevel;

    }

    // TODO: Implement a method to check the battery level and return a message based on the level
    // Implement the checkBattery method to return:
        // "Warning: Battery low!" if the battery level is 20% or lower.
        // "Battery level is okay: [batteryLevel]%." if the battery level is above 20%.
    
        if(this.batteryLevel>=20){
            return "Warning: Battery low!";
        }
        else{}
            return f("Battery level is okay:", batteryLevel,"%." );
        }


    // TODO: Implement necessary getters for the attributes
    private String getBrand(){
        return this.brand;
    }
    private String getModel(){
        return this.model;
    }
    private int getBatteryLevel(){
        return this.batteryLevel;
    }
    private void setBrand(String newBrand){
        this.brand=newBrand;
    }
    private void setModel(String newModel){
        this.model=newModel;
    }
    private void setbatteryLevl(int newBatteryLevel){
        this.model=newBatteryLevel;
    }

    // OPTIONALLY implement the required methods to pass the BonusTest.

}
