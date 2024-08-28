package org.example;

import java.util.Objects;

public class Medication {
    private String name;
    private int price;
    private boolean available;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medication that = (Medication) o;
        return price == that.price && available == that.available && Objects.equals(name, that.name);
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, available);
    }

    public Medication(String name, int price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
