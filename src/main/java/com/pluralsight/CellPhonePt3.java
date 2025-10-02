package com.pluralsight;

import java.util.Scanner;

public class CellPhonePt3 {
    public static void main(String[] args) {

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the serial number?");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What model is the phone");
        String model = scanner.nextLine();
        System.out.print("Who is the carrier?");
        String carrier = scanner.nextLine();
        System.out.print("What is the phone number?");
        String phoneNumber = scanner.nextLine();
        System.out.print("Who is the owner of the phone?");
        String owner = scanner.nextLine();

        // create object from class
        CellPhonePt3_Info cellPhone3 = new CellPhonePt3_Info(serialNumber, model,carrier,phoneNumber,owner);
        cellPhone3.setSerialNumber(serialNumber);
        cellPhone3.setModel(model);
        cellPhone3.setCarrier(carrier);
        cellPhone3.setPhoneNumber(phoneNumber);
        cellPhone3.setOwner(owner);

        scanner.close();

        display(cellPhone3);
        cellPhone3.dial(cellPhone3);
    }

    public static void display(CellPhonePt3_Info phoneInfo){

        // Getter part below of cellInfo
        System.out.println("Serial Number is: " + phoneInfo.getSerialNumber());
        System.out.println("Mobile model is: " + phoneInfo.getModel());
        System.out.println("Cell phone carrier is: " + phoneInfo.getCarrier());
        System.out.println("Phone number is: " + phoneInfo.getPhoneNumber());
        System.out.println("Phone owner is: " + phoneInfo.getOwner());

    }
}
