package com.bh.test;
/*
 * 线程安全
 * 安全 -- 同步 -- 数据是安全的
 * 不安全 -- 不同步 -- 效率高一些
 *
 *
 * StringBuffer:
 * 		线程安全的可变字符串。
 *
 * StringBuffer和String的区别?
 * 前者长度和内容可变，后者不可变。
 * 如果使用前者做字符串的拼接，不会浪费太多的资源。
 *
 * StringBuffer的构造方法：
 * 		public StringBuffer():无参构造方法
 *		public StringBuffer(int capacity):指定容量的字符串缓冲区对象
 *		public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
 *
 * StringBuffer的方法：
 *		public int capacity()：返回当前容量。	理论值
 *		public int length():返回长度（字符数）。 实际值
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        // public StringBuffer():无参构造方法
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);

        // public StringBuffer(int capacity):指定容量的字符串缓冲区对象, 默认为16
        StringBuffer sb2 = new StringBuffer(2);
        System.out.println(sb2.capacity());

        // public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
        StringBuffer sb3 = new StringBuffer("abcde");
        System.out.println(sb3);

        System.out.println("=============================================");

        /*
         * StringBuffer添加功能：
         * public StringBuffer append(String str):
                可以把任意类型数据添加到字符串缓冲区,并返回字符串缓冲区本身
         *
         * public StringBuffer insert(int offset,String str):
                在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
         */
        // 创建字符串缓冲区对象
        StringBuffer sbf = new StringBuffer();
        StringBuffer sbf2 = sbf.append("hello");
        System.out.println(sbf);
        System.out.println(sbf2);
        System.out.println(sbf == sbf2);

        // 一步一步的添加数据
//        sbf.append("hello");
//        sbf.append(true);
//        sbf.append(12);
//        sbf.append(34.56);
//        System.out.println(sbf);
        // 链式编程   当返回是一个对象时还可以继续调用
        sbf.append("hello").append(true).append(12).append(34.56);
        System.out.println(sbf);

        // public StringBuffer insert(int offset,String str):
        // 在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
        sbf.insert(5, "张三");
        System.out.println(sbf);

        System.out.println("=============================================");

        /*
         * StringBuffer的删除功能
         * public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身
         * public StringBuffer delete(int start,int end):删除从指定位置开始指定位置结束的内容，并返回本身
         */
        StringBuffer sbd = new StringBuffer();
        sbd.append("hello").append("world").append("java");
        System.out.println(sbd);
        // 删除指定字符
        sbd.deleteCharAt(5);
        System.out.println(sbd);

        // 删除从指定位置开始指定位置结束的内容
        sbd.delete(4, 6);
        System.out.println(sbd);

        // 需求:我要删除所有的数据
        sbd.delete(0, sbd.length());
        System.out.println("sbd: " + sbd);

        System.out.println("=============================================");
        System.out.println("替换功能");
        /*
         * StringBuffer的替换功能：
         * public StringBuffer replace(int start,int end,String str):从start开始到end用str替换
         */
        // 创建缓冲区对象
        StringBuffer sbr = new StringBuffer();
        // 添加数据
        sbr.append("Hello").append("World").append("Java");
        System.out.println(sbr);
        sbr.replace(5, 10, "Welcome");
        System.out.println(sbr);

        System.out.println("=============================================");
        System.out.println("反转功能");

        /*
         * StringBuffer的反转功能：
         * public StringBuffer reverse()
         */
        StringBuffer sb5 = new StringBuffer();
        // 添加数据
        sb5.append("国中你爱我");
        System.out.println("sb5:" + sb5);
        sb5.reverse();
        System.out.println(sb5);

        System.out.println("=============================================");
        System.out.println("截取功能");
        /*
         * StringBuffer的截取功能:注意返回值类型不再是StringBuffer本身了
         * public String substring(int start)   从start到末尾
         * public String substring(int start,int end)
         */
        // 创建缓冲区对象
        StringBuffer sb6 = new StringBuffer();
        // 添加数据
        sb6.append("Hello").append("World").append("Java");
        System.out.println(sb6);
        String s = sb6.substring(5);
        System.out.println(s);
        String s1 = sb6.substring(5, 10);
        System.out.println(s1);


        System.out.println("=============================================");
        System.out.println("类之间的转换");

        /*
         * 类之间的转换：
         *    A -- B的转换
         * 把A转换为B，其实是为了使用B的功能。
         *    B -- A的转换
         * 可能要的结果是A类型，所以还得转回来。
         *
         * String与StringBuffer的相互
         */

        // String --> StringBuffer
        String ss = "hello";
        // 注意：不能把字符串的值直接赋值给StringBuffer
        // StringBuffer sb = "hello";
        // StringBuffer sb = s;

        // 方式一: 通过构造方法
        StringBuffer sbuf = new StringBuffer(ss);
        System.out.println(sbuf);
        // 方式二: 通过append()方法
        StringBuffer sbuf1 = new StringBuffer();
        sbuf1.append(ss);
        System.out.println(sbuf1);
        System.out.println("------------------------------");

        // StringBuffer --> String
        StringBuffer sbuff = new StringBuffer("Java");
        // String(StringBuffer buffer);
        // 方式一: 通过构造方法
        String str = new String(sbuff);
        System.out.println(str);
        // 方式二: 通过toString()方法
        String str2 = sbuff.toString();
        System.out.println(str2);
    }
}
