import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SignUp extends JFrame implements ActionListener {
   JLabel hello = new JLabel("Welcome to Everyday!");
   JTextField name2 = new JTextField("Name", 20);
   JTextField email2 = new JTextField("E-mail", 20);
   JPasswordField pass = new JPasswordField("Password", 20);
   JPasswordField cpass = new JPasswordField("Confirm Password", 20);
   
   String user;    
   String mail;
   String password;
   String password2;
   
   JButton signup1 = new JButton("Sign Up");
   
   PasswordFileManager passwordManager;
       
   public SignUp() {
      super("Everyday Sign Up");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setSize(500, 500);
      setLocation(400, 250);
      GridBagLayout a = new GridBagLayout();
      GridBagConstraints b = new GridBagConstraints();
      setLayout(a);
      b.gridx = 0;
      b.gridy = 0;
      add(hello,b);
      b.gridx = 0;
      b.gridy = 1;
      add(name2,b);
      b.gridx = 0;
      b.gridy = 2;
      add(email2,b);
      b.gridx = 0;
      b.gridy = 3;
      add(pass,b);
      b.gridx = 0;
      b.gridy = 4;
      add(cpass,b);
      b.gridx = 0;
      b.gridy = 5;
      add(signup1,b);
      signup1.addActionListener(this);
      setVisible(true);
      
      passwordManager = new PasswordFileManager();
      
       
   }
        public void actionPerformed(ActionEvent e) {
      if(e.getSource() == signup1) {
         user = name2.getText();
         mail = email2.getText();
         char[] passwordchar = pass.getPassword();
         char[] passwordchar2 = cpass.getPassword();
         password = new String(passwordchar);
         password2 = new String(passwordchar2);
         if(password.equals(password2)) { 
            JOptionPane.showMessageDialog(signup1, "Registration Successful");
           
            setVisible(false);
         }
         else { 
            JOptionPane.showMessageDialog(signup1, "Passwords do not match");
         }
         try {
            passwordManager.createNewUser(user, password); 
         }
         catch (Exception exc) {
         } 
      }
   }

   public static void main(String[] args) {
      SignUp l = new SignUp();
   }
}
