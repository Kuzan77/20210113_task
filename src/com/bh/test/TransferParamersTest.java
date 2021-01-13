package com.bh.test;

/**
 * 方法之间传递参数
 * 值
 * 需求：交换两个数的值  num1 = 100; num2 = 90 ==>
 * 定义功能
 */
public class TransferParamersTest {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 90;
        exchange(number1, number2);
        System.out.println("交换后的值: number1="+number1+" number2="+number2+"");
    }

    public static void exchange(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("交换后的值: num1="+num1+" num2="+num2+"");
    }
}
