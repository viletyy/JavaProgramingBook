
/**
 * @Description: 边界布局管理器
 * @Date: 2021-09-06 14:33:07
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-06 17:16:45
 * @FilePath: /13/src/BorderLayoutPosition.java
 */
import java.awt.*;

import javax.swing.*;

public class BorderLayoutPosition extends JFrame {
  String[] border = { BorderLayout.CENTER, BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.WEST,
      BorderLayout.EAST };
  String[] buttonName = { "center button", "north button", "south button", "west button", "east button" };

  public BorderLayoutPosition() {
    setTitle("这个窗体使用边界布局管理器");
    Container c = getContentPane();
    setLayout(new BorderLayout());
    for (int i = 0; i < border.length; i++) {
      c.add(border[i], new JButton(buttonName[i]));
    }
    setSize(350, 200);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
  }

  public static void main(String[] args) {
    new BorderLayoutPosition();
  }
}