/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprojectapplication;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tmcgee
 */
public class FlushDNSClass {

    FlushDNSClass() {
        
        String FlushDNS = "cmd.exe /c start cmd.exe /c start ipconfig /flushdns";
        String RegisterDNS = "cmd.exe /c start cmd.exe /c start ipconfig /registerdns";
        String Release = "cmd.exe /c start cmd.exe /c start ipconfig /release";
        String Renew = "cmd.exe /c start cmd.exe /c start ipconfig /renew";
//creates Strings to Release and Renew IP aswell as Flush and re-register the DNS
        Process p = null;
        try {
// Executes All String Commands

            p = Runtime.getRuntime().exec(FlushDNS);
            p = Runtime.getRuntime().exec(RegisterDNS);
            p = Runtime.getRuntime().exec(Release);
            p = Runtime.getRuntime().exec(Renew);
            

            //runs null 
        } catch (IOException ex) {
            //catches IO Exceptions
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(FlushDNSClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
