package skip.company.data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Route {
    int id, bus_info_id;
    StringProperty streetName = new SimpleStringProperty(),
            startCoordinate = new SimpleStringProperty(),
            endCoordinate = new SimpleStringProperty();

    public Route(int id, int bus_info_id, String streetName, String startCoordinate, String endCoordinate){
        setId(id);
        setBus_info_id(bus_info_id);
        setEndCoordinate(endCoordinate);
        setStreetName(streetName);
        setStartCoordinate(startCoordinate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBus_info_id() {
        return bus_info_id;
    }

    public void setBus_info_id(int bus_info_id) {
        this.bus_info_id = bus_info_id;
    }

    public String getStreetName() {
        return streetName.get();
    }

    public StringProperty streetNameProperty() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName.set(streetName);
    }

    public String getStartCoordinate() {
        return startCoordinate.get();
    }

    public StringProperty startCoordinateProperty() {
        return startCoordinate;
    }

    public void setStartCoordinate(String startCoordinate) {
        this.startCoordinate.set(startCoordinate);
    }

    public String getEndCoordinate() {
        return endCoordinate.get();
    }

    public StringProperty endCoordinateProperty() {
        return endCoordinate;
    }

    public void setEndCoordinate(String endCoordinate) {
        this.endCoordinate.set(endCoordinate);
    }
}
