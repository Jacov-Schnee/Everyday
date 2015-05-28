import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

class Login extends JFrame implements ActionListener {
 
   JTextField username = new JTextField("Username", 15);
   JPasswordField password = new JPasswordField("Password", 15);
   JButton login = new JButton("Login");
   JButton signup = new JButton("New? Sign Up Here");
   JLabel status = new JLabel("Not logged in"); 
   
   public boolean successful = false;
   
   SignUp signUp;
   PasswordFileManager passwordManager;
   EverydayFrame everydayGUI;
   String user;
       
   public Login(){
      super("Everyday Login");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setSize(500, 500);
      setLocation(400, 250);
      GridBagLayout g = new GridBagLayout();
      GridBagConstraints c = new GridBagConstraints();
      setLayout(g);
      c.gridx = 0;
      c.gridy = 1;
      add(username,c);
      c.gridx = 0;
      c.gridy = 2;
      add(password,c);
      c.gridx = 0;
      c.gridy = 3;
      add(login,c);
      c.gridx = 0;
      c.gridy = 0;
      add(status,c);
      c.gridx = 0;
      c.gridy = 4;
      add(signup,c);
      login.addActionListener(this);
      signup.addActionListener(this);
      setVisible(true);
      }
   public void actionPerformed2(ActionEvent e) {
      if(e.getSource() == signup) {
         System.out.println("Sign-up button clicked");
         signUp = new SignUp();
                  }
      }
   public void actionPerformed(ActionEvent e){
      if(e.getSource() == login) {
         passwordManager = new PasswordFileManager();
         String user = username.getText();
         String pass = password.getText();
         try {
         if(passwordManager.confirmUser(user, pass)) {
           status.setText("Logged in");
           setVisible(false);         
            // To Do: If logged in open new window with main program and close log in window
            // Edit: Found a cheat way of doing this, probably need to change version again
           successful=true;
           everydayGUI = new EverydayFrame(user);
           everydayGUI.setVisible(true);
         }
         else { 
            status.setText("Password or Username is incorrect");
         }
         } catch (Exception exc) {}

      }
      else if(e.getSource() == signup) {
         signUp = new SignUp();
         //setVisible(false);
      }
   }
   
   public static void main(String[] args){
        new Login();
      }
  }     
  
