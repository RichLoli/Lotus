package com.macoloco.lotus.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static String pattern = "yyyy-MM-dd HH:ss:mm";

    private static DateFormat dateFormat = new SimpleDateFormat(pattern);

    public static String now(){
        return dateFormat.format(new Date());
    }

}
