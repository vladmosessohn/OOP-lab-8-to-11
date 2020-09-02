package logger;

import java.util.Observable;
import java.util.Observer;

public class ConsoleLogger implements Observer {
    @Override
    public void update(Observable observable, Object o) {
        System.out.println("Console Logger is added");
    }
}
