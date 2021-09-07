
/**
 * @Description: 选择框
 * @Date: 2021-09-07 09:41:30
 * @LastEditors: viletyy
 * @Author: viletyy
 * @LastEditTime: 2021-09-07 10:45:30
 * @FilePath: /13/src/JComboBoxModelTest.java
 */
import java.awt.*;
import javax.swing.*;

public class JComboBoxModelTest extends JFrame {
  private static final long serialVersionUID = 1L;
  JComboBox<String> jc = new JComboBox<>(new MyComboBox());
  JLabel jl = new JLabel("请选择证件：");

  public JComboBoxModelTest() {
    setSize(new Dimension(160, 180));
    setVisible(true);
    setTitle("");
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    cp.add(jl);
    cp.add(jc);
  }

  public static void main(String[] args) {
    new JComboBoxModelTest();
  }
}

class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String> {

  private static final long serialVersionUID = 1L;

  String selecteditem = null;
  String[] test = { "身份证", "军人证", "学生证", "工作证" };

  public String getElementAt(int index) {
    return test[index];
  }

  public int getSize() {
    return test.length;
  }

  public void setSelectedItem(Object item) {
    selecteditem = (String) item;
  }

  public Object getSelectedItem() {
    return selecteditem;
  }

  public int getIndex() {
    for (int i = 0; i < test.length; i++) {
      if (test[i].equals(getSelectedItem())) {
        return i;
      }
    }

    return 0;
  }
}