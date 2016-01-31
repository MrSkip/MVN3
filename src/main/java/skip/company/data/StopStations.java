package skip.company.data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StopStations {
    int id;
    StringProperty  stationName = new SimpleStringProperty(),
                    coordinate = new SimpleStringProperty();

    public StopStations(int id, String stationName, String coordinate){
        setId(id);
        setCoordinate(coordinate);
        setStationName(stationName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName.get();
    }

    public StringProperty stationNameProperty() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName.set(stationName);
    }

    public String getCoordinate() {
        return coordinate.get();
    }

    public StringProperty coordinateProperty() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate.set(coordinate);
    }
}
