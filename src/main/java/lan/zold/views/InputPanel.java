package lan.zold.views;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputPanel extends JPanel {
    JLabel label;
    JTextField field;
    

    public InputPanel(){
        initComponents();
        addComponents();
    }

    private void initComponents() {
        this.label = new JLabel();
        this.field = new JTextField();
    }
    public void setText(String text){
        this.label.setText(text);
    }
    public void setValue(String value){
        this.field.setText(value);
    }

    private void addComponents() {
        this.add(this.label);
        this.add(this.field);
    }
}
