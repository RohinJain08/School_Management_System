package school_management_system;

import java.awt.*;      
import javax.swing.*; 
import java.sql.*; 
import java.awt.event.*;

public class Login_Page extends JFrame implements ActionListener 
{
	JLabel topScreen,label1,label2,label3,label4,label5,signIn,error;
	JTextField userName;
	JPasswordField password;
	JButton button;
	String admin_username = "admin123@outlook.com", admin_password = "admin"; 
	Choice user_type;
	
	Login_Page()
	
	{
		 
		  Icon icon = new ImageIcon("icon.png");
		  label1 = new JLabel(icon);
		  label1.setBounds(240,10,200,200);
		  add(label1);
		  
		  label2 = new JLabel("SCHOOL MANAGEMENT SYSTEM");
		  label2.setBounds(150,220,450,50);
		  label2.setFont(new Font(Font.DIALOG,Font.BOLD, 24)); 
		  label2.setForeground(Color.RED);
		  add(label2);
	      
	      
	      label3 = new JLabel("LOGIN PAGE");
	      label3.setBounds(280, 300, 150, 30); 
	      label3.setFont(new Font(Font.SANS_SERIF,Font.BOLD, 18)); 
	      add(label3); 
	      
	      label3 = new JLabel("Username : ");
	      label3.setBounds(175,360,120, 80); 
	      label3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16)); 
	      add(label3);
	      
	      userName = new JTextField(""); 
	      userName.setBounds(275, 385, 180, 30); 
	      userName.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
	      userName.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY)); 
	      add(userName); 
	      
	      label4 = new JLabel("Password : ");
	      label4.setBounds(175,425,120, 80); 
	      label4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16)); 
	      add(label4);
	      
	      password = new JPasswordField(); 
	      password.setBounds(275, 450, 180, 30);
	      password.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
	      password.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY)); 
          add(password); 
          
          label5 = new JLabel("LOGIN TYPE : ");
	      label5.setBounds(195,520,120, 80); 
	      label5.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16)); 
	      add(label5);
	      
          user_type = new Choice();
          user_type.setBounds(315,550,125,40);
          user_type.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
          add(user_type);
          
          
          user_type.add("< Select User >");
          user_type.add("Administrator");
          user_type.add("Instructor");
          user_type.add("Student");
          
	      
          button = new JButton("LOGIN"); 
          button.setBounds(280, 670, 100, 30);
          button.setBackground(Color.BLUE); 
          button.setForeground(Color.WHITE);
          button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18)); 
          button.setBorderPainted(false); 
          button.setFocusPainted(false);          
          add(button);
          
          button.addActionListener(this);
          
          error = new JLabel("* Incorrect Username or Password"); 
          error.setBounds(175,500,240, 20);
          error.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14)); 
          error.setForeground(Color.red);
          error.setVisible(false); 
          add(error); 
          
                                              
	}   
	 
 public void actionPerformed(ActionEvent e)  
  { 
	  if (e.getSource() == button ) 
	   { 
		  if(user_type.getSelectedItem() == "Administrator") 
		  {
			  if (admin_username.equals(userName.getText()) && admin_password.equals(String.valueOf(password.getPassword()))) 
			  {  
				 error.setVisible(false);
				 userName.setText("");
				 password.setText("");
				 Admin_Login frame1 = new Admin_Login();
				 
				 				 
			  }
			  else 
			    { 
			    	error.setVisible(true); 
			    	 userName.setText("");
					 password.setText("");
			    }
		  } 
		  
		  if(user_type.getSelectedItem() == "Student") 
		  {
			  try {

	            	Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/school_management_system", "root","root");
	                Statement stmt = conn.createStatement();

	                ResultSet rs = stmt.executeQuery("select Email_Id,Password from student");

	                String user = userName.getText();
	                String pass = password.getText();
	                String std_email = "";
	                String std_pass = "";
	            
	                while (rs.next()) 
	                {  
	                    std_email = rs.getString("Email_Id");
	                    std_pass = rs.getString("Password");
	                    
	                    	                    
	                    if(user.equals(std_email) && pass.equals(std_pass))
	                    {
	                       error.setVisible(false);
	       				   userName.setText("");
	       				   password.setText("");
	       				   Student_Login frame1 = new Student_Login();
	       				   	       				   	                    
	                    }
	                                        	                   	                   	 
	                    else if(user.equals(std_email) || pass.equals(std_pass))
		                 {
	                    	
	                    	error.setVisible(true);
		       			    userName.setText("");
		       			    password.setText("");
		       				   
		                 }
		                 else  
		                 {  
		                	 error.setText("* User does not exist");
					         error.setVisible(true);
			       		     userName.setText("");
			       		     password.setText("");
		       		      }
	                    
	    			    }	                    
              	                          
	                conn.close();
	            } 
	            catch (Exception evt) 
	            {
	                System.out.println(evt);
	            }
	        }
		
		  } 
	  
	  if(user_type.getSelectedItem() == "Instructor") 
	  {
		  try {

            	Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/school_management_system", "root","root");
                Statement stmt = conn.createStatement();

                ResultSet rs = stmt.executeQuery("select Email_Id,Password from instructor");

                String user = userName.getText();
                String pass = password.getText();
                String inst_email = "";
                String inst_pass = "";
            
                while (rs.next()) 
                {  
                    inst_email = rs.getString("Email_Id");
                    inst_pass = rs.getString("Password");
                    
                                     
                    if(user.equals(inst_email) && pass.equals(inst_pass))
                    {
                       
                       error.setVisible(false);
       				   userName.setText("");
       				   password.setText("");
       				   Instructor_Login frame1 = new Instructor_Login();
       				   	       				   	                    
                    }
                    else if(user.equals(inst_email) || pass.equals(inst_pass))
	                 {
                   	
                   	    error.setVisible(true);
	       			    userName.setText("");
	       			    password.setText("");
	       				   
	                 }
	                 else  
	                 {  
	                	 error.setText("* User does not exist");
				         error.setVisible(true);
		       		     
	       		      }                                       	                   	                   	 
                                                     
    			    }	                    
          	                          
                conn.close();
            } 
            catch (Exception evt) 
            {
                System.out.println(evt);
            }
        }
	
	  } 
	  	  		  
		
 public static void main(String[] args) 
 {
	Login_Page main_frame = new Login_Page(); 
	
	main_frame.setLayout(null); 
	main_frame.setSize(700,780);
	main_frame.setTitle("LOGIN PAGE"); 
	main_frame.getContentPane().setBackground(new Color(254,255,238));
	main_frame.setLocation(380, 40); 
	main_frame.setVisible(true);
	main_frame.setResizable(isDefaultLookAndFeelDecorated());
 } 
}
