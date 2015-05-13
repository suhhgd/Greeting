package sg.edu.nus.iss.club;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*; 

public class RadioApp extends JFrame implements ActionListener{

	JRadioButton rb1,rb2;  //components
    ButtonGroup bg;
    RadioApp()
{
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    rb1=new JRadioButton("male");
    rb2=new JRadioButton("female");

    //add radio button to button group
   // bg=new ButtonGroup();
   // bg.add(rb1);
  //  bg.add(rb2);

    //add radio buttons to frame,not button group
    add(rb1);
    add(rb2);
    //add action listener to JRadioButton, not ButtonGroup
    rb1.addActionListener(this);
    rb2.addActionListener(this);
    pack();
    setVisible(true);
}
public static void main(String[] args)
{
    new RadioApp(); //calling constructor
}
@Override
public void actionPerformed(ActionEvent e) 
{
    System.out.println(((JRadioButton) e.getSource()).getActionCommand());
}
}