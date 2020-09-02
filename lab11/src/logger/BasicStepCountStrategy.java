package logger;

import dataprocessing.StepCountStrategy;
import main.Utils;
import storage.DataRepository;
import storage.SensorData;

import java.util.List;

public class BasicStepCountStrategy implements StepCountStrategy {
    List<SensorData> sensorDataList;
    public BasicStepCountStrategy(DataRepository dataRepository) {
        sensorDataList = dataRepository.getSensorDataList();
    }

    @Override
    public int getTotalSteps() {
        int suma = 0;
        for(SensorData i : sensorDataList) {
            suma = suma + i.getStepsCount();
        }
        return suma;
    }

    @Override
    public String getStrategyDescription() {
        return Utils.BASIC_STRATEGY;
    }
}
