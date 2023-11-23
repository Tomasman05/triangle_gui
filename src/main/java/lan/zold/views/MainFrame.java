package lan.zold.views;


import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
    public MainFrame(){
        
        this.initFrame();
    }
    private void initFrame(){
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // this.setSize(400,300);
        this.pack();
        this.setVisible(true);
    }
   
}
