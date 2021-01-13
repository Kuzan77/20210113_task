package com.bh.test;

import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

public class DateUtileTest {
    public static void main(String[] args) throws ParseException {

        // 日期 ==> 字符串
        DateUtile dateUtile = new DateUtile();
        Date date = new Date();
        String time = dateUtile.dateToString(date, "yyyy-MM-dd hh:mm:ss");
        System.out.println(time);

        // 字符串 ==> 日期
        String str = "2008-08-08 12:12:12";
        Date date2= dateUtile.stringToDate(str, "yyyy-MM-dd hh:mm:ss");
        System.out.println(date2);
    }
}
