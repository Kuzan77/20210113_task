package com.bh.test;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/*
 * 计算你来到这个世界多少天?
 *
 * 分析：
 * 		A:键盘录入你的出生的年月日
 * 		B:把该字符串转换为一个日期
 * 		C:通过该日期得到一个毫秒值
 * 		D:获取当前时间的毫秒值
 * 		E:用D-C得到一个毫秒值
 * 		F:把E的毫秒值转换为年
 * 			/1000/60/60/24
 */
public class MyYearOldDemo {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生年月日 【格式为yyyy-MM-dd】: ");
        String birthday = sc.nextLine();
        // 获取生日当天的毫秒值
        long oldtime = DateUtile.stringToDate(birthday, "yyyy-MM-dd").getTime();
//        System.out.println(oldtime);
        // 获取当前的毫秒值
        long newtime = new Date().getTime();
//        System.out.println(newtime);

        // 最终的毫秒值
        long time = newtime - oldtime;
        // 最终天数
        long year = time/1000/60/60/24;
        System.out.println(year);
    }
}
