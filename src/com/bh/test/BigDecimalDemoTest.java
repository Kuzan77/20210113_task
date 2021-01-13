package com.bh.test;

import java.math.BigDecimal;

/*
 * 看程序写结果：
    这是因为float类型的数据存储和整数不一样导致的。它们大部分的时候，都是带有有效数字位。
 *
 * 由于在运算的时候，float类型和double很容易丢失精度，演示案例。所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal
 *
 * BigDecimal类：不可变的、任意精度的有符号十进制数,可以解决数据丢失问题。
 */
public class BigDecimalDemoTest {
    public static void main(String[] args) {
//        System.out.println(0.09 + 0.01);
//        System.out.println(1.0 - 0.32);
//        System.out.println(1.015 * 100);
//        System.out.println(1.301 / 100);
//        System.out.println(1.0 - 0.12);

        /*
         * 构造方法：
         * public BigDecimal(String val)
         *
         * public BigDecimal add(BigDecimal augend)
         * public BigDecimal subtract(BigDecimal subtrahend)
         * public BigDecimal multiply(BigDecimal multiplicand)
         * public BigDecimal divide(BigDecimal divisor)
         * public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):商，几位小数，如何舍取
         */

        // 加
        // 创建对象
        BigDecimal bigDecimal1 = new BigDecimal("0.09");
        BigDecimal bigDecimal2 = new BigDecimal("0.01");
        // 调用方法完成功能
        System.out.println(bigDecimal1.add(bigDecimal2));

        // 减
        BigDecimal bigDecimal3 = new BigDecimal("1.0");
        BigDecimal bigDecimal4 = new BigDecimal("0.32");
        System.out.println(bigDecimal3.subtract(bigDecimal4));

        // 乘
        BigDecimal bigDecimal5 = new BigDecimal("1.015");
        BigDecimal bigDecimal6 = new BigDecimal("100");
        System.out.println(bigDecimal5.multiply(bigDecimal6));

        // 除
        BigDecimal bigDecimal7 = new BigDecimal("1.301");
        BigDecimal bigDecimal8 = new BigDecimal("100");
        System.out.println(bigDecimal7.divide(bigDecimal8));
        System.out.println(bigDecimal7.divide(bigDecimal8, 3));     // 保留三位小数

    }
}
