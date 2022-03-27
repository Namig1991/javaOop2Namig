package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
     Car car = new Car("Car1", 4);
     Car car2 = new Car("Car2",4);

     Bicycle bicycle = new Bicycle("Bicycle", 2);
     Bicycle bicycle2 = new Bicycle("Bicycle2",2);

     Truck truck = new Truck("Truck");
     Truck truck2 = new Truck("Truck2", 8);

     Trancport[] trancport = {
             car,
             car2,
             bicycle,
             bicycle2,
             truck,
             truck2
     };
     ServiceStation station = new ServiceStation();
     for(Trancport trancport1 : trancport) {
         station.check(trancport1);
     }
    }

}
