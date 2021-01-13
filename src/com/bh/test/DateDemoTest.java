package com.bh.test;

import java.util.Date;

/*
 * Date:表示特定的瞬间，精确到毫秒。
 *
 * 构造方法：
 * 		Date():根据当前的默认毫秒值创建日期对象
 * 		Date(long date)：根据给定的毫秒值创建日期对象
 */
public class DateDemoTest {
    public static void main(String[] args) {
        // 创建对象
        Date date1 = new Date();        // 获取当前时间
        System.out.println(date1);

        // 创建对象
        long time = 1000 * 60 * 60;     // 一小时          //东八区
        Date date2 = new Date(time);
        System.out.println(date2);

        System.out.println("=========================================");

        /*
         * public long getTime():获取时间，以毫秒为单位
         * public void setTime(long time):设置时间
         *
         * 从Date得到一个毫秒值
         * 		getTime()
         * 把一个毫秒值转换为Date
         * 		构造方法
         * 		setTime(long time)
         */
        // 创建对象
        Date date3 = new Date();
        // 获取时间  毫秒值
        long time2 = date3.getTime();
        System.out.println(time2);
//        System.out.println(System.currentTimeMillis());

        System.out.println(date3);
        // 设置时间
        date3.setTime(1000);
        System.out.println(date3);

        System.out.println("=========================================");


    }
}
