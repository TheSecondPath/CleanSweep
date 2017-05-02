
package mainprojectapplication;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author tmcgee1
 */
public class SupportTicketClass {
   SupportTicketClass() throws URISyntaxException, IOException{
    if(Desktop.isDesktopSupported())
{
  Desktop.getDesktop().browse(new URI("mailto:webmaster@fairmontstate.edu"));
}
}
}