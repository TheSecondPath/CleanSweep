
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


//if (jCheckBoxStudent.isSelected()){
//        
//            WifiSetupClass WS;
//            WS = new WifiSetupClass();
//            Process p = null;
//            //reads the XML resource file Wi-Fi-Student.xml
//            try {
//                System.out.println("StringTempDir = " + WS.StringTempDir);
//                InputStream XMLStream = null;
//
//                try {
//                    XMLStream = (getClass().getResourceAsStream(WS.StudentFileName + ".xml"));
//
//                    System.out.println("Total file size to read (in bytes) : " + XMLStream.available());
//
//                    int content;
//                    while ((content = XMLStream.read()) != -1) {
//                        // Copies the stream to a file in the Temp folder
//                        Files.copy(XMLStream, WS.StudentTempDir, REPLACE_EXISTING);;
//                    }//end of while loop
//                    
//                }//end of try to get resource and save it to temp
//                catch (IOException e) {
//                e.printStackTrace();
//                }//end of catch IOEception
//                finally {
//
//                    try {
//                        if (XMLStream != null)
//                        XMLStream.close();
//                    }//end of try to close stream
//                    catch (IOException ex) {
//                        ex.printStackTrace();
//                    }//end of catch IOEception
//                }
//                //Removes any existing WLAN profile with the same name as the new Profile
//                String RemoveWLANStudent = "cmd.exe /c netsh wlan delete profile name=" + WS.StudentFileName;
//                String CreateWLANStudent = "cmd.exe /c netsh wlan add profile filename=" + WS.StudentTempDir;
//                p = Runtime.getRuntime().exec(RemoveWLANStudent);
//                System.out.println("Process p = " + p.toString());
//                System.out.println("CreateWLANStudent = " + CreateWLANStudent);
//                p = Runtime.getRuntime().exec(CreateWLANStudent);
//                System.out.println("Process p = " + p.toString());
//            }//end of try block for reading and saving the XML to the temp folder 
//            
//            catch (NullPointerException ex) {
//                System.out.println("Error NullPointerException " + ex.getMessage());
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }//end of catch NullPointerException
//            
//            catch (IOException ex) {
//                System.out.println("Error IOException " + ex.getMessage());
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }//end of catch IOException
//        return null;
//        
//        }//end of if statement jCheckBoxStudent.isSelected
//    
//        if (jCheckBoxStaff.isSelected()){
//  
//        
//            WifiSetupClass WS;
//            WS = new WifiSetupClass();
//            Process p = null;
//            //reads the XML resource file Wi-Fi-Staff.xml
//            try {
//                System.out.println("StringTempDir = " + WS.StringTempDir);
//                InputStream XMLStream = null;
//
//                try {
//                    XMLStream = (getClass().getResourceAsStream(WS.StaffFileName + ".xml"));
//
//                    System.out.println("Total file size to read (in bytes) : " + XMLStream.available());
//
//                    int content;
//                    while ((content = XMLStream.read()) != -1) {
//                        // Copies the stream to a file in the Temp folder
//                        Files.copy(XMLStream, WS.StaffTempDir, REPLACE_EXISTING);
//                    }//end of while loop
//                    
//                }//end of try to get resource and save it to temp
//                catch (IOException e) {
//                e.printStackTrace();
//                }//end of catch IOEception
//                finally {
//
//                    try {
//                        if (XMLStream != null)
//                        XMLStream.close();
//                    }//end of try to close stream
//                    catch (IOException ex) {
//                        ex.printStackTrace();
//                    }//end of catch IOEception
//                }//end of finally block
//                
//                //Removes any existing WLAN profile with the same name as the new Profile
//                String RemoveWLANStaff = "cmd.exe /c netsh wlan delete profile name=" + WS.StaffFileName;
//                String CreateWLANStaff = "cmd.exe /c netsh wlan add profile filename=" + WS.StaffTempDir;
//                p = Runtime.getRuntime().exec(RemoveWLANStaff);
//                System.out.println("Process p = " + p.toString());
//                System.out.println("CreateWLANStaff = " + CreateWLANStaff);
//                p = Runtime.getRuntime().exec(CreateWLANStaff);
//                System.out.println("Process p = " + p.toString());
//            }//end of try block for reading and saving the XML to the temp folder
//            
//            catch (NullPointerException ex) {
//                System.out.println("Error NullPointerException " + ex.getMessage());
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }//end of catch NullPointerException
//            
//            catch (IOException ex) {
//                System.out.println("Error IOException " + ex.getMessage());
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }//end of catch IOException
//        return null;
//        
//        }//end of if statement jCheckBoxStaff.isSelected
//     
//        if (jCheckBoxCampus_User.isSelected()){
//            
//            WifiSetupClass WS;
//            WS = new WifiSetupClass();
//            Process p = null;
//            //reads the XML resource file Wi-Fi-Campus_User.xml
//            try {
//                System.out.println("StringTempDir = " + WS.StringTempDir);
//                InputStream XMLStream = null;
//
//                try {
//                    XMLStream = (getClass().getResourceAsStream(WS.Campus_UserFileName + ".xml"));
//
//                    System.out.println("Total file size to read (in bytes) : " + XMLStream.available());
//
//                    int content;
//                    while ((content = XMLStream.read()) != -1) {
//                        // Copies the stream to a file in the Temp folder
//                        Files.copy(XMLStream, WS.Campus_UserTempDir, REPLACE_EXISTING);;
//                    }//end of while loop
//                    
//                }//end of try to get resource and save it to temp
//                catch (IOException e) {
//                e.printStackTrace();
//                }//end of catch IOEception
//                finally {
//
//                    try {
//                        if (XMLStream != null)
//                        XMLStream.close();
//                    }//end of try to close stream
//                    catch (IOException ex) {
//                        ex.printStackTrace();
//                    }//end of catch IOEception
//                }
//                ////Removes any existing WLAN profile with the same name as the new Profile
//                String RemoveWLANCampus_User = "cmd.exe /c netsh wlan delete profile name=" + WS.Campus_UserFileName;
//                String CreateWLANCampus_User = "cmd.exe /c netsh wlan add profile filename=" + WS.Campus_UserTempDir;
//                p = Runtime.getRuntime().exec(RemoveWLANCampus_User);
//                System.out.println("Process p = " + p.toString());
//                System.out.println("CreateWLANCampus_User = " + CreateWLANCampus_User);
//                p = Runtime.getRuntime().exec(CreateWLANCampus_User);
//                System.out.println("Process p = " + p.toString());
//            }//end of try block for reading and saving the XML to the temp folder 
//            
//            catch (NullPointerException ex) {
//                System.out.println("Error NullPointerException " + ex.getMessage());
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }//end of catch NullPointerException
//            
//            catch (IOException ex) {
//                System.out.println("Error IOException " + ex.getMessage());
//                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }//end of catch IOException
//        return null;
//        }//end of if statement jCheckBoxCampus_User.isSelected
        
    }
