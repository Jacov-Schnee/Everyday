import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class GetCurrentDateAndTime {

  // String day2;    
   //String month2;
   //String year2;
   
   int day, month, year;
   
   public static String date() {
   
      int day, month, year;
   
      GregorianCalendar date = new GregorianCalendar();
 
      day = date.get(Calendar.DAY_OF_MONTH);
      month = date.get(Calendar.MONTH);
      year = date.get(Calendar.YEAR);
 
      return ""+day+"/"+(month+1)+"/"+year;
   }
}	
