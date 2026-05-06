import javax.swing.*;
import java.awt.*;

class Form{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1000, 700);
        frame.setTitle("Student Registration Form");
        frame.setLayout(null);
        frame.setBackground(new Color(230, 230, 255));
        
        JPanel personalInfo = new JPanel();
        personalInfo.setBounds(10, 10, 450, 400);
        personalInfo.setBackground(new Color(245, 245, 255));
        personalInfo.setLayout(null);

        JLabel peronal_infolable = new JLabel("Personal Information");
        peronal_infolable.setBounds(10, -5, 200, 30);
        personalInfo.add(peronal_infolable);

        JPanel namePanel = new JPanel();
        namePanel.setBounds(10, 30, 430, 40);
        namePanel.setLayout(null);
        JLabel fullName = new JLabel("Full Name: ");
        fullName.setBounds(10, 5, 100, 30);
        namePanel.add(fullName);
        JTextField nameInput = new JTextField(20);
        nameInput.setBounds(110, 5, 320, 30);
        namePanel.add(nameInput);
        personalInfo.add(namePanel);
        
        JPanel idPanel = new JPanel();
        idPanel.setBounds(10, 70, 430, 40);
        idPanel.setLayout(null);
        JLabel studentId = new JLabel("Student ID: ");
        studentId.setBounds(10, 5, 100, 30);
        idPanel.add(studentId);
        JTextField idInput = new JTextField(20);
        idInput.setBounds(110, 5, 320, 30);
        idPanel.add(idInput);
        personalInfo.add(idPanel);
        
        JPanel passwordPanel = new JPanel();
        passwordPanel.setBounds(10, 110, 430, 40);
        passwordPanel.setLayout(null);
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10, 5, 100, 30);
        passwordPanel.add(passwordLabel);
        JPasswordField password = new JPasswordField(20);
        password.setBounds(110, 5, 320, 30);
        passwordPanel.add(password);
        personalInfo.add(passwordPanel);

        JPanel genderPanel = new JPanel();
        genderPanel.setBounds(10, 150, 430, 40);
        genderPanel.setLayout(null);
        JLabel genderLabel = new JLabel("Gender: ");
        genderLabel.setBounds(10, 5, 100, 30);
        genderPanel.add(genderLabel);
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(110, 5, 100, 30);
        genderPanel.add(male);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(210, 5, 100, 30);
        genderPanel.add(female);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        personalInfo.add(genderPanel);

        JPanel birthdayPanel = new JPanel();
        birthdayPanel.setBounds(10, 190, 430, 40);
        birthdayPanel.setLayout(null);
        JLabel birthdayLabel = new JLabel("Date of Birth: ");
        birthdayLabel.setBounds(10, 5, 100, 30);
        birthdayPanel.add(birthdayLabel);
        JTextField birthdayInput = new JTextField(20);
        birthdayInput.setBounds(110, 5, 320, 30);
        birthdayPanel.add(birthdayInput);
        personalInfo.add(birthdayPanel);

        JPanel emailPanel = new JPanel();
        emailPanel.setBounds(10, 230, 430, 40);
        emailPanel.setLayout(null);
        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(10, 5, 100, 30);
        emailPanel.add(emailLabel);
        JTextField emailInput = new JTextField(20);
        emailInput.setBounds(110, 5, 320, 30);
        emailPanel.add(emailInput);
        personalInfo.add(emailPanel);

        JPanel phonePanel = new JPanel();
        phonePanel.setBounds(10, 270, 430, 40);
        phonePanel.setLayout(null);
        JLabel phoneLabel = new JLabel("Phone Number: ");
        phoneLabel.setBounds(10, 5, 100, 30);
        phonePanel.add(phoneLabel);
        JTextField phoneInput = new JTextField(20);
        phoneInput.setBounds(110, 5, 320, 30);      
        phonePanel.add(phoneInput);
        personalInfo.add(phonePanel);

        frame.add(personalInfo);

        JPanel departmentPanel = new JPanel();
        departmentPanel.setLayout(null);
        departmentPanel.setBounds(470, 30, 450, 70);
        departmentPanel.setBackground(new Color(245, 245, 255));

        JLabel departmentLable = new JLabel("Department: ");
        departmentLable.setBounds(10, -5, 100, 30);
        departmentPanel.add(departmentLable);

        JLabel department = new JLabel("Department: ");
        department.setBounds(10, 20, 100, 30);
        departmentPanel.add(department);

        String[] departments = {"Computer Science", "Software Engineering", "Electirical Power and Control Engineering", "Electronics and Communication Engineering"};
        
        JComboBox<String> departmentComboBox = new JComboBox<>(departments);
        departmentComboBox.setBounds(110, 20, 320, 30);
        departmentPanel.add(departmentComboBox);

        frame.add(departmentPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}