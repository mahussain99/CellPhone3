package com.pluralsight;

public class CellPhonePt3_Info {
    // Attribute always private
        private int serialNumber;
        private String model;
        private String carrier;
        private String phoneNumber;
        private String owner;
//============================================

        public CellPhonePt3_Info() {
            serialNumber = 0;
            model = "";
            carrier = "";
            phoneNumber = "";
            owner = "";
        }
// Constructor
    public CellPhonePt3_Info(String model, int serialNumber, String carrier, String phoneNumber, String owner) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }
    // Instance create for with parameter and without parameter
    public CellPhonePt3_Info(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;

    }
    //Actions
    public void dial(String number){
        System.out.println( owner + "'s phone is calling " + number);
    }
    public void dial( CellPhonePt3_Info callInfo){
        System.out.println( owner + "'s phone is calling " + callInfo.getPhoneNumber());
    }
    //Overloading

    // color_String
    public void color(String color){
        System.out.println( "Phone color: " + color);

    }
}




