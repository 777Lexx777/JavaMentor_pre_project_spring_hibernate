package hiber.dao;

import hiber.model.Cars;
import java.util.List;

public interface CarDao {

    void add(Cars cars);
    List<Cars> listCar();
}
