package com.bh.test;

import org.junit.Test;

/**
 * 将中文字符装换为数组  "山东大学软件学院"
 */
public class ChineseCharacterToArrayDemo {
    @Test
    public void ChineseCharacterToArrayDemo() {
        String str = "山东大学软件学院";
        String strr = "";
        strr += "[";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1) {
                strr += chars[i];
            }else {
                strr += chars[i];
                strr += ",";
            }
        }
        strr += "]";
        char[] chars1 = strr.toCharArray();
        System.out.println(chars1);
    }
}
