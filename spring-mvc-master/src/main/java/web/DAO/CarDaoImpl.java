package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carsList = new ArrayList<>();

    static {
        carsList.add(new Car("Lada vesta", "blue", "2020"));
        carsList.add(new Car("Kia rio", "yellow", "2015"));
        carsList.add(new Car("BMW 5", "white", "2005"));
        carsList.add(new Car("Audi A5", "green", "2019"));
        carsList.add(new Car("Zaporogec", "pink", "1945"));

    }


    public List<Car> getCars(int count) {
        if (count == 0) {
            return carsList;
        }return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
