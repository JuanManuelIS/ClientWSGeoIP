
package clientwsgeoip;

import java.net.URL;
import java.util.Scanner;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class ClientWSGeoIP {


    public static void main(String[] args) throws Exception {
        String s = "http://www.webservicex.net/geoipservice.asmx/GetGeoIPContext";
        URL url = new URL(s);
        Scanner scan = new Scanner(url.openStream());
        String source = new String();
        while(scan.hasNext()){
            source+=scan.nextLine();
        }
        
        Serializer serializer = new Persister();
        GeoIP geoip = new GeoIP();
        serializer.read(geoip, source);
        System.out.println(geoip.getCountryName());
        System.out.println(geoip.getCountryCode());
        System.out.println(geoip.getIp());
        System.out.println(geoip.getReturnCode());
        System.out.println(geoip.getReturnCodeDetails());
    }

    
}
