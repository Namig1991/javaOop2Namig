package ru.skypro;

public class Car extends MotorTransport {
    public String modelName;
    public int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
