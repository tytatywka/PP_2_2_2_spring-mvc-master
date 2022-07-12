package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService{
    private  ArrayList<Car> carArrayList = new ArrayList<>();

    {
        carArrayList.add(new Car("BMW",8,"Black"));
        carArrayList.add(new Car("Porshe",911,"Blue"));
        carArrayList.add(new Car("Lada",11,"Red"));
        carArrayList.add(new Car("Volvo",3,"Green"));
        carArrayList.add(new Car("BMW",1,"Yellow"));
    }

    public List <Car> allList() {
        return carArrayList;
    }

    public List<Car> carsCount(int number) {
        if (number == 0 || number > 5) return carArrayList;
        return carArrayList.stream().limit(number).collect(Collectors.toList());
    }
}
