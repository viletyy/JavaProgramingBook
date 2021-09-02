/**
 * @Description: Do not edit
 * @Date: 2021-09-02 10:33:40
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-02 10:33:40
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