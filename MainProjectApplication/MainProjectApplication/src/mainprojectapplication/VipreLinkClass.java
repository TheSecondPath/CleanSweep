
package mainprojectapplication;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author tmcgee1
 */
public class VipreLinkClass {
   VipreLinkClass() throws URISyntaxException, IOException{
    if(Desktop.isDesktopSupported())
{
  Desktop.getDesktop().browse(new URI("http://www2.fairmontstate.edu/fs_users_only/vipre/"));
}
}
}
