import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
//import java.awt.Font;
//import javax.swing.JTextArea;


public class Inscription extends JFrame implements ActionListener
{
    int middle_panel_height = 30;
    int middle_panel_width = 150;

    JPanel panel_global = new JPanel();

    JPanel panel_header = new JPanel();
    JPanel panel_main = new JPanel();
    JPanel panel_left = new JPanel();
    JPanel panel_right = new JPanel();
    JPanel panel_bottom = new JPanel();

    JLabel label_title = new JLabel();
    JLabel label_surname = new JLabel();
    JLabel label_birth = new JLabel();
    JLabel label_name = new JLabel();

    JTextField zone_surname = new JTextField(10);
    JTextField zone_birth = new JTextField(10);
    JTextField zone_name = new JTextField(10);

    JButton press = new JButton();

    
    Inscription() 
    {
        this.setVisible(true);
        this.setSize(455, 160);
        this.setTitle("Hello");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel_global);

        panel_global.setLayout(new BorderLayout());
        panel_global.add(panel_header, BorderLayout.NORTH);
        panel_global.add(panel_main, BorderLayout.CENTER);
        panel_global.add(panel_left, BorderLayout.WEST);
        panel_global.add(panel_right, BorderLayout.EAST);
        panel_global.add(panel_bottom, BorderLayout.SOUTH);
        
        panel_header.setBackground(Color.blue);
        panel_header.add(label_title);

        panel_main.setBackground(Color.LIGHT_GRAY);
        panel_main.setPreferredSize(new Dimension(middle_panel_width, middle_panel_height));
        panel_main.add(label_birth);
        panel_main.add(zone_birth);

        panel_left.setBackground(Color.LIGHT_GRAY);
        panel_left.setPreferredSize(new Dimension(middle_panel_width, middle_panel_height));
        panel_left.add(label_surname);
        panel_left.add(zone_surname);

        panel_right.setBackground(Color.LIGHT_GRAY);
        panel_right.setPreferredSize(new Dimension(middle_panel_width, middle_panel_height));
        panel_right.add(label_name);
        panel_right.add(zone_name);

        panel_bottom.setBackground(Color.LIGHT_GRAY);
        panel_bottom.add(press);

        label_title.setText("Inscription");
        label_title.setForeground(Color.black);
        label_surname.setText("Votre nom:");
        label_name.setText("Votre prénom:");
        label_birth.setText("Année de naissance:");

        press.setText("PRESS");
        press.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == press)
        {
            System.out.println("Nom: " + zone_name.getText() + " " + zone_surname.getText());
            System.out.println("Age: " + (2022 - Integer.parseInt(zone_birth.getText())));    
        }
        
    }
}
