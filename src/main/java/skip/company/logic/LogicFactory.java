package skip.company.logic;

import skip.company.connection.DataManager;
import skip.company.data.*;

import java.util.ArrayList;
import java.util.List;

public class LogicFactory implements MethodsGet{

    @Override
    public BusInfo getBusInfo(String busNumber, String machine) {
        for (BusInfo busInfo : DataManager.getInstance().getBusInfo()) {
            if (busInfo.getBusNumber().equals(busNumber) && busInfo.getMachine().equals(machine))
                return busInfo;
        }
        return null;
    }

    @Override
    public List<Route> getRoute(String busNumber, String machine) {
        List<Route> list = new ArrayList<>();
        for (BusInfo busInfo : DataManager.getInstance().getBusInfo()) {
            if (busInfo.getBusNumber().equals(busNumber) && busInfo.getMachine().equals(machine)){
                List<Route> routes = DataManager.getInstance().getRoutes();
                for (Route route : routes) {
                    if (route.getBus_info_id() == busInfo.getId())
                        list.add(route);
                }
                break;
            }
        }
        return list;
    }

    @Override
    public RouteStopStutions getRouteStopStutions() {
        return null;
    }

    @Override
    public StopStations getStopStations() {
        return null;
    }

    @Override
    public TimeTable getTimeTable() {
        return null;
    }
}
