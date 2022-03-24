package ru.skypro;

public class Bicycle extends WheeledTransport {
    public String modelName;
    public int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
