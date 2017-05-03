/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprojectapplication;

import java.awt.AWTException;
import java.awt.Desktop;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



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
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadiobuttonGroupCleanSweep = new javax.swing.ButtonGroup();
        jPanelWifiUtility = new javax.swing.JPanel();
        jButton_Connect = new javax.swing.JButton();
        jCheckBoxStaff = new javax.swing.JCheckBox();
        jCheckBoxCampus_User = new javax.swing.JCheckBox();
        jCheckBoxStudent = new javax.swing.JCheckBox();
        jLabelWifiDesc1 = new javax.swing.JLabel();
        jLabelWifiDesc2 = new javax.swing.JLabel();
        jLabelWifiDesc3 = new javax.swing.JLabel();
        jLabelConnectInstruct1 = new javax.swing.JLabel();
        jLabelConnectInstruct2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelCleanSweepDesc1 = new javax.swing.JLabel();
        jLabelCleanSweepDesc2 = new javax.swing.JLabel();
        Button_Execute = new javax.swing.JButton();
        jRadioButtonDefragment = new javax.swing.JRadioButton();
        jRadioButtonDiskCleaner = new javax.swing.JRadioButton();
        jRadioButtonDiskCheck = new javax.swing.JRadioButton();
        jRadioButtonFlushDNS = new javax.swing.JRadioButton();
        jRadioButtonRecyclingBin = new javax.swing.JRadioButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemCampusDirectoryPage = new javax.swing.JMenuItem();
        jMenuItemFAQPage = new javax.swing.JMenuItem();
        jMenuItemPlaceTicket = new javax.swing.JMenuItem();
        Menu_Exit = new javax.swing.JMenuItem();
        jMenuDownloads = new javax.swing.JMenu();
        jMenuVMWare = new javax.swing.JMenuItem();
        jMenuVipreAntivirus = new javax.swing.JMenuItem();
        jMenuMalwareBytes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fairmont State Wifi Setup Utility");

        jPanelWifiUtility.setBorder(javax.swing.BorderFactory.createTitledBorder("Wifi Utility"));

        jButton_Connect.setText("Connect");
        jButton_Connect.setToolTipText("Connect to the selected Networks.");
        jButton_Connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConnectActionPerformed(evt);
            }
        });

        jCheckBoxStaff.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBoxStaff.setText("Staff");
        jCheckBoxStaff.setToolTipText("Select this to connect to the Staff network.");
        jCheckBoxStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxStaffActionPerformed(evt);
            }
        });

        jCheckBoxCampus_User.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBoxCampus_User.setText("Campus_User");
        jCheckBoxCampus_User.setToolTipText("Select this to connect to the Campus_User network.");
        jCheckBoxCampus_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCampus_UserActionPerformed(evt);
            }
        });

        jCheckBoxStudent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBoxStudent.setText("Student");
        jCheckBoxStudent.setToolTipText("Select this to connect to the Student network.");
        jCheckBoxStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxStudentActionPerformed(evt);
            }
        });

        jLabelWifiDesc1.setText("Automatically connect to the Fairmont State Wireless");

        jLabelWifiDesc2.setText("Network.  Select the networks you would like to");

        jLabelWifiDesc3.setText("Configure Below.");

        jLabelConnectInstruct1.setText("when logging in, make sure to include the");

        jLabelConnectInstruct2.setText("domain such as Username@Students.");

        javax.swing.GroupLayout jPanelWifiUtilityLayout = new javax.swing.GroupLayout(jPanelWifiUtility);
        jPanelWifiUtility.setLayout(jPanelWifiUtilityLayout);
        jPanelWifiUtilityLayout.setHorizontalGroup(
            jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                .addGroup(jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelWifiDesc1))
                    .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelWifiDesc3))
                    .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabelConnectInstruct2))
                                .addComponent(jLabelConnectInstruct1))
                            .addComponent(jLabelWifiDesc2)))
                    .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBoxCampus_User, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxStudent, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxStaff, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanelWifiUtilityLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton_Connect, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanelWifiUtilityLayout.setVerticalGroup(
            jPanelWifiUtilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWifiUtilityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelWifiDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelWifiDesc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelWifiDesc3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBoxCampus_User)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxStaff)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxStudent)
                .addGap(43, 43, 43)
                .addComponent(jButton_Connect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelConnectInstruct1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelConnectInstruct2)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Clean Sweep"));

        jLabelCleanSweepDesc1.setText("Utilities to Fix problems and clean up junk");

        jLabelCleanSweepDesc2.setText("files and cache files");

        Button_Execute.setText("Execute");
        Button_Execute.setToolTipText("Runs the tools selected above.");
        Button_Execute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ExecuteActionPerformed(evt);
            }
        });

        RadiobuttonGroupCleanSweep.add(jRadioButtonDefragment);
        jRadioButtonDefragment.setText("Defragment Disk");
        jRadioButtonDefragment.setToolTipText("A tool that reduces the amount of /n fragmentation of the drive by physically reorganizing the data.");
        jRadioButtonDefragment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDefragmentActionPerformed(evt);
            }
        });

        RadiobuttonGroupCleanSweep.add(jRadioButtonDiskCleaner);
        jRadioButtonDiskCleaner.setText("Disk Cleaner");
        jRadioButtonDiskCleaner.setToolTipText("Runs a disk cleanup tool to clear cache and other junk files.");

        RadiobuttonGroupCleanSweep.add(jRadioButtonDiskCheck);
        jRadioButtonDiskCheck.setText("Disk Check");
        jRadioButtonDiskCheck.setToolTipText("Checks for file system Problems and fixes file system errors.");

        RadiobuttonGroupCleanSweep.add(jRadioButtonFlushDNS);
        jRadioButtonFlushDNS.setText("Flush DNS/Renew IP");
        jRadioButtonFlushDNS.setToolTipText("Clears the DNS(Domain Name Server) and fetches it from DHCP");

        RadiobuttonGroupCleanSweep.add(jRadioButtonRecyclingBin);
        jRadioButtonRecyclingBin.setText("Empty Recycling Bin");
        jRadioButtonRecyclingBin.setToolTipText("Empties the Recycling Bin of all deleted files.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCleanSweepDesc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCleanSweepDesc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonRecyclingBin)
                            .addComponent(jRadioButtonDiskCleaner)
                            .addComponent(jRadioButtonDiskCheck)
                            .addComponent(jRadioButtonDefragment)
                            .addComponent(jRadioButtonFlushDNS)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Button_Execute, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCleanSweepDesc1)
                .addGap(5, 5, 5)
                .addComponent(jLabelCleanSweepDesc2)
                .addGap(27, 27, 27)
                .addComponent(jRadioButtonDefragment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonDiskCleaner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonRecyclingBin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonDiskCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonFlushDNS)
                .addGap(38, 38, 38)
                .addComponent(Button_Execute)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jMenuBar.setToolTipText("");

        jMenuFile.setText("File");
        jMenuFile.setToolTipText("");

        jMenuItemCampusDirectoryPage.setText("Campus Directory Search Tool");
        jMenuItemCampusDirectoryPage.setToolTipText("Opens a browser to the Campus Directory Search Tool.");
        jMenuItemCampusDirectoryPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCampusDirectoryPageActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemCampusDirectoryPage);

        jMenuItemFAQPage.setText("FAQ Page");
        jMenuItemFAQPage.setToolTipText("Opens a browser to the Frequently Asked Questions page of the Fairmont State I.T. department");
        jMenuItemFAQPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFAQPageActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemFAQPage);

        jMenuItemPlaceTicket.setText("Place an IT support ticket");
        jMenuItemPlaceTicket.setToolTipText("Opens the default Email client to send an email to help@fairmontstate.edu");
        jMenuItemPlaceTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPlaceTicketActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemPlaceTicket);

        Menu_Exit.setText("Exit");
        Menu_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ExitActionPerformed(evt);
            }
        });
        jMenuFile.add(Menu_Exit);

        jMenuBar.add(jMenuFile);

        jMenuDownloads.setText("Downloads");

        jMenuVMWare.setText("VMWare Horizon");
        jMenuVMWare.setToolTipText("Opens a browser to the VMware Horizon download page.");
        jMenuVMWare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVMWareActionPerformed(evt);
            }
        });
        jMenuDownloads.add(jMenuVMWare);

        jMenuVipreAntivirus.setText("Vipre Antivirus");
        jMenuVipreAntivirus.setToolTipText("Opens a browser to the Fairmont State Vipre download page.");
        jMenuVipreAntivirus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVipreAntivirusActionPerformed(evt);
            }
        });
        jMenuDownloads.add(jMenuVipreAntivirus);

        jMenuMalwareBytes.setText("MalwareBytes");
        jMenuMalwareBytes.setToolTipText("Opens a browser to the MalwareBytes download page.");
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelWifiUtility, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_ExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ExecuteActionPerformed
    int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to execute?", "Execute",  JOptionPane.YES_NO_OPTION);
    if (reply == JOptionPane.YES_OPTION)
    {


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
}
}

// TODO add your handling code here:
    }//GEN-LAST:event_Button_ExecuteActionPerformed

    @SuppressWarnings("empty-statement")
    private void jButton_ConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConnectActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to connect?", "Wi-Fi Connect",  JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION)
        {
   
            if (jCheckBoxStudent.isSelected()){

                WifiSetupClass WS;
                WS = new WifiSetupClass();
                Process p = null;
                //reads the XML resource file Wi-Fi-Student.xml
                try {
                    System.out.println("StringTempDir = " + WS.StringTempDir);
                    InputStream XMLStream = null;

                    try {
                        XMLStream = (getClass().getResourceAsStream(WS.StudentFileName + ".xml"));
                        System.out.println("Total file size to read (in bytes) : " + XMLStream.available());
                        Files.copy(XMLStream, WS.StudentTempDir, REPLACE_EXISTING);;
                        jCheckBoxStudent.setSelected(false);
                    }//end of try to get resource and save it to temp
                    catch (IOException e) {
                    e.printStackTrace();
                    }//end of catch IOEception
                    finally {

                        try {
                            if (XMLStream != null)
                            XMLStream.close();
                        }//end of try to close stream
                        catch (IOException ex) {
                            ex.printStackTrace();
                        }//end of catch IOEception
                    }
                    //Removes any existing WLAN profile with the same name as the new Profile
                    String RemoveWLANStudent = "cmd.exe /c netsh wlan delete profile name=" + WS.StudentFileName;
                    String CreateWLANStudent = "cmd.exe /c netsh wlan add profile filename=" + WS.StudentTempDir;
                    p = Runtime.getRuntime().exec(RemoveWLANStudent);
                    System.out.println("Process p = " + p.toString());
                    System.out.println("CreateWLANStudent = " + CreateWLANStudent);
                    p = Runtime.getRuntime().exec(CreateWLANStudent);
                    System.out.println("Process p = " + p.toString());
                }//end of try block for reading and saving the XML to the temp folder 

                catch (NullPointerException ex) {
                    System.out.println("Error NullPointerException " + ex.getMessage());
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }//end of catch NullPointerException

                catch (IOException ex) {
                    System.out.println("Error IOException " + ex.getMessage());
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }//end of catch IOException

            }//end of if statement jCheckBoxStudent.isSelected

            if (jCheckBoxStaff.isSelected()){

                WifiSetupClass WS;
                WS = new WifiSetupClass();
                Process p = null;
                //reads the XML resource file Wi-Fi-Staff.xml
                try {
                    System.out.println("StringTempDir = " + WS.StringTempDir);
                    InputStream XMLStream = null;

                    try {
                        XMLStream = (getClass().getResourceAsStream(WS.StaffFileName + ".xml"));
                        System.out.println("Total file size to read (in bytes) : " + XMLStream.available());
                        Files.copy(XMLStream, WS.StaffTempDir, REPLACE_EXISTING);
                        jCheckBoxStaff.setSelected(false);
                    }//end of try to get resource and save it to temp
                    catch (IOException e) {
                    e.printStackTrace();
                    }//end of catch IOEception
                    finally {

                        try {
                            if (XMLStream != null)
                            XMLStream.close();
                        }//end of try to close stream
                        catch (IOException ex) {
                            ex.printStackTrace();
                        }//end of catch IOEception
                    }//end of finally block

                    //Removes any existing WLAN profile with the same name as the new Profile
                    String RemoveWLANStaff = "cmd.exe /c netsh wlan delete profile name=" + WS.StaffFileName;
                    String CreateWLANStaff = "cmd.exe /c netsh wlan add profile filename=" + WS.StaffTempDir;
                    p = Runtime.getRuntime().exec(RemoveWLANStaff);
                    System.out.println("Process p = " + p.toString());
                    System.out.println("CreateWLANStaff = " + CreateWLANStaff);
                    p = Runtime.getRuntime().exec(CreateWLANStaff);
                    System.out.println("Process p = " + p.toString());
                }//end of try block for reading and saving the XML to the temp folder

                catch (NullPointerException ex) {
                    System.out.println("Error NullPointerException " + ex.getMessage());
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }//end of catch NullPointerException

                catch (IOException ex) {
                    System.out.println("Error IOException " + ex.getMessage());
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }//end of catch IOException

            }//end of if statement jCheckBoxStaff.isSelected

            if (jCheckBoxCampus_User.isSelected()){

                WifiSetupClass WS;
                WS = new WifiSetupClass();
                Process p = null;
                //reads the XML resource file Wi-Fi-Campus_User.xml
                try {
                    System.out.println("StringTempDir = " + WS.StringTempDir);
                    InputStream XMLStream = null;

                    try {
                        XMLStream = (getClass().getResourceAsStream(WS.Campus_UserFileName + ".xml"));
                        System.out.println("Total file size to read (in bytes) : " + XMLStream.available());
                        Files.copy(XMLStream, WS.Campus_UserTempDir, REPLACE_EXISTING);;
                        jCheckBoxCampus_User.setSelected(false);
                    }//end of try to get resource and save it to temp
                    catch (IOException e) {
                    e.printStackTrace();
                    }//end of catch IOEception
                    finally {

                        try {
                            if (XMLStream != null)
                            XMLStream.close();
                        }//end of try to close stream
                        catch (IOException ex) {
                            ex.printStackTrace();
                        }//end of catch IOEception
                    }
                    //Removes any existing WLAN profile with the same name as the new Profile
                    String RemoveWLANCampus_User = "cmd.exe /c netsh wlan delete profile name=" + WS.Campus_UserFileName;
                    String CreateWLANCampus_User = "cmd.exe /c netsh wlan add profile filename=" + WS.Campus_UserTempDir;
                    p = Runtime.getRuntime().exec(RemoveWLANCampus_User);
                    System.out.println("Process p = " + p.toString());
                    System.out.println("CreateWLANCampus_User = " + CreateWLANCampus_User);
                    p = Runtime.getRuntime().exec(CreateWLANCampus_User);
                    System.out.println("Process p = " + p.toString());
                }//end of try block for reading and saving the XML to the temp folder 

                catch (NullPointerException ex) {
                    System.out.println("Error NullPointerException " + ex.getMessage());
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }//end of catch NullPointerException

                catch (IOException ex) {
                    System.out.println("Error IOException " + ex.getMessage());
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }//end of catch IOException

            }//end of if statement jCheckBoxCampus_User.isSelected
        
        }//end of if statement jOptionPane reply
    //end of jButton_ConnectActionPerformed(IDE disallows comments on Auto-generated brackets)
    }//GEN-LAST:event_jButton_ConnectActionPerformed

    private void jMenuItemFAQPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFAQPageActionPerformed
    if(Desktop.isDesktopSupported()){
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

    private void jMenuItemCampusDirectoryPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCampusDirectoryPageActionPerformed
 
    if(Desktop.isDesktopSupported())
{
        try {
            //opens faculty page in default browser
            Desktop.getDesktop().browse(new URI("https://webfors.fairmontstate.edu/pls/prod_dad/bzpkedir.P_DisplayDirectory"));
        } catch (IOException ex) {
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCampusDirectoryPageActionPerformed

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
            MalwareBytesClass MBytes = new MalwareBytesClass();//initialized MalwareBytesClass
        } catch (URISyntaxException | IOException ex) {
            System.out.println("Error " + ex.getMessage());
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuMalwareBytesActionPerformed

    private void jRadioButtonDefragmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDefragmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonDefragmentActionPerformed

    private void Menu_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ExitActionPerformed
int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to close?", "Close?",  JOptionPane.YES_NO_OPTION);
if (reply == JOptionPane.YES_OPTION)
{
   System.exit(0);
}          // TODO add your handling code here:
    }//GEN-LAST:event_Menu_ExitActionPerformed

    private void jMenuItemPlaceTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPlaceTicketActionPerformed
     int reply = JOptionPane.showConfirmDialog(null, "Did you want to send a support email to: help@fairmontstate.edu?", "Email",  JOptionPane.YES_NO_OPTION);
if (reply == JOptionPane.YES_OPTION)
{
             // TODO add your handling cod
        try {
            SupportTicketClass STC = new SupportTicketClass();        // TODO add your handling code here:
        } catch (URISyntaxException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    }//GEN-LAST:event_jMenuItemPlaceTicketActionPerformed

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
                JFrame frame = new MainJFrame();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Execute;
    private javax.swing.JMenuItem Menu_Exit;
    private javax.swing.ButtonGroup RadiobuttonGroupCleanSweep;
    private javax.swing.JButton jButton_Connect;
    private javax.swing.JCheckBox jCheckBoxCampus_User;
    private javax.swing.JCheckBox jCheckBoxStaff;
    private javax.swing.JCheckBox jCheckBoxStudent;
    private javax.swing.JLabel jLabelCleanSweepDesc1;
    private javax.swing.JLabel jLabelCleanSweepDesc2;
    private javax.swing.JLabel jLabelConnectInstruct1;
    private javax.swing.JLabel jLabelConnectInstruct2;
    private javax.swing.JLabel jLabelWifiDesc1;
    private javax.swing.JLabel jLabelWifiDesc2;
    private javax.swing.JLabel jLabelWifiDesc3;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuDownloads;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItemCampusDirectoryPage;
    private javax.swing.JMenuItem jMenuItemFAQPage;
    private javax.swing.JMenuItem jMenuItemPlaceTicket;
    private javax.swing.JMenuItem jMenuMalwareBytes;
    private javax.swing.JMenuItem jMenuVMWare;
    private javax.swing.JMenuItem jMenuVipreAntivirus;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelWifiUtility;
    private javax.swing.JRadioButton jRadioButtonDefragment;
    private javax.swing.JRadioButton jRadioButtonDiskCheck;
    private javax.swing.JRadioButton jRadioButtonDiskCleaner;
    private javax.swing.JRadioButton jRadioButtonFlushDNS;
    private javax.swing.JRadioButton jRadioButtonRecyclingBin;
    // End of variables declaration//GEN-END:variables
}
