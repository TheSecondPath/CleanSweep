/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprojectapplication;

/**
 *
 * @author Server
 */
public class RecyclingBinClass {
    String EmptyRecyclingBin;
    String IconRefresh;

    public RecyclingBinClass() {
        this.EmptyRecyclingBin = "powershell.exe -command \"$Shell"
                + " = New-Object -ComObject Shell.Application;$RecycleBin = "
                + "$Shell.Namespace(0xA);$RecycleBin.Items() | foreach{Remove-Item"
                + " $_.Path -Recurse -Confirm:$false}\"";
        this.IconRefresh = "wmic.exe process where name=\"explorer.exe\" call TERMINATE";
        
    }
}
