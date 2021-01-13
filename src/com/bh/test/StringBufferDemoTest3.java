package com.bh.test;
/*
 * 面试题：
 * 1：String,StringBuffer,StringBuilder的区别?
 *   A:String是内容不可变的，而StringBuffer,StringBuilder都是内容可变的。
 *   B:StringBuffer是同步的，数据安全,效率低;
       StringBuilder是不同步的,数据不安全,效率高
 *
 * 2：StringBuffer和数组的区别?
 *   都可以看出是一个容器
 *   StringBuffer的数据最终是一个字符串数据。
 *   而数组可以放置多种数据，但必须是同一种数据类型的。
 *
 * 3:形式参数问题
 * String作为参数传递
 * StringBuffer作为参数传递
 *
 * 形式参数：
 * 		基本类型：形式参数的改变不影响实际参数
 * 		引用类型：形式参数的改变直接影响实际参数
 *
 * 注意：
 * 		String作为参数传递，效果和基本类型作为参数传递是一样的。
 */
public class StringBufferDemoTest3 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 +"--------------"+s2);        // hello--------------world

        // String是内容不可变的
        // 在每次对 String 类型进行改变的时候其实都等同于生成了一个新的 String 对象，然后将指针指向新的 String 对象
        // 因为传入的参数s1、s2和方法里面的s1、s2是2个不同的对象
        change(s1, s2);
        System.out.println(s1 +"--------------"+s2);        // hello--------------world

        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("world");
        System.out.println(sb1 +"--------------"+sb2);      // hello--------------world

        // 变量sb1、sb2和change方法中的sb1、sb2中存储的是StringBuffer变量的引用而不是一个StringBuffer对象。
        // 根据非基本类型参数传递为引用传递的规则，change接收的参数只是StringBuffer对象的引用.
        // 因此可以理解为sb1、change方法中的sb1都是指向同一个对象;sb2、change方法中的sb2也是指向同一个StringBuffer对象，
        // 所以sb1 = sb2只是让方法中的sb2改变指向为和方法中的sb1相同的StringBuffer对象，而方法中的sb1原来所指的对象并不会发生任何改变
        // 而sb2.append(sb1)将导致方法中的sb2和sb2同指的StringBuffer对象改变（增加"world"）；
        change(sb1, sb2);
        System.out.println(sb1 +"--------------"+sb2);      // hello--------------worldworld
    }
    public static void change(String s1, String s2) {
        s1 = s2;
        s2 = s1 +s2;
    }
    public static void change(StringBuffer sb1, StringBuffer sb2) {
        sb1 = sb2;
        sb2.append(sb1);
    }
}



// 　　*常见对象(String和StringBuffer分别作为参数传递)
// 　　* A:形式参数问题
// 　　* String作为参数传递
// 　　* StringBuffer作为参数传递
// 　　* B:案例演示
// 　　* String和StringBuffer分别作为参数传递问题
// 　　*( 基本数据类型的值传递，不改变其值
// 　　* 引用数据类型的值传递，改变其值
// 　　* String类虽然是引用数据类型，但是它当做参数传递时和基本数据类型是一样的
// 　　* StringBuffer是引用数据类型，当做参数传递时改变其值)

