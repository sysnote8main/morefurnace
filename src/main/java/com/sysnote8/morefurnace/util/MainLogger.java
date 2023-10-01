package com.sysnote8.morefurnace.util;

import com.sysnote8.morefurnace.Tags;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainLogger {
    private static final Logger ModLogger = LogManager.getLogger(Tags.modid);
    public void log(String str) {
        ModLogger.info(str);
    }
    public void error(String str) {
        ModLogger.info(str);
    }
}
