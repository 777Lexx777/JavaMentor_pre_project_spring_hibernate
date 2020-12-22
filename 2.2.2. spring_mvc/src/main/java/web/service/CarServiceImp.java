package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService{

    private static long CAR_COUNT;
    private final List<Car> cars ;
    {
        cars  = new ArrayList<>();
        cars.add(new Car(++CAR_COUNT,"Lada", "black", 2020));
        cars.add(new Car(++CAR_COUNT,"BMV", "white", 2020));
        cars.add(new Car(++CAR_COUNT,"GAZ", "yellow", 2020));
        cars.add(new Car(++CAR_COUNT,"MAZ", "red", 2020));
        cars.add(new Car(++CAR_COUNT,"KKAMAZ", "blue", 2020));
    }
    @Override
    public List<Car> getCountCars(String count) {

        int countCars = Integer.parseInt(count);
        if (countCars <=0 || countCars >= 5){ return cars.subList(0, 5);}

        return cars.subList(0 , countCars);
    }
}
