/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author TILAK PARMAR
 */
public class CarCatalog {
    
    public static ArrayList<Car> carList;
    private Date fleetUpdate;
    public CarCatalog()
    {
        this.carList = new ArrayList<Car>();
        
        Car car1 = new Car(false, "Ferrari", 2019, 1, 2, 1,"Red One", "Boston", true);
        Car car2 = new Car(true, "BMW", 2019, 2, 4, 2, "X1", "New York", true);
        Car car3 = new Car(true, "Toyota", 2018, 1, 4, 3, "T1", "Boston", true);
        Car car4 = new Car(true, "GM", 2018, 3, 4, 4, "G1", "New York", true);
        Car car5 = new Car(false, "Toyota", 2017, 1, 4, 5, "T2", "Chicago", false);
        Car car6 = new Car(true, "GM", 2017, 1, 1, 6, "G2", "Chicago", true);
        Car car7 = new Car(true, "Ferrari", 2016, 1, 4, 7, "", "Seattle", true);
        Car car8 = new Car(true, "BMW", 2016, 2, 3, 8, "X2", "Seattle", true);
        Car car9 = new Car(true, "Toyota", 2019, 1, 4, 9, "T3", "Austin", false);
        Car car10 = new Car(true, "GM", 2019, 1, 4, 10, "G3", "Austin", true);
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        
        fleetUpdate = new Date();
    }

    public static ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }

    public Date getFleetUpdate() {
        return fleetUpdate;
    }

    public void setFleetUpdate(Date fleetUpdate) {
        this.fleetUpdate = fleetUpdate;
    }
    
    
    public static Car addCar(boolean available, String brand, int manufactured_year, int min_seats, int max_seats, int serial_num, String model_num, String availble_city, boolean maintenance_certificate)
    {
        Car c = new Car(available, brand, manufactured_year, min_seats, max_seats, serial_num, model_num, availble_city, maintenance_certificate);
        carList.add(c);
        return c;
    }
    
    public static void deleteCar(Car c){
        carList.remove(c);        
    }
    
    public Car searchCarBySerialNo(int num){
        for(Car car : carList){
            if(car.getSerial_num()==num){
                return car;
            }
        }
        return null;
    }
}