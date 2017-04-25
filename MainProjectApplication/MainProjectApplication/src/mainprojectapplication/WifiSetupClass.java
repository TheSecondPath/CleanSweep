
package mainprojectapplication;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Jeffrey Thompson
 */

public class WifiSetupClass {

    static String StudentInputPath = ("Wi-Fi-Student.xml");
    static String StaffInputPath = ("Wi-Fi-Staff.xml");
    static String Campus_UserInputPath = ("Wi-Fi-Campus_User.xml");
    String StringTempDir = System.getProperty("java.io.tmpdir");
    Path StudentTempDir = Paths.get(StringTempDir + StudentInputPath);
    Path StaffTempDir = Paths.get(StringTempDir + StaffInputPath);
    Path Campus_UserTempDir = Paths.get(StringTempDir + Campus_UserInputPath);
//    static final String StudentFilepath = "C:\\Wi-Fi-Student.xml";
//    static final String StaffFilepath = "C:\\Wi-Fi-Staff.xml";
//    static final String Campus_UserFilepath = "C:\\Wi-Fi-Campus_User.xml";
//    static String CreateWLANCampus_User = "cmd.exe /c netsh wlan add profile filename=" + "\\" + Campus_UserInputPath;
//    static String CreateWLANStudent = "cmd.exe /c netsh wlan add profile filename=" + "\\" + StudentInputPath;
//    static String CreateWLANStaff = "cmd.exe /c netsh wlan add profile filename=" + "\\" + StaffInputPath;

    
//    public WifiSetupClass() 
//        if (MainJFrame.jRadioButtonStudent.isSelected()){
//        
//            //takes the Wi-Fi-Student.xml file within the jar and extracts it to a temporary location for use - incomplete feature
//            //currently all xml files must be placed in the root of the c: to run correctly
//            WifiSetupClass WS;
//            WS = new WifiSetupClass();
//            Process p = null;
//            //tries to execute the netsh command to add the WLAN profile
//            try {
//                p = Runtime.getRuntime().exec(WifiSetupClass.CreateWLANStudent);
//            } 
//            catch (IOException ex) {
//            System.out.println("Error " + ex.getMessage());    
//            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    
//        if (MainJFrame.jRadioButtonStaff.isSelected()){
//        
//            //takes the Wi-Fi-Staff.xml file within the jar and extracts it to a temporary location for use - incomplete feature
//            //currently all xml files must be placed in the root of the c: to run correctly
//            Files.copy(resourceAsStream, "c:/", REPLACE_EXISTING);
//            WifiSetupClass WS;
//            WS = new WifiSetupClass();
//            Process p = null;
//            //tries to execute the netsh command to add the WLAN profile
//            try {
//                p = Runtime.getRuntime().exec(WifiSetupClass.CreateWLANStaff);
//            } 
//            catch (IOException ex) {
//                System.out.println("Error " + ex.getMessage());
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//     
//        if (MainJFrame.jRadioButtonCampus_User.isSelected()){
//            
//            //takes the Wi-Fi-Campus_User.xml file within the jar and extracts it to a temporary location for use - incomplete feature
//            //currently all xml files must be placed in the root of the c: to run correctly
//            Files.copy(XMLAsStream, "c:\\", REPLACE_EXISTING);
//            WifiSetupClass WS;
//            WS = new WifiSetupClass();
//            Process p = null;
//            //tries to execute the netsh command to add the WLAN profile
//            try {
//                p = Runtime.getRuntime().exec(WifiSetupClass.CreateWLANCampus_User);
//            } 
//            catch (IOException ex) {
//                System.out.println("Error " + ex.getMessage());
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
}