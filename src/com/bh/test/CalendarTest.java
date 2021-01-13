package com.bh.test;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 获取任意一年的二月有多少天
 *
 * 分析：
 * 		A:键盘录入任意的年份
 * 		B:设置日历对象的年月日
 * 			年就是A输入的数据
 * 			月是2
 * 			日是1
 * 		C:把时间往前推一天，就是2月的最后一天
 * 		D:获取这一天输出即可
 */
public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份: ");
        int year = sc.nextInt();
        Calendar calendar = Calendar.getInstance();
        // 设置年月日
        calendar.set(year, 2, 1);
        // 获取年
        int years = calendar.get(Calendar.YEAR);
        // 获取月
        int month = calendar.get(Calendar.MONTH);
        // 获取日
        int date = calendar.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");

        // 前一天
        calendar.add(Calendar.DATE, -1);
        // 获取日
        date = calendar.get(Calendar.DATE);
        System.out.println(year+"年二月共有"+date + "天");

    }
}
