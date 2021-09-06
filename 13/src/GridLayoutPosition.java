
/**
 * @Description: 网格布局管理器
 * @Date: 2021-09-06 14:39:24
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-06 18:28:48
 * @FilePath: /13/src/GridLayoutPosition.java
 */
import java.awt.*;
import javax.swing.*;

public class GridLayoutPosition extends JFrame {
  public GridLayoutPosition() {
    Container c = getContentPane();
    setLayout(new GridLayout(7, 3, 2, 2));
    for (int i = 0; i < 20; i++) {
      c.add(new JButton("button" + i));
    }
    setSize(300, 300);
    setTitle("这是一个使用网格布局管理器的窗体");
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new GridLayoutPosition();
  }
}
