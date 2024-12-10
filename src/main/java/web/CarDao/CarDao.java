package web.CarDao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> getAllCars();
    public List<Car> getCarsByCount(Integer a);
}
