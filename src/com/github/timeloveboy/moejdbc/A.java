package com.github.timeloveboy.moejdbc;

import com.github.timeloveboy.moejdbc.anno.MyMessage;

/**
 * Created by timeloveboy on 17-10-26.
 */
public class A {
    @MyMessage(num = 10, desc = "参数a")
    private static int a;

    @MyMessage(name = "Sam test", desc = "测试方法test")
    public void test() {
        System.out.println("test");
    }
}
