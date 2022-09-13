package web.dao;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(12L, "BMW", 2345000.00));
        carList.add(new Car(2L, "Opel", 342300.00));
        carList.add(new Car(22L, "Mercedes", 13413400.00));
        carList.add(new Car(5L, "Jiguli", 432000.00));
        carList.add(new Car(3L, "Niva", 343400.00));
    }

    public List<Car> getLimitCars(Integer count) {
        return carList.stream().limit(count).toList();
    }
    public List<Car> getAllCars() {
        return carList;
    }
}
