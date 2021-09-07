
/**
 * @Description: 动作事件监听器
 * @Date: 2021-09-07 10:46:32
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-07 10:53:26
 * @FilePath: /13/src/SimpleEvent.java
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SimpleEvent extends JFrame implements ActionListener {
  private static final long serialVersionUID = 1L;
  private JButton jb = new JButton("我是按钮，单击我");

  public SimpleEvent() {
    setLayout(null);
    setSize(200, 100);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    Container cp = getContentPane();
    cp.add(jb);
    jb.setBounds(10, 10, 100, 30);
    // jb.addActionListener(new jbAction());
    jb.addActionListener(this);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent arg0) {
    jb.setText("我被单击了");
  }

  // class jbAction implements ActionListener {
  // public void actionPerformed(ActionEvent arg0) {
  // jb.setText("我被单击了");
  // }
  // }

  public static void main(String[] args) {
    new SimpleEvent();
  }
}