
import java.util.List;

public class CarManager {

    public String getCarsNames()
    {
        CarDb carsDb = null;

        StringBuilder sb = new StringBuilder();
        List<Car> _carsDb = carsDb.get_carDb();
        for (Car car : _carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
    
}
