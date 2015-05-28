import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.Writer;

public class PasswordFileManager {
 
   public PasswordFileManager() {
   
   };
   
   public void createNewUser(String username, String password) throws Exception {
      String path = ("/Users/CallumHafnerSchnee/Desktop/Java Programming/More Java Shtaff/text.txt");
      File f = new File(path);
      Writer output;
      output = new BufferedWriter(new FileWriter(f, true));
      output.append(username+" ");
      output.append(password);
      output.append("\n");
      output.close();
      
        
   }
   
   public boolean confirmUser(String username, String password) throws Exception {
      Scanner scan = new Scanner(new FileReader("/Users/CallumHafnerSchnee/Desktop/Java Programming/More Java Shtaff/text.txt"));
      while(scan.hasNextLine()){
         String nextLine = scan.nextLine();
         String[] lineArray = nextLine.split(" ");
         if(lineArray[0].equals(username) && lineArray[1].equals(password)) {
            System.out.println("Access granted");
            return true;
         }
         else {
            System.out.println("Sorry");
                
         }
      }
      return false;
   } 
}
     
