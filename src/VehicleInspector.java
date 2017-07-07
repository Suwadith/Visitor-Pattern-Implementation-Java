/**
 * Created by Suwadith on 7/7/2017.
 */

public interface VehicleInspector {

    int visit(Car car);
    int visit(Van van);
    int visit(Motorbike motorbike);

}
