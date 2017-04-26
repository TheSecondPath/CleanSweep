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
        jRadioButtonStudent = new javax.swing.JRadioButton();
        jRadioButtonStaff = new javax.swing.JRadioButton();
        jRadioButtonCampus_User = new javax.swing.JRadioButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jButton_Connect = new javax.swing.JButton();
        jButton_Vipre = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CheckBox_Defrag = new javax.swing.JCheckBox();
        CheckBox_DiskCheck = new javax.swing.JCheckBox();
        jLabelDescription1 = new javax.swing.JLabel();
        jLabelDescription2 = new javax.swing.JLabel();
        Button_Execute = new javax.swing.JButton();
        CheckBox_FlushDNS = new javax.swing.JCheckBox();
        CheckBox_Cleaner = new javax.swing.JCheckBox();
        DNSTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton_Static = new javax.swing.JButton();
        jButton_DHCP = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemFacultyPage = new javax.swing.JMenuItem();
        jMenuItemFAQPage = new javax.swing.JMenuItem();
        jMenuDownloads = new javax.swing.JMenu();
        jMenuItemVMWare = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fairmont State Wifi Setup Utility");

        jPanelWifiUtility.setBorder(javax.swing.BorderFactory.createTitledBorder("Wifi Utility"));
        jPanelWifiUtility.setToolTipText("");

        buttonGroupNetworkSelect.add(jRadioButtonStudent);
        jRadioButtonStudent.setText("Student");
        jRadioButtonStudent.setToolTipText("Select to connect to Student Wi-Fi.");

        buttonGroupNetworkSelect.add(jRadioButtonStaff);
        jRadioButtonStaff.setText("Staff");
        jRadioButtonStaff.setToolTipText("Select to connect to Staff Wi-Fi.");
        jRadioButtonStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonStaffActionPerformed(evt);
            }
        });

        buttonGroupNetworkSelect.add(jRadioButtonCampus_User);
        jRadioButtonCampus_User.setText("Campus_User");
        jRadioButtonCampus_User.setToolTipText("Select to connect to Campus_User Wi-Fi.");
        jRadioButtonCampus_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCampus_UserActionPerformed(evt);
            }
        });

        jPasswordField1.setToolTipText("Password to connect to the network.");

        jFormattedTextField1.setToolTipText("Username(UCA) for logging into the network.");

        jLabelUsername.setText("Username:");

        jLabelPassword.setText("Password:");

        jButton_Connect.setText("Connect");
        jButton_Connect.setToolTipText("Connect to the selected Network and domain.");
        jButton_Connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConnectActionPerformed(evt);
            }
        });

        jButton_Vipre.setText("Vipre Antivirus Software ");
        jButton_Vipre.setToolTipText("Download provided by Fairmont State University. you will need to provide your username@students and password.");
        jButton_Vipre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VipreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelWifiUtilityLayout = new javax.swing.GroupLayout(jPanelWifiUtility);
        jPanelWifiUtility.setLayout(jPanelWifiUtilityLayout);
        jPanelWifiUtilityLayout.setHorizontalGroup(
            jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonCampus_User)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWifiUtilityLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                        .addGroup(jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextField1)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                    .addComponent(jButton_Connect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(jButton_Vipre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79))
        );
        jPanelWifiUtilityLayout.setVerticalGroup(
            jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonStudent)
                    .addComponent(jRadioButtonStaff)
                    .addComponent(jRadioButtonCampus_User))
                .addGap(42, 42, 42)
                .addGroup(jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsername))
                .addGap(29, 29, 29)
                .addGroup(jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword))
                .addGap(56, 56, 56)
                .addComponent(jButton_Connect)
                .addGap(18, 18, 18)
                .addComponent(jButton_Vipre)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Clean Sweep"));

        CheckBox_Defrag.setText("Defragment Disk");
        CheckBox_Defrag.setToolTipText("A tool that reduces the amount of /n fragmentation of the drive by physically reorganizing the data.");
        CheckBox_Defrag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_DefragActionPerformed(evt);
            }
        });

        CheckBox_DiskCheck.setText("Disk Check");
        CheckBox_DiskCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_DiskCheckActionPerformed(evt);
            }
        });

        jLabelDescription1.setText("Utilities to Fix problems and clean up junk");

        jLabelDescription2.setText("files and cache files");

        Button_Execute.setText("Execute");
        Button_Execute.setToolTipText("Runs the tools selected above.");
        Button_Execute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ExecuteActionPerformed(evt);
            }
        });

        CheckBox_FlushDNS.setText("Flush DNS/Renew IP");
        CheckBox_FlushDNS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_FlushDNSActionPerformed(evt);
            }
        });

        CheckBox_Cleaner.setText("Disk Cleaner");
        CheckBox_Cleaner.setToolTipText("Runs a disk cleanup");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelDescription1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDescription2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckBox_FlushDNS)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CheckBox_Defrag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_Execute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(CheckBox_Cleaner)
                            .addComponent(CheckBox_DiskCheck))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDescription1)
                .addGap(5, 5, 5)
                .addComponent(jLabelDescription2)
                .addGap(52, 52, 52)
                .addComponent(CheckBox_Defrag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox_Cleaner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox_DiskCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox_FlushDNS)
                .addGap(36, 36, 36)
                .addComponent(Button_Execute)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        DNSTextField.setToolTipText("Static DNS (format \"0.0.0.0\")");

        jLabel5.setText("Enter DNS IP Address");

        jButton_Static.setText("Enter");
        jButton_Static.setToolTipText("Sets static DNS Fromabove field.");
        jButton_Static.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_StaticActionPerformed(evt);
            }
        });

        jButton_DHCP.setText("Re-Enable DHCP");
        jButton_DHCP.setToolTipText("Sets the DNS(Domain Name Server) to be automatically obtained via DHCP");
        jButton_DHCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DHCPActionPerformed(evt);
            }
        });

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

        jMenuItemVMWare.setText("VMWare Horizon");
        jMenuItemVMWare.setToolTipText("Opens a browser to the VMware Horizon download page.");
        jMenuItemVMWare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVMWareActionPerformed(evt);
            }
        });
        jMenuDownloads.add(jMenuItemVMWare);

        jMenuBar.add(jMenuDownloads);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelWifiUtility, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jButton_Static)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(DNSTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_DHCP)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DNSTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton_DHCP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Static)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelWifiUtility, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonCampus_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCampus_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonCampus_UserActionPerformed

    private void jRadioButtonStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonStaffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonStaffActionPerformed

    private void CheckBox_DefragActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_DefragActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox_DefragActionPerformed

    private void Button_ExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ExecuteActionPerformed
if(CheckBox_Cleaner.isSelected()){
    try {
       //runs diskcleanerclass if cleanerbox is selected
        DiskCleanerClass DC = new DiskCleanerClass();
        Button_Execute.setEnabled(true);
    
    } catch (AWTException ex) {
        System.out.println("Error " + ex.getMessage());
        Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
}
if (CheckBox_Defrag.isSelected()){
    //runs diskdefragclass if defragbox is selected
    DiskDefragClass DF = new DiskDefragClass();
    
  Button_Execute.setEnabled(true);
  
}
if (CheckBox_DiskCheck.isSelected()) {
    CheckerClass CC = new CheckerClass();
           //runs diskcheckerclass if checkerbox is selected 
}
if (CheckBox_FlushDNS.isSelected()){
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

    private void CheckBox_DiskCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_DiskCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox_DiskCheckActionPerformed

    private void CheckBox_FlushDNSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_FlushDNSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox_FlushDNSActionPerformed

    private void jButton_ConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConnectActionPerformed
        
        if (jRadioButtonStudent.isSelected()){
        
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
    
        if (jRadioButtonStaff.isSelected()){
        
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
                System.out.println("CreateWLANCampus_User = " + CreateWLANStaff);
                p = Runtime.getRuntime().exec(CreateWLANStaff);
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
     
        if (jRadioButtonCampus_User.isSelected()){
            
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

    private void jButton_VipreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VipreActionPerformed
  
         try {
            VipreLinkClass Vipre = new VipreLinkClass();//initialized ViperlinkClass
        } catch (URISyntaxException | IOException ex) {
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }



    }//GEN-LAST:event_jButton_VipreActionPerformed

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

    private void jMenuItemVMWareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVMWareActionPerformed

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
    }//GEN-LAST:event_jMenuItemVMWareActionPerformed

    private void jButton_StaticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_StaticActionPerformed
        String IP = DNSTextField.getSelectedText();
        String StaticDNS = "cmd.exe /c start cmd.exe /c start interface ip set dns \"Local Area Connection\" static ";
 Process p = null;
        try {
// Executes All String Commands

            p = Runtime.getRuntime().exec(StaticDNS + IP);
         
            

            //runs null 
        } catch (IOException ex) {
            //catches IO Exceptions
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(FlushDNSClass.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_StaticActionPerformed

    private void jButton_DHCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DHCPActionPerformed
        
        String IPV4DHCP = "c:/elevate cmd.exe /c start netsh interface ipv4 set dnsservers name=\"Wi-Fi\" dhcp";
        String IPV6DHCP = "c:/elevate cmd.exe /c start netsh interface ipv6 set dnsservers name=\"Wi-Fi\" dhcp";
 Process p = null;
        try {
// Executes All String Commands

            p = Runtime.getRuntime().exec(IPV4DHCP);
            p = Runtime.getRuntime().exec(IPV6DHCP);
            

            //runs null 
        } catch (IOException ex) {
            //catches IO Exceptions
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(FlushDNSClass.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_DHCPActionPerformed

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
    private javax.swing.JCheckBox CheckBox_Cleaner;
    private javax.swing.JCheckBox CheckBox_Defrag;
    private javax.swing.JCheckBox CheckBox_DiskCheck;
    private javax.swing.JCheckBox CheckBox_FlushDNS;
    private javax.swing.JTextField DNSTextField;
    private javax.swing.ButtonGroup buttonGroupNetworkSelect;
    private javax.swing.JButton jButton_Connect;
    private javax.swing.JButton jButton_DHCP;
    private javax.swing.JButton jButton_Static;
    private javax.swing.JButton jButton_Vipre;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDescription1;
    private javax.swing.JLabel jLabelDescription2;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuDownloads;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItemFAQPage;
    private javax.swing.JMenuItem jMenuItemFacultyPage;
    private javax.swing.JMenuItem jMenuItemVMWare;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelWifiUtility;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButtonCampus_User;
    private javax.swing.JRadioButton jRadioButtonStaff;
    private javax.swing.JRadioButton jRadioButtonStudent;
    // End of variables declaration//GEN-END:variables
}
