package logger;

import dataprocessing.StepCountStrategy;
import main.Utils;
import storage.DataRepository;
import storage.SensorData;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FilteredStepCountStrategy implements StepCountStrategy {
    private static final int MAX_DIFF_STEPS_CONSECUTIVE_RECORDS = 1000;
    private static final long TIME_FOR_MAX_DIFF = TimeUnit.SECONDS.toMillis(1);
    List<SensorData> sensorDataList;
    public FilteredStepCountStrategy(DataRepository dataRepository) {
        sensorDataList = dataRepository.getSensorDataList();
    }
    @Override
    public int getTotalSteps() {
        int suma = 0;
        SensorData prev = sensorDataList.get(0);
        if(sensorDataList.get(0).getStepsCount() > 0) suma = sensorDataList.get(0).getStepsCount();
        for(int i = 1; i < sensorDataList.size(); i++) {
            if(sensorDataList.get(i).getStepsCount() > 0) {
                if(sensorDataList.get(i).getTimestamp() - prev.getTimestamp() < TIME_FOR_MAX_DIFF && sensorDataList.get(i).getStepsCount() - prev.getStepsCount() < MAX_DIFF_STEPS_CONSECUTIVE_RECORDS) {
                    suma = suma + sensorDataList.get(i).getStepsCount();
                }
            }
            prev = sensorDataList.get(i);
        }
        return suma;
    }

    @Override
    public String getStrategyDescription() {
        return Utils.FILTERED_STRATEGY;
    }
}
