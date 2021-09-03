/**
 * @Description: 内部类的继承
 * @Date: 2021-09-02 10:33:40
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-02 15:49:18
 * @FilePath: /11/src/com/lzw/OutputInnerClass.java
 */
package com.lzw;

public class OutputInnerClass extends ClassA.ClassB {
  public OutputInnerClass(ClassA a){
    a.super();
  }
}

class ClassA {
  class ClassB{
    
  }
}