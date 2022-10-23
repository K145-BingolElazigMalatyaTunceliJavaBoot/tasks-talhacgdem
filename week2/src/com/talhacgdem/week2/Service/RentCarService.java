package com.talhacgdem.week2.Service;

import com.talhacgdem.week2.Cars.Car;
import com.talhacgdem.week2.Cars.HatchBack;
import com.talhacgdem.week2.Customer.Citizen;
import com.talhacgdem.week2.Customer.Company;
import com.talhacgdem.week2.Customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class RentCarService {
    List<Car> cars = new ArrayList<>();

    public void addCars(Car car) {
        cars.add(car);
    }

    public List<Car> getCarsAll() {
        return cars;
    }

    public List<Car> getCarsForCustomerTypes(Customer customer) {
        List<Car> carResponse = new ArrayList<>();
        for (Car c : this.cars) {
            if (customer instanceof Citizen && c instanceof HatchBack) {
                carResponse.add(c);
            } else if (customer instanceof Company) {
                carResponse.add(c);
            }

        }
        return carResponse;
    }

    public void rentACar(Customer customer) {
        if (customer instanceof Citizen) {
            System.out.println("You can only rent hatchback vehicles: ");
        } else {
            System.out.println("You can rent all available vehicle types: ");
        }
        System.out.println(getCarsForCustomerTypes(customer));
    }
}
