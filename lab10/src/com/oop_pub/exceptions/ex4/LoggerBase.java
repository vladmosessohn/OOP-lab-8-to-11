package com.oop_pub.exceptions.ex4;

import java.util.EnumSet;
import java.util.logging.Logger;

public abstract class LoggerBase {
    protected EnumSet<LogLevel> log;
    protected LoggerBase next;
    public LoggerBase(EnumSet<LogLevel> set) {
         this.log = set;
    }
    public void setNext(LoggerBase param) {
        this.next = param;
    }

    protected  abstract void writeMessage(String message);
    public void message(String message, LogLevel severity) {
        if (log.contains(severity)) {
            writeMessage(message);

        }
        if( this.next != null ){
            this.next.message(message, severity);
        }
    }

}
