package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> carlist;

    {
        carlist = new ArrayList<>();
        carlist.add(new Car(12L, "BMW", 2345000.00));
        carlist.add(new Car(2L, "Opel", 342300.00));
        carlist.add(new Car(22L, "Mercedes", 13413400.00));
        carlist.add(new Car(5L, "Jiguli", 432000.00));
        carlist.add(new Car(3L, "Niva", 343400.00));

    }

    public List<Car> getCar(Integer count) {
        List<Car> resultList = new ArrayList<>();
        if (count != null && count < 5) {
            for (int i = 0; i < count; i++) {
                resultList.add(carlist.get(i));
            }
            return resultList;
        }
        return carlist;
    }
}
