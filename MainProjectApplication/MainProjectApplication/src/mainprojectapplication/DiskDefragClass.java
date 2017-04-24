package mainprojectapplication;

import java.io.IOException;

public class DiskDefragClass {

    DiskDefragClass() {

        
        try {
           
            Runtime runTime = Runtime.getRuntime();
            Process process = runTime.exec("dfrgui.exe");

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
            e.printStackTrace();
        }
    }
}
