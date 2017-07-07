/**
 * Created by Suwadith on 7/7/2017.
 */

public interface VehicleInspector {

    /* A vehicle Inspector is supposed to visit all the vehicles parked in his shop and calculate the cost
    for each one of them. */
    int visit(Car car);
    int visit(Van van);
    int visit(Motorbike motorbike);

}
