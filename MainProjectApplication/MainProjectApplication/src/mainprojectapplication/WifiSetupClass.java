
package mainprojectapplication;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jeffrey Thompson
 */

public class WifiSetupClass {

    static String StudentFileName = ("Wi-Fi-Student");
    static String StaffFileName = ("Wi-Fi-Staff");
    static String Campus_UserFileName = ("Wi-Fi-Campus_User");
    String StringTempDir = System.getProperty("java.io.tmpdir");
    Path StudentTempDir = Paths.get(StringTempDir + StudentFileName + ".xml");
    Path StaffTempDir = Paths.get(StringTempDir + StaffFileName + ".xml");
    Path Campus_UserTempDir = Paths.get(StringTempDir + Campus_UserFileName + ".xml");

    
    public WifiSetupClass(){
//        if (jRadioButtonStudent.isSelected()){
//        
//            //takes the Wi-Fi-Student.xml file within the jar and extracts it to a temporary location for use - incomplete feature
//            //currently all xml files must be placed in the root of the c: to run correctly
//            WifiSetupClass WS;
//            WS = new WifiSetupClass();
//            Process p = null;
//            //tries to execute the netsh command to add the WLAN profile
//            try {
//                System.out.println("StringTempDir = " + WS.StringTempDir);
//                InputStream fis = null;
//
//                try {
//                    fis = (getClass().getResourceAsStream(WS.StudentFileName));
//
//                    System.out.println("Total file size to read (in bytes) : " + fis.available());
//
//                    int content;
//                    while ((content = fis.read()) != -1) {
//                        // Copies the stream to a file in the Temp folder
//                        Files.copy(fis, WS.StudentTempDir, REPLACE_EXISTING);;
//                    }
//
//                } 
//                catch (IOException e) {
//                e.printStackTrace();
//                } 
//                finally {
//
//                    try {
//                        if (fis != null)
//                        fis.close();
//                    } 
//                    catch (IOException ex) {
//                        ex.printStackTrace();
//                    }
//                }
//        
//                String CreateWLANStudent = "cmd.exe /c netsh wlan add profile filename=" + WS.StudentTempDir;
//                System.out.println("CreateWLANCampus_User = " + CreateWLANStudent);
//                p = Runtime.getRuntime().exec(CreateWLANStudent);
//                System.out.println("Process p = " + p.toString());
//            } 
//            catch (NullPointerException ex) {
//                System.out.println("Error NullPointerException " + ex.getMessage());
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            catch (IOException ex) {
//                System.out.println("Error IOException " + ex.getMessage());
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    
//        if (jRadioButtonStaff.isSelected()){
//        
//            //takes the Wi-Fi-Staff.xml file within the jar and extracts it to a temporary location for use - incomplete feature
//            //currently all xml files must be placed in the root of the c: to run correctly
//            WifiSetupClass WS;
//            WS = new WifiSetupClass();
//            Process p = null;
//            //tries to execute the netsh command to add the WLAN profile
//            try {
//                System.out.println("StringTempDir = " + WS.StringTempDir);
//                InputStream fis = null;
//
//                try {
//                    fis = (getClass().getResourceAsStream(WS.StaffFileName));
//
//                    System.out.println("Total file size to read (in bytes) : " + fis.available());
//
//                    int content;
//                    while ((content = fis.read()) != -1) {
//                        // Copies the stream to a file in the Temp folder
//                        Files.copy(fis, WS.StaffTempDir, REPLACE_EXISTING);;
//                    }
//
//                } 
//                catch (IOException e) {
//                e.printStackTrace();
//                } 
//                finally {
//
//                    try {
//                        if (fis != null)
//                        fis.close();
//                    } 
//                    catch (IOException ex) {
//                        ex.printStackTrace();
//                    }
//                }
//        
//                String CreateWLANStaff = "cmd.exe /c netsh wlan add profile filename=" + WS.StaffTempDir;
////                String WLANUsername = "cmd.exe /c netsh wlan ";
//                System.out.println("CreateWLANCampus_User = " + CreateWLANStaff);
//                p = Runtime.getRuntime().exec(CreateWLANStaff);
//                System.out.println("Process p = " + p.toString());
////                p = Runtime.getRuntime().exec(WLANUsername);
////                System.out.println("Process p = " + p.toString());
////                p = Runtime.getRuntime().exec(WLANPassword);
////                System.out.println("Process p = " + p.toString());
//            } 
//            catch (NullPointerException ex) {
//                System.out.println("Error NullPointerException " + ex.getMessage());
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            catch (IOException ex) {
//                System.out.println("Error IOException " + ex.getMessage());
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        
//        }
//     
//        if (jRadioButtonCampus_User.isSelected()){
//            
//            //takes the Wi-Fi-Campus_User.xml file within the jar and extracts it to a temporary location for use
//            
//            WifiSetupClass WS;
//            WS = new WifiSetupClass();
//            Process p = null;
//            //tries to execute the netsh command to add the WLAN profile
//            try {
//                System.out.println("StringTempDir = " + WS.StringTempDir);
//                InputStream fis = null;
//
//                try {
//                    fis = (getClass().getResourceAsStream(WS.Campus_UserFileName));
//
//                    System.out.println("Total file size to read (in bytes) : " + fis.available());
//
//                    int content;
//                    while ((content = fis.read()) != -1) {
//                        // Copies the stream to a file in the Temp folder
//                        Files.copy(fis, WS.Campus_UserTempDir, REPLACE_EXISTING);;
//                    }
//
//                } 
//                catch (IOException e) {
//                e.printStackTrace();
//                } 
//                finally {
//
//                    try {
//                        if (fis != null)
//                        fis.close();
//                    } 
//                    catch (IOException ex) {
//                        ex.printStackTrace();
//                    }
//                }
//        
//                String CreateWLANCampus_User = "cmd.exe /c netsh wlan add profile filename=" + WS.Campus_UserTempDir;
//                System.out.println("CreateWLANCampus_User = " + CreateWLANCampus_User);
//                p = Runtime.getRuntime().exec(CreateWLANCampus_User);
//                System.out.println("Process p = " + p.toString());
//            } 
//            catch (NullPointerException ex) {
//                System.out.println("Error NullPointerException " + ex.getMessage());
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            catch (IOException ex) {
//                System.out.println("Error IOException " + ex.getMessage());
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }