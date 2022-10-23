package com.talhacgdem.week2;

import com.talhacgdem.week2.Cars.Car;
import com.talhacgdem.week2.Cars.HatchBack;
import com.talhacgdem.week2.Cars.SUV;
import com.talhacgdem.week2.Cars.Sedan;
import com.talhacgdem.week2.Customer.Citizen;
import com.talhacgdem.week2.Customer.Company;
import com.talhacgdem.week2.Customer.Customer;
import com.talhacgdem.week2.Service.RentCarService;

public class Main {
    public static void main(String[] args) {
        RentCarService rentCarService = new RentCarService();

        Car hb = new HatchBack();
        hb.setAge(1);
        hb.setColor("blue");
        hb.setDailyRental(300);
        hb.setLuggageCapacity(400);


        Car sedan = new Sedan();
        sedan.setAge(1);
        sedan.setColor("red");
        sedan.setDailyRental(300);
        sedan.setMonthlyRental(9000);
        sedan.setLuggageCapacity(500);

        Car suv = new SUV();
        suv.setAge(1);
        suv.setColor("yellow");
        suv.setDailyRental(400);
        suv.setLuggageCapacity(600);
        suv.setMonthlyRental(9000);

        rentCarService.addCars(hb);
        rentCarService.addCars(sedan);
        rentCarService.addCars(suv);


        Customer citizen = new Citizen();
        citizen.setIsim("Foo");
        rentCarService.rentACar(citizen);

        Customer company = new Company();
        company.setIsim("THY");
        rentCarService.rentACar(company);



    }
}
