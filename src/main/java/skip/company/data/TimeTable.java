package skip.company.data;

import java.sql.Time;

public class TimeTable {
    int id, bus_info_id;
    Object day;
    Time beginWork, endWork;

    public TimeTable(int id, int bus_info_id, Object day, Time beginWork, Time endWork){
        setId(id);
        setBeginWork(beginWork);
        setBus_info_id(bus_info_id);
        setDay(day);
        setEndWork(endWork);
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

    public Object getDay() {
        return day;
    }

    public void setDay(Object day) {
        this.day = day;
    }

    public Time getBeginWork() {
        return beginWork;
    }

    public void setBeginWork(Time beginWork) {
        this.beginWork = beginWork;
    }

    public Time getEndWork() {
        return endWork;
    }

    public void setEndWork(Time endWork) {
        this.endWork = endWork;
    }
}
