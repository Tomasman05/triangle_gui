package lan.zold.views;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
    InputPanel basePanel;
    InputPanel heightPanel;
    JButton calcButton;
    JButton clearButton;
    
    InputPanel areaPanel;
    
    public MainFrame() {
        this.initComponent();
        this.setComponent();
        this.addComponent();
        this.initFrame();
    }
    
    private void initFrame() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // this.setSize(400,300);
        this.pack();
        this.setVisible(true);
    }
    
    private void initComponent() {
        this.basePanel = new InputPanel();
        this.heightPanel = new InputPanel();
        this.calcButton = new JButton();
        this.clearButton = new JButton();
        this.areaPanel = new InputPanel();
    }
    
    private void setComponent() {
        this.basePanel.setText("Alap");
        this.heightPanel.setText("Magasság");
        this.areaPanel.setText("Terület");
        this.calcButton.setText("Számít");
        this.clearButton.setText("Törlés");
    }
    
    private void addComponent() {
        this.add(this.basePanel);
        this.add(this.heightPanel);
        this.add(this.calcButton);
        this.add(this.clearButton);
        this.add(this.areaPanel);
    }
    
    public InputPanel getBasePanel() {
        return basePanel;
    }
    
    public void setBasePanel(InputPanel basePanel) {
        this.basePanel = basePanel;
    }
    
    public InputPanel getHeightPanel() {
        return heightPanel;
    }
    
    public void setHeightPanel(InputPanel heightPanel) {
        this.heightPanel = heightPanel;
    }
    
    public JButton getCalcButton() {
        return calcButton;
    }
    
    public void setCalcButton(JButton calcButton) {
        this.calcButton = calcButton;
    }
    
    public InputPanel getAreaPanel() {
        return areaPanel;
    }
    
    public void setAreaPanel(InputPanel areaPanel) {
        this.areaPanel = areaPanel;
    }
    
    public JButton getClearButton() {
        return clearButton;
    }
    
    public void setClearButton(JButton clearButton) {
        this.clearButton = clearButton;
    }
    
    
}
