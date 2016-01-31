package skip.company.data;

/**
 * Created by Mr Skip on 31.01.2016.
 */
public class RouteStopStutions {
    int id, idRoute, idStopStutions;

    public RouteStopStutions(int id, int idRoute, int idStopStations){
        setId(id);
        setIdRoute(idRoute);
        setIdStopStutions(idStopStations);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRoute() {
        return idRoute;
    }

    public void setIdRoute(int idRoute) {
        this.idRoute = idRoute;
    }

    public int getIdStopStutions() {
        return idStopStutions;
    }

    public void setIdStopStutions(int idStopStutions) {
        this.idStopStutions = idStopStutions;
    }
}
