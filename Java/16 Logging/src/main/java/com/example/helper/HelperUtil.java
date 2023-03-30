package com.example.helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * This is just an example of a library provided by a third party.
 * It contains logging messages as well but maybe not ones that we care
 * about because we can't really fix other's code easily.
 */
public class HelperUtil {
    private static Logger log = LogManager.getLogger();

    public static void printAnnoyingInfoMessages() {
        for(int i =0 ; i < 5; i++) {
            log.info("processing...");
        }
    }

    public static void printAnnoyingDebugMessages() {
        for(int i =0 ; i < 15; i++) {
            log.info("I'm annoying");
        }
    }
}
