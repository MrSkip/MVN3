package skip.company.data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class BusInfo {
    int id;
    StringProperty
            busNumber = new SimpleStringProperty(),
            driverNames = new SimpleStringProperty(),
            phoneNumber = new SimpleStringProperty(),
            machine = new SimpleStringProperty();

    public BusInfo(int id, String busNumber, String driverName, String phoneNumber, String machine){
        setId(id);
        setBusNumber(busNumber);
        setDriverNames(driverName);
        setPhoneNumber(phoneNumber);
        setMachine(machine);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBusNumber() {
        return busNumber.get();
    }

    public StringProperty busNumberProperty() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber.set(busNumber);
    }

    public String getDriverNames() {
        return driverNames.get();
    }

    public StringProperty driverNamesProperty() {
        return driverNames;
    }

    public void setDriverNames(String driverNames) {
        this.driverNames.set(driverNames);
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }

    public StringProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }

    public String getMachine() {
        return machine.get();
    }

    public StringProperty machineProperty() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine.set(machine);
    }
}
