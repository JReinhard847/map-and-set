package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private Map<String, Medication> medicationMap;

    public Pharmacy() {
        medicationMap = new HashMap<>();
    }

    public void save(Medication medication) {
        medicationMap.put(medication.getName(), medication);
    }

    public int getCount() {
        return medicationMap.size();
    }

    public Medication find(String name) {
        return medicationMap.get(name);
    }

    public void delete(String name) {
        medicationMap.remove(name);
    }

    public void printMedications() {
        System.out.println(medicationMap.values());
    }
}
