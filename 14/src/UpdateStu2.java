/**
 * @Description: Map集合
 * @Date: 2021-09-22 15:26:56
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-22 15:36:48
 * @FilePath: /14/src/UpdateStu2.java
 */
import java.util.*;
public class UpdateStu2 {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("01", "李同学");
    map.put("02", "魏同学");
    Set <String> set = map.keySet();
    Iterator <String> it = set.iterator(); 
    System.out.println("key 集合中的元素：");
    while(it.hasNext()) {
      System.out.println(it.next());
    }
    Collection <String> coll = map.values();
    it = coll.iterator();
    System.out.println("values集合中的元素：");
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}
