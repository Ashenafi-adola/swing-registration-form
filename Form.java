import javax.swing.*;
import java.awt.*;
import components.*;

class Form{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(950, 650);
        frame.setTitle("Student Registration Form");
        frame.setLayout(null);
        frame.setBackground(new Color(200, 200, 255));
        
        Card personalInfo = new Card("Personal Information", 10, 10, 450, 320);

        CustomPanel namePanel = new CustomPanel("Full Name",  "text", 10, 30);
        personalInfo.add(namePanel);
        CustomPanel idPanel = new CustomPanel("Student ID", "text", 10, 70);
        personalInfo.add(idPanel);
        CustomPanel passwordPanel = new CustomPanel("Password :", "password", 10, 110);
        personalInfo.add(passwordPanel);
        CustomPanel genderPanel = new CustomPanel("Gender :", "radio", 10, 150);
        personalInfo.add(genderPanel);
        CustomPanel birthdayPanel = new CustomPanel("Birth Date :", "text", 10, 190);
        personalInfo.add(birthdayPanel);
        CustomPanel emailPanel = new CustomPanel("Email : ", "text", 10, 230);
        personalInfo.add(emailPanel);
        CustomPanel phonePanel = new CustomPanel("Phone Number : ", "text", 10, 270);
        personalInfo.add(phonePanel);

        frame.add(personalInfo);

        Card departmentPanel = new Card("Department",470, 30, 450, 70);
        
        JLabel department = new JLabel("Department: ");
        department.setBounds(10, 20, 100, 30);
        departmentPanel.add(department);
        String[] departments = {"Computer Science", "Software Engineering", "Electirical Power and Control Engineering", "Electronics and Communication Engineering"};
        JComboBox<String> departmentComboBox = new JComboBox<>(departments);
        departmentComboBox.setBounds(110, 20, 320, 30);
        departmentPanel.add(departmentComboBox);
        frame.add(departmentPanel);
        
        Card programmingSkillsPanel = new Card("Programming Skills (Select all that apply)",470, 110, 450, 220);

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
        for (Component comp : courseList.getComponents()) {
                String a = ((JCheckBox) comp).getText();
                System.out.println(a);
                
        }

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
            String name = namePanel.getUserInput();
            String studentId = idPanel.getUserInput();

            System.out.println(name);
            System.out.println(studentId);
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}