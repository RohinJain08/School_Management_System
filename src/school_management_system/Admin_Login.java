package school_management_system;

import java.awt.*;        
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;

import java.sql.*; 
import java.awt.event.*;

class Admin_Login extends JFrame implements ActionListener {

	JLabel label1,label2,label3,success,l1,l2,l3,l4,l5,l6,l7,l8;
	JButton signOut,button1,button2,button3,button4,button5,button6,button7;
	JButton b1;
	TextField t8;
	JDialog dialog1,dialog2;
	JTextField t1,t2,t3,t4,t5,t6,t7;
		
	String id,fname,lname,gender,age,contact,email,password;
	
	Admin_Login()
	{	 
		  setLayout(null);
		  setVisible(true);
		  setTitle("ADMIN LOGIN");
		  setSize(650,750);
		  setLocation(410, 60);
		  getContentPane().setBackground(new Color(245,245,245));
		  setResizable(false);
		  
		  
		  
		  Icon icon = new ImageIcon("admin.jpg");
		  label1 = new JLabel(icon);
		  label1.setBounds(250,10,150,150);
		  add(label1);
		  	  
		  signOut = new JButton("LOGOUT");
		  signOut.setBounds(255,650,120,30);
		  signOut.setBackground(Color.BLUE); 
		  signOut.setForeground(Color.WHITE);
		  signOut.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18)); 
		  signOut.setBorderPainted(false); 
		  signOut.setFocusPainted(false); 
		  add(signOut);
		  
		  signOut.addActionListener(this);
		  
		  button1 = new JButton("ADD INSTRUCTOR");
		  button1.setBounds(220,220,200,30);
		  button1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14)); 
		  add(button1);
		  button1.addActionListener(this);
		  
		  button2 = new JButton("VIEW INSTRUCTOR");
		  button2.setBounds(220,280,200,30);
		  button2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14)); 
		  add(button2);
		  button2.addActionListener(this);
		  
		  button3 = new JButton("UPDATE INSTRUCTOR");
		  button3.setBounds(220,340,200,30);
		  button3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14)); 
		  add(button3);
		  button3.addActionListener(this);
		  
		  button4 = new JButton("VIEW STUDENTS");
		  button4.setBounds(220,400,200,30);
		  button4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14)); 
		  add(button4);
		  button4.addActionListener(this);
		  
		  button5 = new JButton("COURSES & SUBJECTS");
		  button5.setBounds(220,460,200,30);
		  button5.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14)); 
		  add(button5);
		  button5.addActionListener(this);
		  
		  button6 = new JButton("MANAGE SCHEDULES");
		  button6.setBounds(220,520,200,30);
		  button6.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14)); 
		  add(button6);
		  button6.addActionListener(this);
		  
		  button7 = new JButton("TRANSACTIONS");
		  button7.setBounds(220,580,200,30);
		  button7.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14)); 
		  add(button7);
		  button7.addActionListener(this);
	
		  
		  l1 = new JLabel("Instructor ID :");
	      l1.setBounds(50,20,140,25);
	      l1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16)); 
	      
	      l2 = new JLabel("First Name :");
	      l2.setBounds(50,60,140,25);
	      l2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
	      
	      l3 = new JLabel("Last Name :");
	      l3.setBounds(50,100,140,25);
	      l3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
	      
	      l4 = new JLabel("Gender :");
	      l4.setBounds(50,140,140,25);
	      l4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
	      
	      l5 = new JLabel("Age :");
	      l5.setBounds(50,180,140,25);
	      l5.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
	      
	      l6 = new JLabel("Contact No :");
	      l6.setBounds(50,220,140,25);
	      l6.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
	      
	      l7 = new JLabel("Email-ID :");
	      l7.setBounds(50,260,140,25);
	      l7.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
	      
	      l8 = new JLabel("Password :");
	      l8.setBounds(50,300,100,25);
	      l8.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
	      
	      
	      t1 = new JTextField();
	      t1.setBounds(150,20,150,25);
	      t1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
	     
	      t2 = new JTextField();
	      t2.setBounds(150,60,150,25);
	      t2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
	      
	      t3 = new JTextField();
	      t3.setBounds(150,100,150,25);
	      t3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
	      
	      t4 = new JTextField();
	      t4.setBounds(150,140,150,25);
	      t4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
	      
	      t5 = new JTextField();
	      t5.setBounds(150,180,150,25);
	      t5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
	      
	      t6 = new JTextField();
	      t6.setBounds(150,220,150,25);
	      t6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
	      
	      t7 = new JTextField();
	      t7.setBounds(150,260,150,25);
	      t7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
	      
	      t8 = new TextField();
	      t8.setBounds(150,300,150,25);
	      t8.setEchoChar('●');
	      t8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
	      
	      b1 = new JButton("SUBMIT");
		  b1.setBounds(190,400,120,30);
		  b1.setBackground(Color.BLUE); 
		  b1.setForeground(Color.WHITE);
		  b1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18)); 
		  b1.setBorderPainted(false); 
		  b1.setFocusPainted(false); 
		  b1.addActionListener(this);
		       
		  success = new JLabel("* Instructor Added Successfully!"); 
	      success.setBounds(50,335,500, 20);                       
	      success.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
	      success.setForeground(Color.red);                         
	      success.setVisible(false);                                
      	     	      	      	            			 	  
	}	
	
	public void actionPerformed(ActionEvent e)  
	  { 
	  
		if (e.getSource() == signOut )
		{     
     		 setVisible(false);
			 	     
		}
		
		if(e.getSource() == button1)
		{
			dialog1 = new JDialog(this,"ADD INSTRUCTOR"); 
		    dialog1.setVisible(true); 
		    dialog1.setSize(500,500); 
		    dialog1.setLocation(500,200);
		    dialog1.getContentPane().setBackground(Color.white); 
		    dialog1.setLayout(null);
		    dialog1.setResizable(false);
			
			dialog1.add(l1);
		    dialog1.add(l2);
		    dialog1.add(l3);
		    dialog1.add(l4);
		    dialog1.add(l5);
		    dialog1.add(l6);
		    dialog1.add(l7);
		    dialog1.add(l8);
		    
			dialog1.add(t1);
			dialog1.add(t2);
			dialog1.add(t3);
			dialog1.add(t4);
			dialog1.add(t5);
			dialog1.add(t6);
			dialog1.add(t7);
			dialog1.add(t8);
			
			dialog1.add(b1);
			dialog1.add(success);
		}
		
		
		if(e.getSource() == button2)
		
		{
			  JTable jt;
		      JScrollPane jsp;
		      DefaultTableModel model;
		     
		      String column[] = {"INST-ID", "FIRST NAME","LAST NAME","GENDER" ,"AGE","PHONE NO.","EMAIL-ID","PASSWORD"};
		      String data[][] = { {"", "", "","","","","",""} };
		      
		   
		    	  
			  dialog2 = new JDialog(this,"VIEW INSTRUCTOR LIST"); 
		      dialog2.setSize(700,300); 
		      dialog2.setLocation(500,200);
		      dialog2.getContentPane().setBackground(Color.white); 
		      dialog2.setLayout(null);
		      dialog2.setVisible(true);
		      dialog2.setResizable(false);
		      
		      label3 = new JLabel("INSTRUCTOR DETAILS");
			  label3.setBounds(200,25,450,30);
			  label3.setFont(new Font(Font.DIALOG,Font.BOLD, 24)); 
			  label3.setForeground(Color.RED);
			  dialog2.add(label3);
		      
		      model = new DefaultTableModel(data, column);
		      jt = new JTable(model);
		        
		      jsp = new JScrollPane(jt);
		      jsp.setVisible(true);
		      jsp.setBounds(45,100,600,130);
		      dialog2.add(jsp);
		        
		      jt.setCellSelectionEnabled(false);
		      jt.setEnabled(false);
		      
		 	 
	            try {

	            	Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/school_management_system", "root","root");
	                Statement stmt = conn.createStatement();

	                ResultSet rs = stmt.executeQuery("select * from instructor");

	                while (rs.next()) 
	                {
	                    String newData[] = { String.valueOf(rs.getString(1)), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)};
	                    model.addRow(newData);
	                }
	                                
	                conn.close();
	            } 
	            catch (Exception evt) 
	            {
	                System.out.println(evt);
	            }
	        }
		

		if(e.getSource() == button3)
		{			}  	        
		

		if(e.getSource() == button4)
		{    		} 
		
		if(e.getSource() == button5)
		{       	} 
      
		if(e.getSource() == button6)
		{   		} 
		if(e.getSource() == button7)
		{   		} 
		
			
		if(e.getSource() == b1)
		
		{
			 id = t1.getText();
			 fname = t2.getText();
			 lname = t3.getText();
			 gender = t4.getText();
			 age = t5.getText();
			 contact = t6.getText();
			 email = t7.getText();
			 password =t8.getText();
			 
			try 
		      {
				 				 
		    	 Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/school_management_system", "root","root");
		        
		    	 String query = "INSERT INTO instructor(Instructor_ID,First_Name,Last_Name,Gender,Age,Contact_No,Email_Id,Password)"+"VALUES(?,?,?,?,?,?,?,?)";
		    	 		                             
		         
				 PreparedStatement stmt = conn.prepareStatement(query);
				 stmt.setString(1,id);
				 stmt.setString(2,fname);
				 stmt.setString(3,lname);
				 stmt.setString(4,gender);		
				 stmt.setString(5,age);	
				 stmt.setString(6,contact);	
				 stmt.setString(7,email);	
				 stmt.setString(8,password);	
								
				 stmt.executeUpdate();      
			     conn.close();
			     
			     success.setText("* Instructor Added Successfully!");
			     success.setVisible(true);
			    
			     t1.setText("");
			     t2.setText("");
			     t3.setText("");
			     t4.setText("");
			     t5.setText("");
			     t6.setText("");
			     t7.setText("");
			     t8.setText("");
			     			     
	          } 
			
	         catch (SQLException ex)
	        {    
	        	 success.setVisible(true);
	             success.setText("\n=> " + ex.getMessage());
	            
	        }
		}
		
		
	  }
}

