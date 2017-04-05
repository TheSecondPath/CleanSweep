
package mainprojectapplication;

public class WifiSetupClass {

    String CreateWLANProfile;
    String SetSecurityParameter;
    
    public WifiSetupClass() {
        this.CreateWLANProfile = "";
        this.SetSecurityParameter = "netsh wlan set profileparameter name=Campus_User authentication=WPA2PSK encryption=aes userOnly";
    }
}