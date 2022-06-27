package school_management_system;

import java.awt.*;     
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.sql.*; 
import java.awt.event.*;

public class Student_Login extends JFrame implements ActionListener {
	
	JLabel label1,label2;
	JButton signOut,button1,button2,button3,button4,button5;
	
	
	Student_Login()
	{
		
		  setLayout(null);
		  setVisible(true);
		  setTitle("STUDENT LOGIN");
		  setSize(650,660);
		  setLocation(410,100);
		  getContentPane().setBackground(new Color(245,245,245));
		  setResizable(false);
		  
		 
		  
		  Icon icon = new ImageIcon("student.jpg");
		  label1 = new JLabel(icon);
		  label1.setBounds(225,10,200,150);
		  add(label1);
		  
		  label2 = new JLabel("* WELCOME *");
		  label2.setBounds(245,170,200,50);
		  label2.setFont(new Font(Font.DIALOG,Font.BOLD, 24)); 
		  label2.setForeground(Color.BLACK);
		  add(label2);
		  
		  signOut = new JButton("LOGOUT");
		  signOut.setBounds(255,550,120,30);
		  signOut.setBackground(Color.BLUE); 
		  signOut.setForeground(Color.WHITE);
		  signOut.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18)); 
		  signOut.setBorderPainted(false); 
		  signOut.setFocusPainted(false); 
		  add(signOut);
		  
		  signOut.addActionListener(this);
		  
		  button1 = new JButton("STUDENT PROFILE");
		  button1.setBounds(220,240,200,30);
		  button1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14)); 
		  add(button1);
		  button1.addActionListener(this);
		  
		  button2 = new JButton("COURSES ENROLLED");
		  button2.setBounds(220,300,200,30);
		  button2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14)); 
		  add(button2);
		  button2.addActionListener(this);
		  
		  button3 = new JButton("VIEW MARKS");
		  button3.setBounds(220,360,200,30);
		  button3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14)); 
		  add(button3);
		  button3.addActionListener(this);
		  
		  button4 = new JButton("ATTENDANCE");
		  button4.setBounds(220,420,200,30);
		  button4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14)); 
		  add(button4);
		  button4.addActionListener(this);
		  
		  button5 = new JButton("TRANSACTIONS");
		  button5.setBounds(220,480,200,30);
		  button5.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14)); 
		  add(button5);
		  button5.addActionListener(this);
		  
	
		 	 
	}


public void actionPerformed(ActionEvent e)  
 
 { 
	if (e.getSource() == signOut )
	{     
 		 setVisible(false);		 	     
	}
	
	if(e.getSource() == button1)
	{	
		
	}		
	
	
	if(e.getSource() == button2)
	
	{           }
	

	if(e.getSource() == button3)
	{			}  	        
	

	if(e.getSource() == button4)
	{    		} 
	
	if(e.getSource() == button5)
	{       	} 
 }
}