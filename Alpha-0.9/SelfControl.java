import javax.script.*;
import java.lang.Runtime;

public class SelfControl { 
   public void SelfControl() throws Throwable{
   // Apple script command
      String script = "tell application \"SelfControl\" to activate \n";
      script+= "tell application \"SelfControl\" to set miniaturized of first window to true \n";
      script+= "tell application \"System Events\" \n";
      script+= "set position of first window of application process \"SelfControl\" to {750, 750} \n";
      script+= "tell process \"SelfControl\"\n";
		
      script+= "tell slider of window \"SelfControl\" to set value to 60 \n";
		
      script+= "click button \"Start\" of window \"SelfControl\"\n";
	
      script+= "end tell \n";
      script+= "end tell \n";
        
      ScriptEngineManager mgr = new ScriptEngineManager();
      ScriptEngine engine = mgr.getEngineByName("AppleScript");
      engine.eval(script);
      }
 
   public void Blacklist() throws Throwable{
      String script = "tell application \"SelfControl\" to activate \n";
      script+= "tell application \"SelfControl\" to set miniaturized of first window to true \n";
      script+= "tell application \"System Events\" \n";
      script+= "set position of first window of application process \"SelfControl\" to {750, 750} \n";
      script+= "tell process \"SelfControl\"\n";
				
      script+= "click button \"Edit Blacklist\" of window \"SelfControl\"\n";
	
      script+= "end tell \n";
      script+= "end tell \n";
        
      ScriptEngineManager mgr = new ScriptEngineManager();
      ScriptEngine engine = mgr.getEngineByName("AppleScript");
      engine.eval(script);

      
   }
}


