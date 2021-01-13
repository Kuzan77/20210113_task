package com.bh.test;

import java.util.Calendar;

/*
 * Calendar:它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等
    日历字段之间的转换提供了一些方法，
	并为操作日历字段（例如获得下星期的日期）提供了一些方法。
 *
 * public int get(int field):返回给定日历字段的值。
    日历类中的每个日历字段都是静态的成员变量，并且是int类型。
 */
public class CalendarDemo {
    public static void main(String[] args) {
//        // 其日历字段已由当前日期和时间初始化：
//        Calendar rightNow = Calendar.getInstance(); // 子类对象
//
//        // 获取年
//        int year = rightNow.get(Calendar.YEAR);
//        // 获取月
//        int month = rightNow.get(Calendar.MONTH);
//        // 获取日
//        int date = rightNow.get(Calendar.DATE);
//
//        System.out.println(year + "年" + (month + 1) + "月" + date + "日");

        /*
        * public void add(int field,int amount):
          根据给定的日历字段和对应的时间，来对当前的日历进行操作。
        * public final void set(int year,int month,int date):
          设置当前日历的年月日
        */
        Calendar calendar = Calendar.getInstance();
        // 获取年
        int year = calendar.get(Calendar.YEAR);
        // 获取月
        int month = calendar.get(Calendar.MONTH);
        // 获取日
        int date = calendar.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");

        // 三年前的今天
        calendar.add(Calendar.YEAR, -3);
        // 获取年
        year = calendar.get(Calendar.YEAR);
        // 获取月
        month = calendar.get(Calendar.MONTH);
        // 获取日
        date = calendar.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");

        // 5年后的10天前
        calendar.add(Calendar.YEAR, 5);
        calendar.add(Calendar.DATE, -10);
        // 获取年
        year = calendar.get(Calendar.YEAR);
        // 获取月
        month = calendar.get(Calendar.MONTH);
        // 获取日
        date = calendar.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");

        // 设置当前年月日
        calendar.set(2019, 11, 11);
        // 获取年
        year = calendar.get(Calendar.YEAR);
        // 获取月
        month = calendar.get(Calendar.MONTH);
        // 获取日
        date = calendar.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");
    }
}
