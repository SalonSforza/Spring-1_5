package web.CarDao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {


    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("VW", "Black", 1991));
        carList.add(new Car("BMW", "RED", 1999));
        carList.add(new Car("Mustang", "Yellow", 1969));
        carList.add(new Car("Chevy", "Blue", 1978));
        carList.add(new Car("Pontiac", "White", 1992));
    }


    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> getCarsByCount(Integer a) {
        if(a==null){
            return carList;
        }
        else if(a>0 && a<carList.size()){
           return carList.stream().limit(a).toList();
        }
        return carList;
    }
}
