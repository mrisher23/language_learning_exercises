package com.github.mrisher23.logging;

import java.util.logging.*;

public class JavaLoggingMain {
    //static loggers are common as there is no obvious benefit to a logger being an instance variable,
    // but there is a detriment that it will need initialized with each new object as an instance variable.
    private static Logger log = Logger.getLogger(JavaLoggingMain.class.getName());
    public static void main(String[] args) {
        log.entering(JavaLoggingMain.class.getName(), "main");

        log.info("This is an INFO logging message");
        log.fine("This is a FINE logging message");
        log.finer("This is a FINER logging message");
        log.finest("This is a FINEST logging message");
        log.severe("This is a SEVERE logging message");
        log.warning("This is a WARNING logging message");
        log.throwing(JavaLoggingMain.class.getName(), "main", new Exception("This is an Exception message"));

        com.example.helper.HelperUtil.printAnnoyingDebugMessages();

        log.exiting(JavaLoggingMain.class.getName(), "main");
    }
}
