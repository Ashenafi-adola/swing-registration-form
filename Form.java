import javax.swing.*;
import java.awt.*;
import components.*;
import java.util.ArrayList;

class Form{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(965, 670);
        frame.setTitle("Student Registration Form");
        frame.setLayout(null);
        frame.setBackground(new Color(200, 200, 255));
        
        JPanel form = new JPanel();
        form.setBounds(10, 10, 930, 610);
        form.setLayout(null);
        form.setBackground(new Color(100, 120, 255));
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

        form.add(personalInfo);

        Card departmentPanel = new Card("Department",470, 30, 450, 70);
        
        JLabel department = new JLabel("Department: ");
        department.setBounds(10, 20, 100, 30);
        departmentPanel.add(department);
        String[] departments = {"Computer Science", "Software Engineering", "Electirical Power and Control Engineering", "Electronics and Communication Engineering"};
        JComboBox<String> departmentComboBox = new JComboBox<>(departments);
        departmentComboBox.setBounds(110, 20, 320, 30);
        departmentPanel.add(departmentComboBox);
        form.add(departmentPanel);
        
        Card programmingSkillsPanel = new Card("Programming Skills (Select all that apply)",470, 110, 450, 220);

        JPanel languagesList = new JPanel();
        languagesList.setBounds(5, 20, 440, 195);
        languagesList.setLayout(null);
        
        String[] programmingLanguages = {"Java", "C++", "Python", "JavaScript", "Other"};

        for (int i = 0; i < programmingLanguages.length; i++){
            JCheckBox checkBox = new JCheckBox(programmingLanguages[i]);
            checkBox.setBounds(10, 20 + i * 35, 100, 30);
            languagesList.add(checkBox);
        }
        
        JTextField otherInput = new JTextField(20);
        otherInput.setBounds(115, 160, 320, 30);
        languagesList.add(otherInput);
        programmingSkillsPanel.add(languagesList);
        form.add(programmingSkillsPanel);

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

        form.add(courseSelection);

        Card addressCard = new Card("Address", 520, 340, 400, 200);
        JTextArea addressInput = new JTextArea();
        addressInput.setBounds(10, 30, 380, 150);
        addressCard.add(addressInput);

        form.add(addressCard);
        Card buttonsCard = new Card(null, 300, 550, 340, 50);

        JButton submitButton = new JButton("📄 Submit");
        submitButton.setBounds(10, 10, 100, 30);   
        submitButton.setBackground(new Color(50, 60, 230));
        submitButton.setForeground(new Color(255, 255, 255));
        buttonsCard.add(submitButton);
        JButton clearButton = new JButton("🖋️  Clear");
        clearButton.setBounds(120, 10, 100, 30);
        clearButton.setBackground(new Color(240, 245, 0));
        buttonsCard.add(clearButton);
        form.add(buttonsCard);
        JButton exitButton = new JButton("❌  Exit");
        exitButton.setBounds(230, 10, 100, 30);
        exitButton.setForeground(new Color(255, 255, 255));
        exitButton.setBackground(new Color(240, 20, 10));
        buttonsCard.add(exitButton);

        frame.add(form);
        exitButton.addActionListener(e -> System.exit(0));  
        
        submitButton.addActionListener(e -> {
            ArrayList<String> selectedLanguages = new ArrayList<>();
            ArrayList<String> selectedCourses = new ArrayList<>();
            
            for (Component comp : languagesList.getComponents()){
                if(comp instanceof JCheckBox){
                    if(((JCheckBox) comp).isSelected() && ((JCheckBox) comp).getText().equals("Other")){
                        String otherlanguage = otherInput.getText();
                        if(!otherlanguage.isEmpty()) selectedLanguages.add(otherlanguage);
                    }
                    else if(((JCheckBox) comp).isSelected()){
                        String SelectedLanguage = ((JCheckBox) comp).getText();
                        selectedLanguages.add(SelectedLanguage);
                    }
                }
            }
            for (Component comp : courseList.getComponents()) {
                if(((JCheckBox) comp).isSelected()){
                    String selectedCourse = ((JCheckBox) comp).getText();
                    selectedCourses.add(selectedCourse);
                }
            }

            String message = "Name: " + namePanel.getUserInput() + "\n" +
                             "Student ID: " + idPanel.getUserInput() + "\n" +
                             "Password: " + passwordPanel.getUserInput() + "\n" +
                             "Gender: " + genderPanel.getUserInput() + "\n" +
                             "Birth Date: " + birthdayPanel.getUserInput() + "\n" +
                             "Email: " + emailPanel.getUserInput() + "\n" +
                             "Phone: " + phonePanel.getUserInput() + "\n" +
                             "Programming Skills: " + String.join(", ", selectedLanguages) + "\n" +
                             "Department: " + (String) departmentComboBox.getSelectedItem() + "\n" +
                             "Selected Courses: " + String.join(", ", selectedCourses) + "\n" +
                             "Address: " + addressInput.getText();
            JOptionPane.showMessageDialog(frame, message, "Registration Details", JOptionPane.INFORMATION_MESSAGE);
        });

        clearButton.addActionListener(e -> {
            namePanel.clearInput();
            idPanel.clearInput();
            passwordPanel.clearInput();
            genderPanel.clearInput();
            birthdayPanel.clearInput();
            emailPanel.clearInput();
            phonePanel.clearInput();

            for (Component comp : languagesList.getComponents()){
                if(comp instanceof JCheckBox){
                    if(((JCheckBox) comp).isSelected() && ((JCheckBox) comp).getText().equals("Other")){
                        ((JCheckBox) comp).setSelected(false);
                    }
                    else if(((JCheckBox) comp).isSelected()){
                        ((JCheckBox) comp).setSelected(false);;
                    }
                    otherInput.setText("");
                }
            }
            for (Component comp : courseList.getComponents()) {
                if(((JCheckBox) comp).isSelected()){
                    ((JCheckBox) comp).setSelected(false);
                }
            }

        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}