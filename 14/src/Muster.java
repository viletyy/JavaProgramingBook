/**
 * @Description: Collection接口
 * @Date: 2021-09-22 14:48:56
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-22 14:53:10
 * @FilePath: /14/src/Muster.java
 */

import java.util.*;
public class Muster {
  public static void main(String[] args) {
    Collection <String> list = new ArrayList <>();
    list.add("a");
    list.add("b");
    list.add("c");
    Iterator <String> it = list.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}