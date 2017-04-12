
package mainprojectapplication;

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
    
//    public WifiSetupClass() {
//        
        // Creates a process set to null and executes the commands in the Strings
//        try {
//            Process ProcWlanProfile = null;
//            Process ProcSetUsernamePassword = null;
//            ProcWlanProfile = Runtime.getRuntime().exec(CreateWLANProfile);
//            ProcSetUsernamePassword = Runtime.getRuntime().exec(SetUsernamePassword);
//        } 
//        
//        //catches IOExceptions and logs them
//        catch (IOException ex) {
//            Logger.getLogger(WifiSetupClass.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}