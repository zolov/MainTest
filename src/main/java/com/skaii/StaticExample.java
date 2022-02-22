package com.skaii;

import lombok.extern.slf4j.Slf4j;

/**
 * StaticExample.
 *
 * @author Igor_Zolov
 */
public class StaticExample {
    private static final String LOG_TAG = "[PERSONAL_AREA_USER_SERVICE] ::";
    private static String url;

    static {
        url = "{host}:8080";
    }

    public static void main(String[] args) {
    }

}
