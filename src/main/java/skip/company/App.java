package skip.company;

import skip.company.connection.DataManager;
import skip.company.data.BusInfo;
import skip.company.data.Route;
import skip.company.logic.LogicFactory;

import java.util.List;

public class App
{
    public static void main( String ... args )
    {
        System.out.println( "Hello World!" );

        // Singleton
        DataManager.getInstance();

        // Factories
        LogicFactory logicFactory = new LogicFactory();
        BusInfo busInfo = logicFactory.getBusInfo("34 a", "автобус");
        List<Route> routes = logicFactory.getRoute("34 a", "автобус");



    }
}