
package mainprojectapplication;

import com.sun.xml.internal.ws.api.ResourceLoader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jeffrey Thompson
 */

public class WifiSetupClass {
    
    static final String StudentFilepath = "C:\\Wi-Fi-Student.xml";
    static final String StaffFilepath = "C:\\Wi-Fi-Staff.xml";
    static final String Campus_UserFilepath = "C:\\Wi-Fi-Campus_User.xml";
    static String CreateWLANStudent = "cmd.exe /c netsh wlan add profile filename=" + StudentFilepath;
    static String CreateWLANStaff = "cmd.exe /c netsh wlan add profile filename=" + StaffFilepath;
    static String CreateWLANCampus_User = "cmd.exe /c netsh wlan add profile filename=" + Campus_UserFilepath;
    static String SetUsernamePassword;
    
//    public WifiSetupClass extends MainJFrame(){
//        if (MainJFrame.jRadioButtonStudent.isSelected()){
//        
//            //takes the Wi-Fi-Student.xml file within the jar and extracts it to a temporary location for use - incomplete feature
//            //currently all xml files must be placed in the root of the c: to run correctly
//            InputStream resourceAsStream = ResourceLoader.class.getResourceAsStream("/src/main/resource‌​s/Wi-Fi-Student.xml‌​");
//            WifiSetupClass WS;
//            WS = new WifiSetupClass();
//            Process p = null;
//            //tries to execute the netsh command to add the WLAN profile
//            try {
//                p = Runtime.getRuntime().exec(WifiSetupClass.CreateWLANStudent);
//            } 
//            catch (IOException ex) {
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    
//        if (MainJFrame.jRadioButtonStaff.isSelected()){
//        
//            //takes the Wi-Fi-Staff.xml file within the jar and extracts it to a temporary location for use - incomplete feature
//            //currently all xml files must be placed in the root of the c: to run correctly
//            InputStream resourceAsStream = ResourceLoader.class.getResourceAsStream("/src/main/resource‌​s/Wi-Fi-Staff.xml‌​");
//            Files.copy(resourceAsStream, "c:/", REPLACE_EXISTING);
//            WifiSetupClass WS;
//            WS = new WifiSetupClass();
//            Process p = null;
//            //tries to execute the netsh command to add the WLAN profile
//            try {
//                p = Runtime.getRuntime().exec(WifiSetupClass.CreateWLANStaff);
//            } 
//            catch (IOException ex) {
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//     
//        if (MainJFrame.jRadioButtonCampus_User.isSelected()){
//            
//            //takes the Wi-Fi-Campus_User.xml file within the jar and extracts it to a temporary location for use - incomplete feature
//            //currently all xml files must be placed in the root of the c: to run correctly
//            InputStream XMLAsStream = ResourceLoader.class.getResourceAsStream("/src/main/resource‌​s/Wi-Fi-Campus_User.xml‌​");
//            Files.copy(XMLAsStream, "c:\\", REPLACE_EXISTING);
//            WifiSetupClass WS;
//            WS = new WifiSetupClass();
//            Process p = null;
//            //tries to execute the netsh command to add the WLAN profile
//            try {
//                p = Runtime.getRuntime().exec(WifiSetupClass.CreateWLANCampus_User);
//            } 
//            catch (IOException ex) {
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
}