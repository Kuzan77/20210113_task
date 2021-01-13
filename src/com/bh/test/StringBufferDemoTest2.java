package com.bh.test;
/*
 * 把数组拼接成一个字符串
 */
public class StringBufferDemoTest2 {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = {44, 33, 55, 11, 22 };
        // 定义功能
        // 方式1：用String做拼接的方式
        String s = arrayToString1(arr);
        System.out.println(s);

        // 方式2:用StringBuffer做拼接的方式
        String s2 = arrayToString2(arr);
        System.out.println(s2);
    }
    // 用String做拼接的方式
    public static String arrayToString1(int[] arr) {
        String str = "";
        str += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i];
//                str += "]";
            }else {
                str += arr[i];
                str += ",";
            }
        }
        str += "]";
        return str;
    }
    // 用StringBuffer做拼接的方式
    public static String arrayToString2(int[] arr) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]);
                sb.append(",");
            }
        }
        sb.append("]");
        String str = new String(sb);
        return str;
    }
}
