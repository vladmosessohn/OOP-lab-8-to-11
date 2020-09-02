package logger;

import communication.ServerMessage;
import dataprocessing.StepCountStrategy;
import storage.SensorData;

import java.util.Observable;
import java.util.Observer;

public class DataAggregator implements Observer {
    StepCountStrategy strategy;
    public DataAggregator(StepCountStrategy strategy) {
        this.strategy = strategy;
    }
    @Override
    public void update(Observable observable, Object o) {
        if(o instanceof SensorData) {
            System.out.println(strategy.getStrategyDescription() + " " + strategy.getTotalSteps());
        }
    }
}
