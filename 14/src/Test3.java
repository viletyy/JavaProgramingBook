/**
 * @Description: Do not edit
 * @Date: 2021-09-22 16:07:37
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-22 16:14:26
 * @FilePath: /14/src/Test3.java
 */
import java.util.*;

public class Test3 {
  public static void main(String[] args) {
    Map<String, Emp> map = new HashMap<>();
    Emp emp1 = new Emp("021", "哈哈");
    Emp emp2 = new Emp("015", "嘻嘻");
    map.put("021", emp1);
    map.put("015", emp2);
    
    map.remove("015");
    Set <String> set = map.keySet();
    Iterator <String> it = set.iterator();
    while(it.hasNext()) {
      String eId = it.next();
      Emp emp = map.get(eId);
      System.out.println(emp.getEId() + " " + emp.getEName());
    }
  }
  
}
