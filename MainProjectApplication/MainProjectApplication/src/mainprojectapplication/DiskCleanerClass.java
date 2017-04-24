
package mainprojectapplication;

import java.awt.AWTException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tmcgee
 */
public class DiskCleanerClass {
    
    DiskCleanerClass() throws AWTException{
       
        String Renew ="cmd.exe /c cleanmgr /sagerun:1";
        Process p = null;
       
        try {
// Executes All String Commands

            
            p = Runtime.getRuntime().exec(Renew);

            //runs null 
        } catch (IOException ex) {
            //catches IO Exceptions
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(FlushDNSClass.class.getName()).log(Level.SEVERE, null, ex);
        
    
    }
}
}
