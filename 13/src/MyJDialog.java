
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * @Description: JDialog窗体
 * @Date: 2021-09-03 15:25:24
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-03 15:58:51
 * @FilePath: /13/src/MyJDialog.java
 */

public class MyJDialog extends JDialog {
  public MyJDialog(MyFrame frame) {
    super(frame, "第一个JDialog窗体", true);
    Container container = getContentPane();
    container.add(new JLabel("这是一个对话框"));
    setBounds(129, 120, 100, 100);
  }
}

class MyFrame extends JFrame {
  private static final long serialVersionUID = 1L;

  public static void main(String[] args) {
    new MyFrame();
  }

  public MyFrame() {
    java.awt.Container container = getContentPane();
    container.setLayout(null);
    JLabel jl = new JLabel("这是一个JFrame窗体");
    jl.setHorizontalAlignment(SwingConstants.CENTER);
    container.add(jl);
    JButton bl = new JButton("弹出对话框");
    bl.setBounds(10, 10, 100, 21);
    bl.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        new MyJDialog(MyFrame.this).setVisible(true);
      }
    });
    container.add(bl);

    container.add(bl);
    container.setBackground(Color.white);
    setSize(200, 200);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    setVisible(true);
  }
}