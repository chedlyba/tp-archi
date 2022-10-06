import java.util.List;

public class CarComparator
{
    CarDb carsDb = null;

    public Car getBestCar()
    {
        Car bestCar = null;
        List<Car> _carsDb = carsDb.get_carDb();
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}