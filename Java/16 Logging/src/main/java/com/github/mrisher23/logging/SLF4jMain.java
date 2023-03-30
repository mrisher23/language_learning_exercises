package com.github.mrisher23.logging;

import org.slf4j.*;

public class SLF4jMain {
    //static loggers are common as there is no obvious benefit to a logger being an instance variable,
    // but there is a detriment that it will need initialized with each new object as an instance variable.
    private static Logger log = LoggerFactory.getLogger(SLF4jMain.class.getName());

    public static void main(String[] args) {
        log.debug("This is a DEBUG message");
        log.info("This is an INFO message");
        log.warn("This is a WARN message");
        log.error("This is a non-fatal ERROR message");
        log.trace("This is a TRACE message");
        com.example.helper.HelperUtil.printAnnoyingDebugMessages();
    }
}
