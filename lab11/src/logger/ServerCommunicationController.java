package logger;

import communication.ServerMessage;
import storage.SensorData;

import java.util.Observable;
import java.util.Observer;

public class ServerCommunicationController implements Observer {
    public ServerCommunicationController() {
    }
    @Override
    public void update(Observable observable, Object o) {
        if(o instanceof SensorData) {
            int steps = ((SensorData) o).getStepsCount();
            long time = ((SensorData) o).getTimestamp();
            ServerMessage message = new ServerMessage(steps, 1, time);
        }
    }
}
