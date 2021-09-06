
/**
 * @Description: 流布局管理器
 * @Date: 2021-09-06 14:28:16
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-06 17:17:21
 * @FilePath: /13/src/FlowLayoutPosition.java
 */
import java.awt.*;
import javax.swing.*;

public class FlowLayoutPosition extends JFrame {
  public FlowLayoutPosition() {
    setTitle("本窗体使用流布局管理器");
    Container c = getContentPane();
    setLayout(new FlowLayout(2, 10, 10));
    for (int i = 0; i < 10; i++) {
      c.add(new JButton("button" + i));
    }
    setSize(300, 200);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
  }

  public static void main(String[] args) {
    new FlowLayoutPosition();
  }
}
