package com.bh.test;

import java.math.BigInteger;

/*
 * BigInteger:可超过Integer范围内的数据进行运算
 *
 * 构造方法：
 * BigInteger(String val)
 */
public class BigIntegerDemoTest {
    public static void main(String[] args) {
        // 这几个测试，是为了简单超过int范围内，Integer就不能再表示
        Integer i = new Integer(100);
        System.out.println(i);
        System.out.println(Integer.MAX_VALUE);      // 2147483647

        Integer ii = new Integer("2147483647");
        System.out.println(ii);

        // NumberFormatException
        // Integer iii = new Integer("2147483648");
        // System.out.println(iii);

        // 通过大整数来创建对象
        BigInteger iii = new BigInteger("2147483648");
        System.out.println(iii);

        /*
         * public BigInteger add(BigInteger val):加
         * public BigInteger subtract(BigInteger val):减
         * public BigInteger multiply(BigInteger val):乘
         * public BigInteger divide(BigInteger val):除
         * public BigInteger[] divideAndRemainder(BigInteger val):返回商和余数的数组
         */

        System.out.println("=================================================");

        // 创建对象
        BigInteger bi1 = new BigInteger("100");
        BigInteger bi2 = new BigInteger("50");

        // 加
        System.out.println(bi1.add(bi2));

        // 减
        System.out.println(bi1.subtract(bi2));

        // 乘
        System.out.println(bi1.multiply(bi2));

        // 除
        System.out.println(bi1.divide(bi2));

        // public BigInteger[] divideAndRemainder(BigInteger val):返回商和余数的数组
        // 创建对象
        BigInteger bi3 = new BigInteger("13");
        BigInteger bi4 = new BigInteger("3");
        BigInteger[] bigIntegers = bi3.divideAndRemainder(bi4);
        System.out.println("商: " + bigIntegers[0] +" 余数: " + bigIntegers[1]);
    }
}
