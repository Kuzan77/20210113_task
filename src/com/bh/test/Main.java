package com.bh.test;

public class Main {

    public static void main(String[] args) {
        short i = 90;
        // i = i + 1  类型不匹配：不能从 int 转换为 short
        i = (short) (i + 1);
        // +=会进行自动类型转换
        i += 1;
        System.out.println(i);
    }
}
