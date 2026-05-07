package components;

import javax.swing.*;

public class CustomPanel extends JPanel {
    private JTextField textField = null;
    private JPasswordField passwordField = null;
    private JRadioButton maleRadio = null;
    private JRadioButton femaleRadio = null;
    private String inputType;

    public CustomPanel(String title, String inputType, int x, int y) {
        this.inputType = inputType;
        this.setBounds(x, y, 430, 40);
        this.setLayout(null);
        JLabel label = new JLabel(title);
        label.setBounds(10, 5, 100, 30);
        this.add(label);
        if ("password".equals(inputType)) {
            passwordField = new JPasswordField(20);
            passwordField.setBounds(110, 5, 320, 30);
            this.add(passwordField);
        } else if ("radio".equals(inputType)) {
            maleRadio = new JRadioButton("Male");
            maleRadio.setBounds(110, 5, 100, 30);
            this.add(maleRadio);
            femaleRadio = new JRadioButton("Female");
            femaleRadio.setBounds(210, 5, 100, 30);
            this.add(femaleRadio);
            ButtonGroup genderGroup = new ButtonGroup();
            genderGroup.add(maleRadio);
            genderGroup.add(femaleRadio);
        } else {
            textField = new JTextField(20);
            textField.setBounds(110, 5, 320, 30);
            this.add(textField);
        }
    }

    public String getUserInput() {
        if ("password".equals(inputType) && passwordField != null) {
            return new String(passwordField.getPassword());
        } else if ("radio".equals(inputType) && maleRadio != null && femaleRadio != null) {
            if (maleRadio.isSelected()) {
                return "Male";
            } else if (femaleRadio.isSelected()) {
                return "Female";
            } else {
                return "";
            }
        } else if (textField != null) {
            return textField.getText();
        }
        return "";
    }
    public void clearInput() {
        if (inputType == "password"){
            passwordField.setText("");
        }else if(inputType == "text"){
            textField.setText("");
        }

    }
}
