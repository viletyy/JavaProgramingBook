import javax.swing.JFrame;

/**
 * @Description: Do not edit
 * @Date: 2021-09-07 11:13:10
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-07 11:20:23
 * @FilePath: /13/src/UseCase1.java
 */
import java.awt.*;

import javax.swing.*;

public class UseCase1 extends JFrame {
  private static final long serialVersionUID = 1L;
  private JComboBox<String> comboBox;

  public static void main(String[] args) {
    new UseCase1();

  }

  public UseCase1() {
    super();

    comboBox = new JComboBox<>();
    comboBox.addItem("红");
    comboBox.addItem("橙");
    comboBox.addItem("黄");
    comboBox.addItem("绿");
    getContentPane().add(comboBox, BorderLayout.NORTH);

    final JPanel panel = new JPanel();
    getContentPane().add(panel, BorderLayout.CENTER);

    final JCheckBox checkBox = new JCheckBox();
    checkBox.setText("男");
    panel.add(checkBox);

    final JCheckBox checkBox1 = new JCheckBox();
    checkBox1.setText("女");
    panel.add(checkBox1);

    final JPanel panel1 = new JPanel();
    getContentPane().add(panel1, BorderLayout.SOUTH);

    final JButton okButton = new JButton();
    okButton.setText("确定");
    panel1.add(okButton);

    final JButton cancelButton = new JButton();
    cancelButton.setText("取消");
    panel1.add(cancelButton);

    setSize(200, 150);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    setVisible(true);
  }
}