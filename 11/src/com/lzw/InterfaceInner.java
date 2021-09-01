/**
 * @Description: Do not edit
 * @Date: 2021-09-01 18:44:39
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-01 18:52:11
 * @FilePath: /11/src/com/lzw/InterfaceInner.java
 */
package com.lzw;

import com.lzw.OuterClass.innerClass;

interface OutInterface {
  public void f();
}

public class InterfaceInner {
  public static void main(String[] args){
    OuterClass2 out = new OuterClass2();
    OutInterface outinter = out.doit();
    outinter.f();
  }
}

class OuterClass2 {
  private class InnerClass implements OutInterface {
    InnerClass(String s) {
      System.out.println(s);
    }

    public void f() {
      System.out.println("访问内部类中的f()方法");
    }
  }

  public OutInterface doit() {
    return new InnerClass("访问内部类构造方法");
  }
}