/**
 * @Description: 匿名内部类
 * @Date: 2021-09-02 10:37:27
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-02 15:49:31
 * @FilePath: /11/src/com/lzw/AnonymityInnerClass.java
 */
package com.lzw;

public class AnonymityInnerClass {
  
}

class OuterClass5{
  public OutInterface doit(final String s) {
    return new OutInterface() {
      private int i = 0;
      public int getValue() {
        System.out.println(s);
        return i;
      }

      public void f() {
        System.out.println("f()");
      }
    };

    
  }

  public static void main(String[] args) {
    OuterClass5 outer = new OuterClass5();
    outer.doit("hahah").f();
  }
}
