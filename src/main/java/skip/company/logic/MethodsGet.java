package skip.company.logic;

import skip.company.data.*;

import java.util.List;

public interface MethodsGet {
    BusInfo getBusInfo(String busNumber, String machine);
    List<Route> getRoute(String busNumber, String machine);
    RouteStopStutions getRouteStopStutions();
    StopStations getStopStations();
    TimeTable getTimeTable();
}
