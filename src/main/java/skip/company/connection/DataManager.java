package skip.company.connection;

import skip.company.data.*;

import java.sql.*;

public class DataManager extends MySQLTable{
    public static DataManager instance;

    public static DataManager getInstance(){
        return instance == null ? new DataManager() : instance;
    }

    private DataManager() {
        getData();
    }

    public void getData() {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            Class.forName( "com.mysql.jdbc.Driver" );
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_detector", "root", "***");
            stmt = con.createStatement();
            System.out.println("hello from program");
            String[] tablesName = new String[]{"bus_info", "route", "route_stop_stations", "stop_stations", "time_table"};

            for (int i = 0; i < tablesName.length; i++) {
                rs = stmt.executeQuery("SELECT * FROM " + tablesName[i]);
                takeDataFromResultSet(i, rs);
                rs.close();
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println("Error: " + ex.getMessage());
            }
        }
    }

    private void takeDataFromResultSet(int tableOfNumber, ResultSet rs){
        try {
            while (rs.next()){
                switch (tableOfNumber){
                    case 0:{
                        busInfo.add(new BusInfo(
                                rs.getInt(1), rs.getString(2), rs.getString(3),
                                rs.getString(4), rs.getString(5)
                        ));
                        break;
                    }
                    case 1:{
                        routes.add(new Route(
                                rs.getInt(1), rs.getInt(2), rs.getString(3),
                                rs.getString(4), rs.getString(5)
                        ));
                        break;
                    }
                    case 2:{
                        routeStopStations.add(new RouteStopStutions(
                                rs.getInt(1), rs.getInt(2), rs.getInt(3)
                        ));
                        break;
                    }
                    case 3:{
                        stopStations.add(new StopStations(
                                rs.getInt(1), rs.getString(2), rs.getString(3)
                        ));
                        break;
                    }
                    case 4:{
                        timeTables.add(new TimeTable(
                                rs.getInt(1), rs.getInt(2), rs.getObject(3),
                                rs.getTime(4), rs.getTime(5)
                        ));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
