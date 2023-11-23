package lan.zold.controllers;

import javax.swing.JButton;

import lan.zold.models.CalcTriangle;
import lan.zold.views.InputPanel;
import lan.zold.views.MainFrame;

public class MainController {
    MainFrame mainFrame;

    public MainController() {
        this.mainFrame = new MainFrame();
        this.handleEvents();
    }

    private void handleEvents() {
        JButton calcButton = mainFrame.getCalcButton();
        calcButton.addActionListener(e -> {
            onClickCalcButton();
        });

        JButton clearButton = mainFrame.getClearButton();
        clearButton.addActionListener(e->{
            clearFields();
        });
    }

    private void onClickCalcButton() {
        InputPanel basePanel = this.mainFrame.getBasePanel();
        InputPanel heightPanel = this.mainFrame.getHeightPanel();
        InputPanel areaPanel = this.mainFrame.getAreaPanel();
        double base = Double.parseDouble(basePanel.getValue());
        double height = Double.parseDouble(heightPanel.getValue());
        Double area = CalcTriangle.calcArea(base, height);
        areaPanel.setValue(area.toString());
    }
    private void clearFields(){
        InputPanel basePanel = this.mainFrame.getBasePanel();
        InputPanel heightPanel = this.mainFrame.getHeightPanel();
        InputPanel areaPanel = this.mainFrame.getAreaPanel();
        basePanel.setValue("");
        heightPanel.setValue("");
        areaPanel.setValue("");
    }
}
