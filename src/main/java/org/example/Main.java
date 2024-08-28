package org.example;

public class Main {
    public static void main(String[] args) {
        Medication medication1 = new Medication("Aspirin",3,true);
        Medication medication2 = new Medication("Ibuprofen",4,true);
        Medication medication3 = new Medication("Paracetamol",5,false);

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.save(medication1);
        pharmacy.save(medication2);
        pharmacy.printMedications();
        System.out.println(pharmacy.getCount());
        System.out.println(pharmacy.find("Aspirin"));
        pharmacy.save(medication3);
        pharmacy.delete("Ibuprofen");
        pharmacy.printMedications();
        System.out.println(pharmacy.find("a"));
    }
}