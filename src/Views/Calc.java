package Views;

import javax.swing.*;

public class Calc {
    private JTextField ValorField1;
    private JTextField ValorField2;
    private JRadioButton adicaoRadioButton;
    private JRadioButton subtracaoRadioButton;
    private JRadioButton multiplicacaoRadioButton;
    private JRadioButton divisaoRadioButton;
    private JRadioButton expoenteRaizRadioButton;
    private JTextField textField3;
    private JButton okayButton;
    
    public Calc(JTextField valorField1, JTextField valorField2, JRadioButton adicaoRadioButton,
            JRadioButton subtracaoRadioButton, JRadioButton multiplicacaoRadioButton, JRadioButton divisaoRadioButton,
            JRadioButton expoenteRaizRadioButton, JTextField textField3, JButton okayButton) {
        ValorField1 = valorField1;
        ValorField2 = valorField2;
        this.adicaoRadioButton = adicaoRadioButton;
        this.subtracaoRadioButton = subtracaoRadioButton;
        this.multiplicacaoRadioButton = multiplicacaoRadioButton;
        this.divisaoRadioButton = divisaoRadioButton;
        this.expoenteRaizRadioButton = expoenteRaizRadioButton;
        this.textField3 = textField3;
        this.okayButton = okayButton;
    }

    public Calc(){}

    
}
