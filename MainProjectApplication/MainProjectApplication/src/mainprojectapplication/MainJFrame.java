/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprojectapplication;

import java.awt.AWTException;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Jeffrey Thompson
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupNetworkSelect = new javax.swing.ButtonGroup();
        jPanelWifiUtility = new javax.swing.JPanel();
        jButton_Connect = new javax.swing.JButton();
        jCheckBoxStaff = new javax.swing.JCheckBox();
        jCheckBoxCampus_User = new javax.swing.JCheckBox();
        jCheckBoxStudent = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelDescription1 = new javax.swing.JLabel();
        jLabelDescription2 = new javax.swing.JLabel();
        Button_Execute = new javax.swing.JButton();
        jRadioButtonDefragment = new javax.swing.JRadioButton();
        jRadioButtonDiskCleaner = new javax.swing.JRadioButton();
        jRadioButtonDiskCheck = new javax.swing.JRadioButton();
        jRadioButtonFlushDNS = new javax.swing.JRadioButton();
        jRadioButtonDHCP = new javax.swing.JRadioButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemFacultyPage = new javax.swing.JMenuItem();
        jMenuItemFAQPage = new javax.swing.JMenuItem();
        jMenuDownloads = new javax.swing.JMenu();
        jMenuVMWare = new javax.swing.JMenuItem();
        jMenuVipreAntivirus = new javax.swing.JMenuItem();
        jMenuMalwareBytes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fairmont State Wifi Setup Utility");

        jPanelWifiUtility.setBorder(javax.swing.BorderFactory.createTitledBorder("Wifi Utility"));
        jPanelWifiUtility.setToolTipText("");

        jButton_Connect.setText("Connect");
        jButton_Connect.setToolTipText("Connect to the selected Network and domain.");
        jButton_Connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConnectActionPerformed(evt);
            }
        });

        jCheckBoxStaff.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBoxStaff.setText("Staff");
        jCheckBoxStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxStaffActionPerformed(evt);
            }
        });

        jCheckBoxCampus_User.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBoxCampus_User.setText("Campus_User");
        jCheckBoxCampus_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCampus_UserActionPerformed(evt);
            }
        });

        jCheckBoxStudent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBoxStudent.setText("Student");
        jCheckBoxStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxStudentActionPerformed(evt);
            }
        });

        jLabel1.setText("Automatically connect to the Fairmont State Wireless");

        jLabel2.setText("Network.  Select the networks you would like to");

        jLabel3.setText("Configure Below.");

        jLabel4.setText("when logging in, make sure to include the");

        jLabel5.setText("domain such as Username@Students.");

        javax.swing.GroupLayout jPanelWifiUtilityLayout = new javax.swing.GroupLayout(jPanelWifiUtility);
        jPanelWifiUtility.setLayout(jPanelWifiUtilityLayout);
        jPanelWifiUtilityLayout.setHorizontalGroup(
            jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                .addGroup(jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBoxCampus_User, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxStudent, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxStaff, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton_Connect, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel5))
                                .addComponent(jLabel4))
                            .addComponent(jLabel2))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanelWifiUtilityLayout.setVerticalGroup(
            jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWifiUtilityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jCheckBoxCampus_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxStudent)
                .addGap(61, 61, 61)
                .addComponent(jButton_Connect)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(20, 20, 20))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Clean Sweep"));

        jLabelDescription1.setText("Utilities to Fix problems and clean up junk");

        jLabelDescription2.setText("files and cache files");

        Button_Execute.setText("Execute");
        Button_Execute.setToolTipText("Runs the tools selected above.");
        Button_Execute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ExecuteActionPerformed(evt);
            }
        });

        jRadioButtonDefragment.setText("Defragment Disk");
        jRadioButtonDefragment.setToolTipText("A tool that reduces the amount of /n fragmentation of the drive by physically reorganizing the data.");
        jRadioButtonDefragment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDefragmentActionPerformed(evt);
            }
        });

        jRadioButtonDiskCleaner.setText("Disk Cleaner");
        jRadioButtonDiskCleaner.setToolTipText("Runs a disk cleanup tool to clear cache and other junk files.");

        jRadioButtonDiskCheck.setText("Disk Check");
        jRadioButtonDiskCheck.setToolTipText("Checks for file system Problems and fixes file system errors.");

        jRadioButtonFlushDNS.setText("Flush DNS/Renew IP");
        jRadioButtonFlushDNS.setToolTipText("Clears the DNS(Domain Name Server) and fetches it from DHCP");

        jRadioButtonDHCP.setText("Enable DHCP for DNS");
        jRadioButtonDHCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDHCPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(Button_Execute, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelDescription1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDescription2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonDHCP)
                            .addComponent(jRadioButtonDefragment)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonFlushDNS)
                                    .addComponent(jRadioButtonDiskCleaner)
                                    .addComponent(jRadioButtonDiskCheck))
                                .addGap(6, 6, 6)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDescription1)
                .addGap(5, 5, 5)
                .addComponent(jLabelDescription2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonDHCP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonDefragment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonDiskCleaner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonDiskCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonFlushDNS)
                .addGap(18, 18, 18)
                .addComponent(Button_Execute)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuFile.setText("File");
        jMenuFile.setToolTipText("Opens a browser to the faculty directory.");

        jMenuItemFacultyPage.setText("Faculty page");
        jMenuItemFacultyPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFacultyPageActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemFacultyPage);

        jMenuItemFAQPage.setText("FAQ Page");
        jMenuItemFAQPage.setToolTipText("Opens a browser to the Frequently Asked Questions page of the Fairmont State I.T. department");
        jMenuItemFAQPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFAQPageActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemFAQPage);

        jMenuBar.add(jMenuFile);

        jMenuDownloads.setText("Downloads");
        jMenuDownloads.setToolTipText("");

        jMenuVMWare.setText("VMWare Horizon");
        jMenuVMWare.setToolTipText("Opens a browser to the VMware Horizon download page.");
        jMenuVMWare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVMWareActionPerformed(evt);
            }
        });
        jMenuDownloads.add(jMenuVMWare);

        jMenuVipreAntivirus.setText("Vipre Antivirus");
        jMenuVipreAntivirus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVipreAntivirusActionPerformed(evt);
            }
        });
        jMenuDownloads.add(jMenuVipreAntivirus);

        jMenuMalwareBytes.setText("MalwareBytes");
        jMenuMalwareBytes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMalwareBytesActionPerformed(evt);
            }
        });
        jMenuDownloads.add(jMenuMalwareBytes);

        jMenuBar.add(jMenuDownloads);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelWifiUtility, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelWifiUtility, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_ExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ExecuteActionPerformed
if(jRadioButtonDiskCleaner.isSelected()){
    try {
       //runs diskcleanerclass if cleanerbox is selected
        DiskCleanerClass DC = new DiskCleanerClass();
        Button_Execute.setEnabled(true);
    
    } catch (AWTException ex) {
        System.out.println("Error " + ex.getMessage());
        Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
}
if (jRadioButtonDefragment.isSelected()){
    //runs diskdefragclass if defragbox is selected
    DiskDefragClass DF = new DiskDefragClass();
    
  Button_Execute.setEnabled(true);
  
}
if (jRadioButtonDiskCheck.isSelected()) {
    CheckerClass CC = new CheckerClass();
           //runs diskcheckerclass if checkerbox is selected 
}
if (jRadioButtonFlushDNS.isSelected()){
    //runs flushDNSclass if flushDNSbox is selected
    FlushDNSClass FDNS = new FlushDNSClass();
    Process p = null;
     String Renew = "cmd.exe /c start cmd.exe /c start ipconfig /renew";
    try {
        p = Runtime.getRuntime().exec(Renew);
    } catch (IOException ex) {
        System.out.println("Error " + ex.getMessage());
        Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
   Button_Execute.setEnabled(false);
}

// TODO add your handling code here:
    }//GEN-LAST:event_Button_ExecuteActionPerformed

    private void jButton_ConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConnectActionPerformed
        
        if (jCheckBoxStudent.isSelected()){
        
            //takes the Wi-Fi-Student.xml file within the jar and extracts it to a temporary location for use - incomplete feature
            //currently all xml files must be placed in the root of the c: to run correctly
            WifiSetupClass WS;
            WS = new WifiSetupClass();
            Process p = null;
            //tries to execute the netsh command to add the WLAN profile
            try {
                System.out.println("StringTempDir = " + WS.StringTempDir);
                InputStream fis = null;

                try {
                    fis = (getClass().getResourceAsStream(WS.StudentInputPath));

                    System.out.println("Total file size to read (in bytes) : " + fis.available());

                    int content;
                    while ((content = fis.read()) != -1) {
                        // Copies the stream to a file in the Temp folder
                        Files.copy(fis, WS.StudentTempDir, REPLACE_EXISTING);;
                    }

                } 
                catch (IOException e) {
                e.printStackTrace();
                } 
                finally {

                    try {
                        if (fis != null)
                        fis.close();
                    } 
                    catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
        
                String CreateWLANStudent = "cmd.exe /c netsh wlan add profile filename=" + WS.StudentTempDir;
                System.out.println("CreateWLANCampus_User = " + CreateWLANStudent);
                p = Runtime.getRuntime().exec(CreateWLANStudent);
                System.out.println("Process p = " + p.toString());
            } 
            catch (NullPointerException ex) {
                System.out.println("Error NullPointerException " + ex.getMessage());
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (IOException ex) {
                System.out.println("Error IOException " + ex.getMessage());
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
        if (jCheckBoxStaff.isSelected()){
        
            //takes the Wi-Fi-Staff.xml file within the jar and extracts it to a temporary location for use - incomplete feature
            //currently all xml files must be placed in the root of the c: to run correctly
            WifiSetupClass WS;
            WS = new WifiSetupClass();
            Process p = null;
            //tries to execute the netsh command to add the WLAN profile
            try {
                System.out.println("StringTempDir = " + WS.StringTempDir);
                InputStream fis = null;

                try {
                    fis = (getClass().getResourceAsStream(WS.StaffInputPath));

                    System.out.println("Total file size to read (in bytes) : " + fis.available());

                    int content;
                    while ((content = fis.read()) != -1) {
                        // Copies the stream to a file in the Temp folder
                        Files.copy(fis, WS.StaffTempDir, REPLACE_EXISTING);;
                    }

                } 
                catch (IOException e) {
                e.printStackTrace();
                } 
                finally {

                    try {
                        if (fis != null)
                        fis.close();
                    } 
                    catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
        
                String CreateWLANStaff = "cmd.exe /c netsh wlan add profile filename=" + WS.StaffTempDir;
//                String WLANUsername = "cmd.exe /c netsh wlan ";
                System.out.println("CreateWLANCampus_User = " + CreateWLANStaff);
                p = Runtime.getRuntime().exec(CreateWLANStaff);
                System.out.println("Process p = " + p.toString());
//                p = Runtime.getRuntime().exec(WLANUsername);
//                System.out.println("Process p = " + p.toString());
//                p = Runtime.getRuntime().exec(WLANPassword);
//                System.out.println("Process p = " + p.toString());
            } 
            catch (NullPointerException ex) {
                System.out.println("Error NullPointerException " + ex.getMessage());
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (IOException ex) {
                System.out.println("Error IOException " + ex.getMessage());
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
     
        if (jCheckBoxCampus_User.isSelected()){
            
            //takes the Wi-Fi-Campus_User.xml file within the jar and extracts it to a temporary location for use
            
            WifiSetupClass WS;
            WS = new WifiSetupClass();
            Process p = null;
            //tries to execute the netsh command to add the WLAN profile
            try {
                System.out.println("StringTempDir = " + WS.StringTempDir);
                InputStream fis = null;

                try {
                    fis = (getClass().getResourceAsStream(WS.Campus_UserInputPath));

                    System.out.println("Total file size to read (in bytes) : " + fis.available());

                    int content;
                    while ((content = fis.read()) != -1) {
                        // Copies the stream to a file in the Temp folder
                        Files.copy(fis, WS.Campus_UserTempDir, REPLACE_EXISTING);;
                    }

                } 
                catch (IOException e) {
                e.printStackTrace();
                } 
                finally {

                    try {
                        if (fis != null)
                        fis.close();
                    } 
                    catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
        
                String CreateWLANCampus_User = "cmd.exe /c netsh wlan add profile filename=" + WS.Campus_UserTempDir;
                System.out.println("CreateWLANCampus_User = " + CreateWLANCampus_User);
                p = Runtime.getRuntime().exec(CreateWLANCampus_User);
                System.out.println("Process p = " + p.toString());
            } 
            catch (NullPointerException ex) {
                System.out.println("Error NullPointerException " + ex.getMessage());
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (IOException ex) {
                System.out.println("Error IOException " + ex.getMessage());
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton_ConnectActionPerformed

    private void jMenuItemFAQPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFAQPageActionPerformed
if(Desktop.isDesktopSupported())
{
        try {
            //opens tech commons webpage in default browser
            Desktop.getDesktop().browse(new URI("https://www.fairmontstate.edu/it/tech-commons/information-technology-getting-started-guide-students"));
        } catch (IOException ex) {
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    }//GEN-LAST:event_jMenuItemFAQPageActionPerformed

    private void jMenuItemFacultyPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFacultyPageActionPerformed
 
    if(Desktop.isDesktopSupported())
{
        try {
            //opens faculty page in default browser
            Desktop.getDesktop().browse(new URI("https://www.fairmontstate.edu/schoolofbusiness/faculty-staff"));
        } catch (IOException ex) {
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemFacultyPageActionPerformed

    private void jMenuVMWareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVMWareActionPerformed

        if(Desktop.isDesktopSupported())
{
        try {
            //opens download page for VMWare Horizon
            Desktop.getDesktop().browse(new URI("https://my.vmware.com/web/vmware/info?slug=desktop_end_user_computing/vmware_horizon_clients/4_0"));
        } catch (IOException ex) {
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    }//GEN-LAST:event_jMenuVMWareActionPerformed

    private void jCheckBoxCampus_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCampus_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxCampus_UserActionPerformed

    private void jCheckBoxStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxStaffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxStaffActionPerformed

    private void jCheckBoxStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxStudentActionPerformed

    private void jMenuVipreAntivirusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVipreAntivirusActionPerformed
        try {
            VipreLinkClass Vipre = new VipreLinkClass();//initialized ViperlinkClass
        } catch (URISyntaxException | IOException ex) {
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuVipreAntivirusActionPerformed

    private void jMenuMalwareBytesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMalwareBytesActionPerformed
        try {
            VipreLinkClass Vipre = new VipreLinkClass();//initialized ViperlinkClass
        } catch (URISyntaxException | IOException ex) {
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuMalwareBytesActionPerformed

    private void jRadioButtonDefragmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDefragmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonDefragmentActionPerformed

    private void jRadioButtonDHCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDHCPActionPerformed
                String userName = System.getProperty("user.name");
        String IPV4DHCP = "cmd /c start cmd.exe /c runas /user:" + userName + " \"netsh interface ipv4 set address name=\"Local Connection Networks\" source=dhcp\"";
        String IPV4EDHCP = "cmd /c start cmd.exe /c runas /user:" + userName + " \"netsh interface ipv4 set address name=\"ethernet\" source=dhcp\"";
 Process p = null;
        try {
// Executes All String Commands

            p = Runtime.getRuntime().exec(IPV4DHCP);
            p = Runtime.getRuntime().exec(IPV4EDHCP);

            //runs null 
        } catch (IOException ex) {
            //catches IO Exceptions
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(FlushDNSClass.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonDHCPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Execute;
    private javax.swing.ButtonGroup buttonGroupNetworkSelect;
    private javax.swing.JButton jButton_Connect;
    private javax.swing.JCheckBox jCheckBoxCampus_User;
    private javax.swing.JCheckBox jCheckBoxStaff;
    private javax.swing.JCheckBox jCheckBoxStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDescription1;
    private javax.swing.JLabel jLabelDescription2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuDownloads;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItemFAQPage;
    private javax.swing.JMenuItem jMenuItemFacultyPage;
    private javax.swing.JMenuItem jMenuMalwareBytes;
    private javax.swing.JMenuItem jMenuVMWare;
    private javax.swing.JMenuItem jMenuVipreAntivirus;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelWifiUtility;
    private javax.swing.JRadioButton jRadioButtonDHCP;
    private javax.swing.JRadioButton jRadioButtonDefragment;
    private javax.swing.JRadioButton jRadioButtonDiskCheck;
    private javax.swing.JRadioButton jRadioButtonDiskCleaner;
    private javax.swing.JRadioButton jRadioButtonFlushDNS;
    // End of variables declaration//GEN-END:variables
}
