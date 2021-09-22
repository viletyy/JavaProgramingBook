/**
 * @Description: 顺序输出Map集合
 * @Date: 2021-09-22 15:37:23
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-22 15:42:27
 * @FilePath: /14/src/Emp.java
 */
public class Emp {
    private String eId;
    private String eName;
    public Emp(String eId, String eName) {
      this.eId = eId;
      this.eName = eName;
    }

    public String getEId() {
      return eId;
    }

    public void setEId(String eId) {
      this.eId = eId;
    }

    public String getEName() {
      return eName;
    }

    public void setEName(String eName) {
      this.eName = eName;
    }
}