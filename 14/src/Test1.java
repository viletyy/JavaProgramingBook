/**
 * @Description: Do not edit
 * @Date: 2021-09-22 15:55:20
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-22 15:58:12
 * @FilePath: /14/src/Test1.java
 */
import java.util.*;
public class Test1 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for(int i = 1; i <= 100; i++) {
      list.add(i);
    }
    list.remove(10);

    for(int j = 0; j < list.size(); j++) {
      System.out.println(list.get(j));
    }
  }
}