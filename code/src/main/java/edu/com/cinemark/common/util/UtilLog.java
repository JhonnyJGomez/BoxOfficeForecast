package edu.com.cinemark.common.util;

import java.util.UUID;

public class UtilLog {

    private UtilLog() {
    }

    public static void generateTracking() {
	Thread.currentThread().setName(UUID.randomUUID().toString().replace("-", ""));
    }

    public static String getTracking() {
	return Thread.currentThread().getName();
    }
}
