package com.github.mrisher23.logging;

import org.apache.logging.log4j.*;

public class Log4jMain {

    //static loggers are common as there is no obvious benefit to a logger being an instance variable,
    // but there is a detriment that it will need initialized with each new object as an instance variable.
    private static Logger log = LogManager.getLogger();

    public static void main(String[] args) {
        log.trace("Starting Log4jMain.main");

        log.debug("This is a DEBUG message");
        log.info("This is an INFO message");
        log.warn("This is a WARN message");
        log.error("This is a non-fatal ERROR message");
        log.fatal("This is a FATAL message");

        com.example.helper.HelperUtil.printAnnoyingInfoMessages();

        log.trace("Exiting Log4jMain.main");
    }
}