package edu.com.cinemark.common.util;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

import org.apache.commons.collections4.CollectionUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;


public class TotalUtil {

    private TotalUtil() {
    }    

    public static String getDateFormat(Date date, String exp) {
	SimpleDateFormat sdf = new SimpleDateFormat(exp);
	return sdf.format(date);
    }

    public static Date ParseFecha(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    }

}
