package com.bh.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date	 --	 String(格式化)
 * 		public final String format(Date date)
 *
 * String -- Date(解析)
 * 		public Date parse(String source)
 *
 * DateForamt:可以进行日期和字符串的格式化和解析，
       但是由于是抽象类，所以使用具体子类SimpleDateFormat。
 *
 * SimpleDateFormat的构造方法：
 * 		SimpleDateFormat():默认模式
 * 		SimpleDateFormat(String pattern):给定的模式
 * 			这个模式字符串该如何写呢?
 * 			通过查看API，我们就找到了对应的模式
 * 			年 y
 * 			月 M
 * 			日 d
 * 			时 H
 * 			分 m
 * 			秒 s
 *
 * 			2019年12月12日 12:12:12
 */
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        // 创建Date对象
        Date d = new Date();
        // 创建格式化对象
        // SimpleDateFormat sdf = new SimpleDateFormat();
        // 给定模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //格式化
        String time = sdf.format(d);
        System.out.println(time);

        //String -- Date  将字符串类型解析成日期类型
        String str = "2008-08-08 12:12:12";
        //在把一个字符串解析为日期的时候，请注意格式必须和给定的字符串格式匹配
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = sdf2.parse(str);
        System.out.println(date);
    }
}
