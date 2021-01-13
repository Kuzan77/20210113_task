package com.bh.test;

/**
 * 方法之间传递参数
 * 引用
 * 地址值--   int[] array={1,2,3}    Student s;
 * change(List list)   ArrayList arrayList
 * 需求：把数组中的元素值都加10
 */
public class TransferParamersTest2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        for (int i = 0; i < array.length; i++) {
            System.out.println("方法体内第"+(i + 1)+"元素的值是："+ array[i]);
        }

        add(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println("方法体内第"+(i + 1)+"元素的值是："+ array[i]);
        }
    }

    public static void add(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
        }
        // 输出
        for (int i = 0; i < array.length; i++) {
            System.out.println("方法体内第"+(i + 1)+"元素的值是："+ array[i]);
        }
    }
}
