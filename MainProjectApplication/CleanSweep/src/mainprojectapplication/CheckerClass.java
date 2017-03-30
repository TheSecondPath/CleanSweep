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
 * @author tmcge_000
 */
public class CheckerClass {
  CheckerClass() {

        String DiskCheck = "cmd.exe /c start cmd.exe /c start chkdsk /f";
        
//creates String to check disk
        Process p = null;
        try {
// Executes All String Commands

            p = Runtime.getRuntime().exec(DiskCheck);
          
            

            //runs null 
        } catch (IOException ex) {
            //catches IO Exceptions
            Logger.getLogger(FlushDNSClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}