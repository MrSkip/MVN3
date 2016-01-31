package skip.company.connection;

import skip.company.data.*;

import java.util.Vector;

public class MySQLTable {
    Vector<BusInfo> busInfo = new Vector<>();
    Vector<Route> routes = new Vector<>();
    Vector<RouteStopStutions> routeStopStations = new Vector<>();
    Vector<StopStations> stopStations = new Vector<>();
    Vector<TimeTable> timeTables = new Vector<>();

    public Vector<BusInfo> getBusInfo() {
        return busInfo;
    }

    public Vector<Route> getRoutes() {
        return routes;
    }

    public Vector<RouteStopStutions> getRouteStopStations() {
        return routeStopStations;
    }

    public Vector<StopStations> getStopStationses() {
        return stopStations;
    }

    public Vector<TimeTable> getTimeTables() {
        return timeTables;
    }
}
