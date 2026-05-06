import javax.swing.*;
import java.awt.*;

class Form{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(950, 650);
        frame.setTitle("Student Registration Form");
        frame.setLayout(null);
        frame.setBackground(new Color(200, 200, 255));
        
        JPanel personalInfo = new JPanel();
        personalInfo.setBounds(10, 10, 450, 320);
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
        
        JPanel programmingSkillsPanel = new JPanel();
        programmingSkillsPanel.setLayout(null);
        programmingSkillsPanel.setBounds(470, 110, 450, 220);
        programmingSkillsPanel.setBackground(new Color(245, 245, 255));

        JLabel programmingSkillsLabel = new JLabel("Programming Skills (Select all that apply)");
        programmingSkillsLabel.setBounds(10, -5, 300, 30);
        programmingSkillsPanel.add(programmingSkillsLabel);
        
        JCheckBox javaCheckBox = new JCheckBox("Java");
        javaCheckBox.setBounds(10, 20, 100, 30);
        programmingSkillsPanel.add(javaCheckBox);
        JCheckBox cppCheckBox = new JCheckBox("C++");
        cppCheckBox.setBounds(10, 55, 100, 30);
        programmingSkillsPanel.add(cppCheckBox);
        JCheckBox pythonCheckBox = new JCheckBox("Python");
        pythonCheckBox.setBounds(10, 90, 100, 30);
        programmingSkillsPanel.add(pythonCheckBox);
        JCheckBox jsCheckBox = new JCheckBox("JavaScript");
        jsCheckBox.setBounds(10, 125, 100, 30);
        programmingSkillsPanel.add(jsCheckBox);

        JCheckBox otherCheckBox = new JCheckBox("Other");
        otherCheckBox.setBounds(10, 160, 100, 30);
        programmingSkillsPanel.add(otherCheckBox);
        JTextField otherInput = new JTextField(20);
        otherInput.setBounds(115, 160, 320, 30);
        programmingSkillsPanel.add(otherInput);

        frame.add(programmingSkillsPanel);

        JPanel courseSelection = new JPanel();
        courseSelection.setBounds(10, 340, 500, 200);
        courseSelection.setLayout(null);
        courseSelection.setBackground(new Color(245, 245, 255));
        JLabel course = new JLabel("Course Selection");
        course.setBounds(10, -5, 200, 30);
        courseSelection.add(course);

        String[] courses = {"Data Structure", "Object Oriented Programming", "DataBase System", "Operating System", "Web Development"};

        JLabel selectCourseLabel = new JLabel("Select Courses: ");
        selectCourseLabel.setBounds(10, 10, 100, 30);
        courseSelection.add(selectCourseLabel);

        JPanel courseList = new JPanel();
        courseList.setBounds(130, 40, 200, 150);
        courseList.setLayout(null);
        courseSelection.add(courseList);
        for (int i = 0; i < courses.length; i++) {
            JCheckBox courseCheckBox = new JCheckBox(courses[i]);
            courseCheckBox.setBounds(10, 20 + i * 30, 150, 30);
            courseList.add(courseCheckBox);
        }

        frame.add(courseSelection);

        JPanel addressPanel = new JPanel();
        addressPanel.setBounds(520, 340, 400, 200);
        addressPanel.setLayout(null);
        addressPanel.setBackground(new Color(245, 245, 255));

        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(10, -5, 100, 30);
        addressPanel.add(addressLabel);
        JTextArea addressInput = new JTextArea();
        addressInput.setBounds(10, 30, 380, 150);
        addressPanel.add(addressInput);

        frame.add(addressPanel);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setBounds(300, 550, 910, 50);
        buttonsPanel.setLayout(null);
        JButton submitButton = new JButton("📄 Submit");
        submitButton.setBounds(10, 10, 100, 30);   
        submitButton.setBackground(new Color(50, 60, 230));
        submitButton.setForeground(new Color(255, 255, 255));
        buttonsPanel.add(submitButton);
        JButton clearButton = new JButton("🖋️  Clear");
        clearButton.setBounds(120, 10, 100, 30);
        clearButton.setBackground(new Color(240, 245, 0));
        buttonsPanel.add(clearButton);
        frame.add(buttonsPanel);
        JButton exitButton = new JButton("❌  Exit");
        exitButton.setBounds(230, 10, 100, 30);
        exitButton.setBackground(new Color(240, 20, 10));
        buttonsPanel.add(exitButton);
        exitButton.addActionListener(e -> System.exit(0));  

        submitButton.addActionListener(e -> {
            String name = nameInput.getText();
            String studentIdText = idInput.getText();
            String passwordText = new String(password.getPassword());
            String departmentText = (String) departmentComboBox.getSelectedItem();
            String gender = null;
            if (male.isSelected())  gender = "Male";
            else if(female.isSelected()) gender = "Female";
            String birthday = birthdayInput.getText();
            String email = emailInput.getText();
            int phoneNumber = Integer.parseInt(phoneInput.getText());

            
            System.out.println(name);
            System.out.println(studentIdText);
            System.out.println(passwordText);
            System.out.println(gender);

            System.out.println(departmentText);
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}