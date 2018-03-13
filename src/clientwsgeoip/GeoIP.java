/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwsgeoip;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


@Root
public class GeoIP {
    
    @Element
    private String ReturnCode;
    
    @Element
    private String ReturnCodeDetails;

    public String getReturnCode() {
        return ReturnCode;
    }

    public void setReturnCode(String ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    public String getReturnCodeDetails() {
        return ReturnCodeDetails;
    }

    public void setReturnCodeDetails(String ReturnCodeDetails) {
        this.ReturnCodeDetails = ReturnCodeDetails;
    }
    
    @Element
    private String IP;
    
    @Element
    private String CountryName;

    public String getIp() {
        return IP;
    }

    public void setIp(String ip) {
        this.IP = IP;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        this.CountryCode = CountryCode;
    }
    
    @Element
    private String CountryCode;
}
