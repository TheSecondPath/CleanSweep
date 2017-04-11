
package mainprojectapplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jeffrey Thompson
 */

public class WifiSetupClass {
    
    static final String FILENAME = "J:\\Wi-Fi-Campus_User.xml";
    String CreateWLANProfile = "cmd.exe /c netsh wlan add profile filename=" + FILENAME;
    String SetUsernamePassword;
    
    public WifiSetupClass() {
        
        // Creates a process set to null and executes the commands in the Strings
        try {
            Process ProcWlanProfile = null;
            Process ProcSetUsernamePassword = null;
            ProcWlanProfile = Runtime.getRuntime().exec(CreateWLANProfile);
            ProcSetUsernamePassword = Runtime.getRuntime().exec(SetUsernamePassword);
        } 
        
        //catches IOExceptions and logs them
        catch (IOException ex) {
            Logger.getLogger(WifiSetupClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}