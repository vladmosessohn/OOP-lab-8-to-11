package storage;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Persists sensor data. Observable, its observers are notified when data is added it to.
 */
public class DataRepository extends Observable { // TODO make this an Observable
    public List<SensorData> getSensorDataList() {
        return sensorDataList;
    }

    public void setSensorDataList(List<SensorData> sensorDataList) {
        this.sensorDataList = sensorDataList;
    }

    List<SensorData> sensorDataList;
    public DataRepository() {
        sensorDataList = new ArrayList<SensorData>();
    }

    public void addData(SensorData dataRecord){
        // TODO
        sensorDataList.add(dataRecord);
        // store data (e.g. in a List)
        // notifiy observers
        setChanged();
        notifyObservers();
    }


    // TODO implement a method to get the stored data (needed by the strategies)
}


