import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton, equButton, decButton, clrButton, delButton;
    private JPanel panel;

    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public CalculatorGUI() {
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setResizable(false);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(2, 40));
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 20));
            numberButtons[i].setFocusable(false);
            numberButtons[i].addActionListener(this);
        }

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equButton = new JButton("=");
        decButton = new JButton(".");
        clrButton = new JButton("C");
        delButton = new JButton("Del");

        functionButtons = new JButton[]{addButton, subButton, mulButton, divButton, equButton, decButton, clrButton, delButton};
        
        for (JButton button : functionButtons) {
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.setFocusable(false);
            button.addActionListener(this);
        }

        panel.add(delButton);
        panel.add(clrButton);
        panel.add(divButton);
        panel.add(mulButton);
        panel.add(num1);
        panel.add(num2);
        panel.add(subButton);
        panel.add(addButton);
        panel.add(num2);
        panel.add(equButton);
        panel.add(decButton);
        panel.add(num1);

        this.add(textField, BorderLayout.NORTH);
        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decButton) {
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText().concat("."));
            }
        }
        if (e.getSource() == clrButton) {
            textField.setText("");
        }
        if (e.getSource() == delButton) {
            String str = textField.getText();
            textField.setText("");
            for (int i = 0; i < str.length() - 1; i++) {
                textField.setText(textField.getText() + str.charAt(i));
            }
        }
    }
}
