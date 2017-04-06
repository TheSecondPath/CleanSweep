
package mainprojectapplication;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WifiSetupClass {
    
    String CreateWLANProfile;
    String SetSecurityParameter;
    
    public WifiSetupClass() {
        this.CreateWLANProfile = "cmd.exe netsh wlan set hostednetwork mode=allow ssid=Campus_User";
        this.SetSecurityParameter = "cmd.exe netsh wlan set profileparameter name=Campus_User "
                + "authentication=WPA2PSK encryption=aes userOnly";
    
        // Creates a process set to null and executes the commands in the Strings
        Process proc = null;
        try {
            proc = Runtime.getRuntime().exec(CreateWLANProfile);
            proc = Runtime.getRuntime().exec(SetSecurityParameter);
        } 
        
        //catches IOExceptions and logs them
        catch (IOException ex) {
            Logger.getLogger(WifiSetupClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}