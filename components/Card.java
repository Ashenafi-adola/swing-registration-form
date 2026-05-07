/*
a card to remove the repeatitive boxes on the form with different sizes
*/

package components;

import javax.swing.*;
import java.awt.*;
//defined a class that inheretes from built in swing JPanel to customize it
public class Card extends JPanel {
    public Card(String title, int x, int y, int w, int h){
        this.setBounds(x, y, w, h);
        this.setBackground(new Color(245, 245, 255));
        this.setLayout(null);
        JLabel label = new JLabel(title);
        label.setBounds(10, -5, 200, 30);
        this.add(label);
    }
}
